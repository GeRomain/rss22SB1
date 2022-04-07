package fr.univrouen.rss22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSGetController 
{
	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des flux RSS";
	}
	@GetMapping("/id")
	public String getRSSinXML() {
		return "Détail du contenu RSS demandé";
	}

	@GetMapping("/guid")
	public String getRSSinXML(
			@RequestParam(value = "guid") String texte) {
		return ("Détail du flux RSS demandé : " + texte);
	}
	
	@GetMapping("/test")
	public String getTestinXML(
			@RequestParam(value = "nb") int nombre,
	        @RequestParam(value = "search") String texte){
		return ("Test : " + "\n"
			    + "guid = " + nombre + "\n"
			    + "titre = " + texte);
	}
}