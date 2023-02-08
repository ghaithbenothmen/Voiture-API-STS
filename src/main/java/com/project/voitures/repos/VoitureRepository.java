package com.project.voitures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.voitures.entities.Modele;
import com.project.voitures.entities.Voitures;

@RepositoryRestResource(path = "rest") //ajouter Spring Data Rest
public interface VoitureRepository extends JpaRepository<Voitures, Long> {

	List<Voitures> findByNom(String nom);
	List<Voitures> findByNomContains(String nom); //liste qui contion la variable nom
	
	
	/*@Query("select v from Voitures v where v.nom like %?1 and v.numSerie > ?2") //1 pour dire 1er variable et 2 pour dire 2eme variable
	List<Voitures> findByNomNum (String nom, int num);*/
	
	//2eme methode preferer
	@Query("select v from Voitures v where v.nom like %:nom and v.numSerie > :num")
	List<Voitures> findByNomNum (@Param("nom") String nom,@Param("num") int num);
	
	//find by entity
	
	@Query("select v from Voitures v where v.modele = ?1")
	List<Voitures> findByModele (Modele modele);
	
	//find by id entity
	List<Voitures> findByModeleIdModel(Long id);
	

	//Trie les voitures selon leur nom
	List<Voitures> findByOrderByNomAsc();
	
	//2eme methode de trie
	
	@Query("select v from Voitures v order by v.nom ASC, v.numSerie DESC")
	List<Voitures> trierVoituresNomSerie ();



	
}
