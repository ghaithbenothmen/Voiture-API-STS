package com.project.voitures.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Modele {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idModel;
	
	private String marque;
	private String type;
	private float prixJour;
	
	@OneToMany ( mappedBy = "modele") //le meme nom dans la classe Voitures "modele"
	@JsonIgnore //ignorer le boucle infinie et mettre sous forme json
	private List<Voitures> voitures;
	

	
	
}
