package com.garage.controlleur;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.dao.DaoRole;
import com.garage.iservice.IServiceUtilisateur;

@Controller
public class UtilisateurController {

	@Autowired
	private IServiceUtilisateur serviceutilisateur;
	
	@Autowired
	private DaoRole daoRole;
	
	private Utilisateur convertForm(UtilisateurForm utilisateurform) throws Exception {
        Utilisateur user = new Utilisateur();
        user.setId(utilisateurform.getId());
        user.setNom(utilisateurform.getNom());
        user.setPrenom(utilisateurform.getPrenom());;
        user.setUser(utilisateurform.getUser());
        user.setPassword(utilisateurform.getPassword());
        user.setActiveUser(utilisateurform.getActiveUser());
        user.setActiveAngular(utilisateurform.getActiveAngular());
        user.setRoles(utilisateurform.getRoles());
        return user;
    }
	
	@GetMapping("/Utilisateurs/Ajouter")
	public String afficher(Model model) {
		model.addAttribute("listUser", serviceutilisateur.rechercheUtilisateur()); //attribut du fichier html
		model.addAttribute("possibleRoles", daoRole.findExceptAdmin());
		
		model.addAttribute("action", "Ajout");
		if(!model.containsAttribute("userAdd")) {
			UtilisateurForm userForm = new UtilisateurForm();
			userForm.setId(0);
			
			model.addAttribute("userAdd", userForm);
		}
		
		return "listUser"; //correspond au fichier html
	}
	
	@GetMapping("/Utilisateurs/Modifier/{id}")
	public String afficher(@PathVariable final Integer id, Model model) {
		model.addAttribute("listUser", serviceutilisateur.rechercheUtilisateur()); //attribut du fichier html
		model.addAttribute("possibleRoles", daoRole.findExceptAdmin());
		
		model.addAttribute("action", "Modification");
		if(!model.containsAttribute("userModif")) {
			UtilisateurForm userForm = new UtilisateurForm();
			
			if(id == null || id < 2) {
				return this.afficher(model);
			}
			
			final Utilisateur uti = serviceutilisateur.rechercherUtilisateurId(id);
			userForm.setId(uti.getId());
			userForm.setNom(uti.getNom());
			userForm.setPrenom(uti.getPrenom());
			userForm.setUser(uti.getUser());
			userForm.setPassword(uti.getPassword());
			userForm.setActiveUser(uti.getActiveUser());
			userForm.setActiveAngular(uti.getActiveAngular());
			userForm.setRoles(uti.getRoles());
			
			model.addAttribute("action", "Modification");
			model.addAttribute("userModif", userForm);
		}
		
		return "listUser"; //correspond au fichier html
	}
	
	@PostMapping("/Utilisateurs/Ajouter")
	public String ajoutUtilisateur(
			@Valid @ModelAttribute(name = "userAdd") UtilisateurForm userForm,
			BindingResult userResult,
			Model model)
	{
		if(!userResult.hasErrors()) {
			try {
				Utilisateur uti = convertForm(userForm);
				uti.setActiveUser(false);
				uti.setActiveAngular(false);
				serviceutilisateur.creerUtilisateur(uti);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
	
	@PostMapping("/Utilisateurs/Modifier")
	public String modifUtilisateur(
			@Valid @ModelAttribute(name = "userModif") UtilisateurForm userForm,
			BindingResult userResult,
			Model model)
	{
		if(!userResult.hasErrors()) {
			try {
				Utilisateur uti = convertForm(userForm);
				serviceutilisateur.modifierUtilisateur(uti);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
}
