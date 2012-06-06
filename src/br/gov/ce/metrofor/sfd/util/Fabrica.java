package br.gov.ce.metrofor.sfd.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	private static EntityManagerFactory fabrica;

	public Fabrica() {
	}

	public static EntityManager getEntityManager() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("sfd");
		}
		return fabrica.createEntityManager();
	}
	
}
