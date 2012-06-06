package br.gov.ce.metrofor.sfd.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	private static EntityManagerFactory fabrica;

	public Fabrica() {
	}

	public static EntityManager getEntityManager() {
		try {
			Class.forName("org.postgresql.Driver");
//			conn = DriverManager.getConnection("jdbc:postgresql://localhost/proc", "proc", "proc");
//			Statement stmt = conn.createStatement();
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("sfd");
		}
		return fabrica.createEntityManager();
	}
	
}
