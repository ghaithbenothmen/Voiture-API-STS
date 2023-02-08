package com.project.voitures.entities;

import org.springframework.data.rest.core.config.Projection;

public interface VoitureProjection {

	@Projection(name = "nomVoit", types = { Voitures.class })
	public interface ProduitProjection {
	public String getNom();
	}

}
