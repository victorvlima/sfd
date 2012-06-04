package br.gov.ce.metrofor.sfd.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.gov.ce.metrofor.sfd.teste.controller.TesteDocumentoController;
import br.gov.ce.metrofor.sfd.teste.controller.TesteIndexController;
import br.gov.ce.metrofor.sfd.teste.dao.TesteDocumentoDao;
import br.gov.ce.metrofor.sfd.teste.model.TesteDocumento;
import br.gov.ce.metrofor.sfd.teste.util.TesteDaoGenerico;
import br.gov.ce.metrofor.sfd.teste.util.TesteFabrica;

@RunWith(Suite.class)
@SuiteClasses({ 
	TesteDocumentoController.class,
	TesteIndexController.class,
	
	TesteDocumentoDao.class,
	
	TesteDocumento.class,
	
	TesteDaoGenerico.class,
	TesteFabrica.class,
})
public class AllTests {
}
