package com.project.voitures.service;

import java.util.List;

import com.project.voitures.entities.Modele;
import com.project.voitures.entities.Voitures;

public interface VoitureService {

	Voitures saveVoiture(Voitures v);
	Voitures updateVoiture(Voitures v);
	Voitures getVoiture(Long id);
	List<Voitures> getAllVoitures();
	void deletVoiture(Voitures v);
	void deletVoitureById(Long id);
	//ces methodes sont dans repository on a les importer
	List<Voitures> findByNom(String nom);
	List<Voitures> findByNomContains(String nom);
	List<Voitures> findByNomNum (String nom, int num);
	List<Voitures> findByModele (Modele modele);
	List<Voitures> findByModeleIdModel(Long id);
	List<Voitures> findByOrderByNomAsc();
	List<Voitures> trierVoituresNomSerie ();
	
}
