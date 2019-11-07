package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.iservice.IServiceUtilisateur;
import com.springboot.bean.Professeur;
import com.springboot.controller.form.ProfesseurForm;
import com.springboot.enums.Genre;

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
}
