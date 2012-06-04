package br.gov.ce.metrofor.sfd.teste.dao;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.gov.ce.metrofor.sfd.dao.DocumentoDao;
import br.gov.ce.metrofor.sfd.model.Documento;

public class TesteDocumentoDao {
	
	@Mock
	private DocumentoDao documentoDaoMock;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testDocumentoDao() {
		this.documentoDaoMock = new DocumentoDao();
		assertNotNull(this.documentoDaoMock);
	}
	
	@Test
	public void testInsert() {
		doNothing().when(this.documentoDaoMock).insert(any(Documento.class));
		this.documentoDaoMock.insert(Documento.class);
		verify(this.documentoDaoMock, times(1)).insert(Documento.class);
	}

	@Test
	public void testUpdate() {
		doNothing().when(this.documentoDaoMock).update(any(Documento.class));
		this.documentoDaoMock.update(Documento.class);
		verify(this.documentoDaoMock, times(1)).update(Documento.class);
	}
	
}
