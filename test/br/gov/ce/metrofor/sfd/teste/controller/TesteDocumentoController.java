package br.gov.ce.metrofor.sfd.teste.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.util.test.MockResult;
import br.gov.ce.metrofor.sfd.controller.DocumentoController;
import br.gov.ce.metrofor.sfd.dao.DocumentoDao;
import br.gov.ce.metrofor.sfd.model.Documento;

public class TesteDocumentoController {
	
	@Mock
	private Result resultMock;
	@Mock
	private DocumentoDao documentoDaoMock;
	@Mock
	private Documento documentoMock;
	@Mock
	private DocumentoController dc;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.resultMock = new MockResult();
//		this.dc = new DocumentoController(this.resultMock, this.documentoDaoMock);
		this.documentoMock = mock(Documento.class);
	}
	
	@Test
	public void criarDocumentoController() {
//		this.dc.documento();
	}
	
	@Test
	public void inserirDocumentoNulo() {
		// enta salvar objeto (Documento) nulo
		this.dc.salvar(null);
		// Recupera o retorno do método testado
		String msgRetorno = (String) this.resultMock.included().get("msg");
		// Testa quantidade de itens do retorno
		assertEquals(1, this.resultMock.included().size());
		// Testa valor de item de retorno
		assertEquals("ERRO: Documento nulo.", msgRetorno);
		// Verifica de método testado foi executado realmente
//		verify(this.dc, times(1)).salvar(null);
	}

	@Test
	public void inserirNovoDocumento() {
		// Setar novo documento (id nulo)
		documentoMock.setId(null);
		// Executa método que será testado
		this.dc.salvar(documentoMock);
		// Recupera o retorno do método testado
		String msgRetorno = (String) this.resultMock.included().get("msg");
		// Testa quantidade de itens do retorno
		assertEquals(1, this.resultMock.included().size());
		// Testa valor de item de retorno
		assertEquals("Novo documento salvo com sucesso.", msgRetorno);
	}

	@Test
	public void atualizarDocumento() {
		// Executa método que será testado
		this.dc.salvar(documentoMock);
		// Recupera o retorno do método testado
		String msgRetorno = (String) this.resultMock.included().get("msg");
		// Testa quantidade de itens do retorno
		assertEquals(1, this.resultMock.included().size());
		// Testa valor de item de retorno
		assertEquals("Documento atualizado com sucesso.", msgRetorno);
	}

	@Test @Ignore
	public void listarDocumentos() {
		// Executa método que será testado
		this.dc.salvar(documentoMock);
		// Recupera o retorno do método testado
		String msgRetorno = (String) this.resultMock.included().get("msg");
		// Testa quantidade de itens do retorno
		assertEquals(1, this.resultMock.included().size());
		// Testa valor de item de retorno
		assertEquals("Documento atualizado com sucesso.", msgRetorno);
	}

}
