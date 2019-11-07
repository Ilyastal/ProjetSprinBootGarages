package com.garage.controlleur;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.iservice.IServiceUtilisateur;

@Controller
public class UtilisateurController {

	@Autowired
	private IServiceUtilisateur serviceutilisateur;
	
	private Utilisateur convertForm(UtilisateurForm utilisateurform) throws Exception {
        
	    
        Utilisateur user = new Utilisateur();
        user.setId(utilisateurform.getId());
        user.setNom(utilisateurform.getNom());
        user.setPrenom(utilisateurform.getPrenom());;
        user.setUser(utilisateurform.getUser());
        user.setPassword(utilisateurform.getPassword());
        return user;
    }
	
	@GetMapping("/Utilisateurs")
	public String afficherCreer(Model model) {
		final List<Utilisateur> luti = serviceutilisateur.rechercheUtilisateur();
		model.addAttribute("listUser", luti); //attribut du fichier html
		model.addAttribute("action", "CreerUser");
		if(model.containsAttribute("userForm") == false) {
			UtilisateurForm userForm = new UtilisateurForm();
			userForm.setId(0);
			model.addAttribute("userForm", userForm);
		}
		return "listUser"; //correspond au fichier html
	}

	//	@GetMapping("/modifierUtilisateur/{id}")
	//	public String modifierUtilisateur(@PathVariable final Integer id, Model model) {
	//		Utilisateur uti = serviceutilisateur.rechercherUtilisateurId(id);
	//
	//		model.addAttribute("listeclasse", null);
	//		model.addAttribute("listeprof", uti);
	//		model.addAttribute("action", "ModifierUser");
	//		if(model.containsAttribute("userForm") == false) {
	//			UtilisateurForm userForm = new UtilisateurForm();
	//			userForm.setNom(uti.getNom());
	//			userForm.setPrenom(uti.getPrenom());
	//			userForm.setUser(uti.getUser());
	//			userForm.setPassword(uti.getPassword());
	//			
	//			model.addAttribute("userForm", userForm);
	//		}
	//		return "modifierUser";
	//	}
	//	
	//	@GetMapping("/supprimerUtilisateur/{id}")
	//	public String supprimerUser(@PathVariable final Integer id, Model model) {
	//		Utilisateur uti = serviceutilisateur.rechercherUtilisateurId(id);
	//		if(uti != null) {
	//			serviceutilisateur.supprimerUtilisateur(uti);;
	//		}
	//		return this.Afficher(model);
	//	}

	@PostMapping("/CreerUtilisateur")
	public String ajoutUtilisateur( 
			@Valid @ModelAttribute(name = "userForm") UtilisateurForm userForm,
			BindingResult presult,
			Model model)
	{
		if(!presult.hasErrors()) {
			try
			{
				Utilisateur uti = convertForm(userForm);
				serviceutilisateur.creerUtilisateur(uti);
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return this.afficherCreer(model);
	}

//	@PostMapping("/ModifierClasse")
//	public String modifieUtilisateur( 
//			@Valid @ModelAttribute(name = "userForm") UtilisateurForm userForm,
//			BindingResult presult,
//			Model model)
//	{
//		if(!presult.hasErrors()) {
//			try
//			{
//				Utilisateur uti = convertForm(userForm);
//				serviceutilisateur.creerUtilisateur(uti);
//			}
//			catch(Exception e) {
//				System.err.println(e.getMessage());
//			}
//		}
//		return this.afficherCreer(model);
//	}

}
