package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Fiche;
import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.FicheForm;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.dao.DaoFiche;
import com.garage.iservice.IServiceFiche;

@Controller
public class FicheController {
	
	@Autowired
	private IServiceFiche servicefiche;

	@Autowired
	private DaoFiche daoFiche;

	private Fiche convertForm(FicheForm ficheForm) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(ficheForm.getDateCreation());
		Fiche fiche = new Fiche();
		fiche.setId(ficheForm.getId());
		fiche.setDescription(ficheForm.getDescription());
		fiche.setDateCreation(date);
		fiche.setClient(ficheForm.getClient());
		fiche.setUtilisateur(ficheForm.getUtilisateur());
		return fiche;
	}

	@GetMapping("/Fiches")
	public String afficher(Model model) {
		model.addAttribute("listFiche", daoFiche.findFiche());
		model.addAttribute("action", "CreerFiche");
		if(model.containsAttribute("ficheForm") == false) {
			FicheForm ficheForm = new FicheForm();
			model.addAttribute("ficheForm", ficheForm);
		}
		return "listFiche";
	}

	@PostMapping("/Fiches")
	public String cloturerFiche(
			@Valid @ModelAttribute(name = "ficheForm") FicheForm ficheForm,
			BindingResult ficheResult,
			Model model)
	{
		try {
			final Fiche fiche = servicefiche.rechercherFicheId(ficheForm.getId());
			servicefiche.cloturerFiche(fiche);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this.afficher(model);
	}
}