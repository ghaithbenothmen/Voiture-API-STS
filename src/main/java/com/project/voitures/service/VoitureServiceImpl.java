package com.project.voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.voitures.entities.Modele;
import com.project.voitures.entities.Voitures;
import com.project.voitures.repos.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService{
	
@Autowired	
VoitureRepository voitureRepository;

	
	@Override
	public Voitures saveVoiture(Voitures v) {
		
		return voitureRepository.save(v);
	}

	@Override
	public Voitures updateVoiture(Voitures v) {
		
		return voitureRepository.save(v);
	}

	@Override
	public Voitures getVoiture(Long id) {
		
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voitures> getAllVoitures() {
		
		return voitureRepository.findAll();
	}

	@Override
	public void deletVoiture(Voitures v) {
		voitureRepository.delete(v);
		
	}

	@Override
	public void deletVoitureById(Long id) {
		voitureRepository.deleteById(id);
		
	}

	@Override
	public List<Voitures> findByNom(String nom) {
		
		return voitureRepository.findByNom(nom);
	}

	@Override
	public List<Voitures> findByNomContains(String nom) {
		
		return voitureRepository.findByNomContains(nom);
	}

	@Override
	public List<Voitures> findByNomNum(String nom, int num) {
		
		return voitureRepository.findByNomNum(nom, num);
	}

	@Override
	public List<Voitures> findByModele(Modele modele) {
		
		return voitureRepository.findByModele(modele);
	}

	@Override
	public List<Voitures> findByModeleIdModel(Long id) {
		
		return voitureRepository.findByModeleIdModel(id);
	}

	@Override
	public List<Voitures> findByOrderByNomAsc() {
		
		return voitureRepository.findByOrderByNomAsc();
	}

	@Override
	public List<Voitures> trierVoituresNomSerie() {
		
		return voitureRepository.trierVoituresNomSerie();
	}

}
