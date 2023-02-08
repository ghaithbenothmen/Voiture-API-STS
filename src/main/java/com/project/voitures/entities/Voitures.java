package com.project.voitures.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Voitures {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numSerie;
	private String numImm; 
	private String nom;
	private boolean climatiseur;
	private boolean porteElectriques;
	private boolean airbag;
	private boolean vitresElectriques;
	private boolean lecteurCD;
	private boolean fermetureCentral;
	private boolean freinAssiste;
	private boolean directionAssiste;
	
	@ManyToOne
	private Modele modele;
	
	@Override
	public String toString() {
		return "Voitures [id=" + id + ", numSerie=" + numSerie + ", numImm=" + numImm + ", nom=" + nom
				+ ", climatiseur=" + climatiseur + ", porteElectriques=" + porteElectriques + ", airbag=" + airbag
				+ ", vitresElectriques=" + vitresElectriques + ", lecteurCD=" + lecteurCD + ", fermetureCentral="
				+ fermetureCentral + ", freinAssiste=" + freinAssiste + ", directionAssiste=" + directionAssiste +  "]";
	}

	
	

	
	


	


	
	
	
	

	


	
	

}
