package br.gov.ce.metrofor.sfd.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Fabrica {

	private static EntityManagerFactory fabrica = null;
	private static EntityManager entidade = null;
	
	public Fabrica() {
	}

	public static EntityManager getEntityManager() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("sfd");
			entidade = fabrica.createEntityManager();
		}
		return entidade;
	}

	public static void closeEntityManager() {
		entidade.close();
		fabrica.close();
	}

}
