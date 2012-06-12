package br.gov.ce.metrofor.sfd.dao;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.gov.ce.metrofor.sfd.model.Documento;
import br.gov.ce.metrofor.sfd.util.DaoGenerico;

@Component
@RequestScoped
public class DocumentoDao extends DaoGenerico {

//	public Documento selectById(Documento documento) {
////		gerente.getTransaction().begin();
//		documento = gerente.find(documento.getClass(), documento.getId());
////		gerente.getTransaction().commit();
//		return documento;
//	}
	
}
