package com.project.voitures.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.voitures.entities.Voitures;
import com.project.voitures.service.VoitureService;


@RestController   //pour dire que cet classe contient des web services Rest
@RequestMapping("/api")   //pour acceder dans URL (localhost:8080/voitures/api ->le path /voitures
@CrossOrigin		//permet tous les adresse de consomer ces web service REST
public class VoitureRESTController {

	@Autowired
	VoitureService voitureService;
	
	//recupere tous les voitures
	@RequestMapping(method = RequestMethod.GET)
	public List<Voitures> getAllVoitures(){
		return voitureService.getAllVoitures();	
	}
	
	//get voiture avec id
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Voitures getProduitById(@PathVariable("id") Long id) {
	return voitureService.getVoiture(id);
	 }
	
	//cree voiture 
	@RequestMapping(method = RequestMethod.POST)
	public Voitures createVoiture(@RequestBody Voitures voiture) {
	return voitureService.saveVoiture(voiture);
	}
	
	//updae voiture 
	@RequestMapping(method = RequestMethod.PUT)
	public Voitures updateVoiture(@RequestBody Voitures voiture) {
	return voitureService.updateVoiture(voiture);
	}
	
	//supprimer voiture
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") Long id)
	{
	voitureService.deletVoitureById(id);
	}
	
	//recupere a partire entite Modele 
	@RequestMapping(value="/voitureModele/{idModel}",method = RequestMethod.GET)
	public List<Voitures> getVoitureByModeleId(@PathVariable("idModel") Long idCat) {
	return voitureService.findByModeleIdModel(idCat);
	}
}
