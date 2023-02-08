package com.project.voitures;


import java.util.List;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.voitures.entities.Modele;
import com.project.voitures.entities.Voitures;
import com.project.voitures.repos.VoitureRepository;

@SpringBootTest
class VoituresApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	
	
	@Test
	public void testCreatevoiture() {
	//Modele mod = new Modele(2,"marcedes","class",300,null);
	Voitures car = new Voitures((long) 12, 133, "efr", "efr", false, false, false, false, false, false, false, false, null); //on remple les champs
	voitureRepository.save(car);
	}

	@Test
	public void testFindVoiture()
	{
	Voitures v = voitureRepository.findById(1L).get(); //L:pour dire de type long --- get():pour devienne d'une class Voiture
	System.out.println(v);  //il va implementer la methode toString 
	}

	@Test
	public void testUpdateVoiture()
	{
	Voitures v = voitureRepository.findById(1L).get();
	v.setNumSerie(100);
	voitureRepository.save(v);
	
	System.out.println(v);
	}

	@Test
	public void testDeleteVoiture()
	{
	voitureRepository.deleteById(11L);
	}
	
	@Test
	public void testListerTousVoiture()
	{
	List<Voitures> voitures = voitureRepository.findAll();
	for (Voitures v : voitures)
		{
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByNomVoiture()
	{
	List<Voitures> voitures = voitureRepository.findByNom("marcedes");
	for (Voitures v : voitures)
		{
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByNomVoitureContient()
	{
	List<Voitures> voitures = voitureRepository.findByNomContains("a");
	for (Voitures v : voitures)
		{
			System.out.println(v);
		}
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Voitures> voits = voitureRepository.findByNomNum("audi", 100);
	for (Voitures v : voits)
	{
	System.out.println(v);
	}
	}

	@Test
	public void testFindByModele()
	{
	Modele mod = new Modele();
	mod.setIdModel(1L);
	List<Voitures> voits = voitureRepository.findByModele(mod);
	for (Voitures v : voits)
	{
	System.out.println(v);
	}
	}

	@Test
	public void testFindByCategorieIdCat()
	{
	List<Voitures> voits = voitureRepository.findByModeleIdModel(1L);
	for (Voitures v : voits)
	{
	System.out.println(v);
	}
	 }


	
//Trie
	
	@Test
	public void testfindByOrderByNomAsc()
	{
	List<Voitures> voits =
	voitureRepository.findByOrderByNomAsc();
	for (Voitures v : voits)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testTrierVoituresNomSerie()
	{
	List<Voitures> voits = voitureRepository.trierVoituresNomSerie();
	for (Voitures v : voits)
	{
	System.out.println(v);
	}
	}

}
