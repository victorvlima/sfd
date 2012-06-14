package br.gov.ce.metrofor.sfd.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DaoGenerico {

	protected EntityManager gerente;

	public DaoGenerico() {
		gerente = Fabrica.getEntityManager();
	}

	public EntidadeBase insert(EntidadeBase entidade) {
		gerente.getTransaction().begin();
		gerente.persist(entidade);
		gerente.getTransaction().commit();
		return entidade;
	}

	public EntidadeBase update(EntidadeBase entidade) {
		gerente.getTransaction().begin();
		entidade = gerente.merge(entidade);
		gerente.getTransaction().commit();
		return entidade;
	}

	public void remove(EntidadeBase entidade) {
		entidade = selectById(entidade);
		gerente.getTransaction().begin();
		gerente.remove(entidade);
		gerente.getTransaction().commit();
	}

	public EntidadeBase selectById(EntidadeBase entidade) {
		// gerente.getTransaction().begin();
		entidade = gerente.find(entidade.getClass(), entidade.getId());
		// gerente.getTransaction().commit();
		return entidade;
	}

	public List<EntidadeBase> selectByNamedQuery(String namedQuery) {
		// gerente.getTransaction().begin();
		List<EntidadeBase> lista = selectByNamedQuery(namedQuery, new Object[0]);
		// gerente.getTransaction().commit();
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<EntidadeBase> selectByNamedQuery(String namedQuery,
			Object... parameters) {
		List<EntidadeBase> list = null;
		try {
			Query query = gerente.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(i + 1, parameters[i]);
				}
			}
			list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

}
