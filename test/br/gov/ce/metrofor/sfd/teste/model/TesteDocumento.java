package br.gov.ce.metrofor.sfd.teste.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.gov.ce.metrofor.sfd.model.Documento;

public class TesteDocumento {
	
	@Mock
	private Documento documentoMock;
	
	private Documento documento;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		documento = new Documento();
	}
	
	@Test
	public void testeAssunto() {
		// Teste em Documento real
		documento.setAssunto("Assunto real");
		assertEquals("Assunto real", documento.getAssunto());
		// Teste em Documento mockado
		when(documentoMock.getAssunto()).thenReturn("Assunto mockado");
		assertEquals("Assunto mockado", documentoMock.getAssunto());
		verify(documentoMock, times(1)).getAssunto();
	}

	@Test
	public void testeData() {
		//
		Date data = new Date();
		documento.setData(data);
		assertEquals(data, documento.getData());
		//
		when(documentoMock.getData()).thenReturn(data);
		assertEquals(data, documentoMock.getData());
		verify(documentoMock, times(1)).getData();
	}

	@Test
	public void testeId() {
		//
		documento.setId(1L);
		assertEquals((Long) 1L, documento.getId());
		//
		when(documentoMock.getId()).thenReturn(2L);
		assertEquals((Long) 2L, documentoMock.getId());
		verify(documentoMock, times(1)).getId();
	}

	@Test
	public void testeInteressado() {
		//
		documento.setInteressado("DET");
		assertEquals("DET", documento.getInteressado());
		//
		when(documentoMock.getInteressado()).thenReturn("GETEC");
		assertEquals("GETEC", documentoMock.getInteressado());
		verify(documentoMock, times(1)).getInteressado();
	}

	@Test
	public void testeNumero() {
		//
		documento.setNumero("2011/Metrofor-010203");
		assertEquals("2011/Metrofor-010203", documento.getNumero());
		//
		when(documentoMock.getNumero()).thenReturn("2012/Metrofor-010203");
		assertEquals("2012/Metrofor-010203", documentoMock.getNumero());
		verify(documentoMock, times(1)).getNumero();
	}

	@Test
	public void testeObservacao() {
		//
		documento.setObservacao("Observação real");
		assertEquals("Observação real", documento.getObservacao());
		//
		when(documentoMock.getObservacao()).thenReturn("Observação mockada");
		assertEquals("Observação mockada", documentoMock.getObservacao());
		verify(documentoMock, times(1)).getObservacao();
	}

	@Test
	public void testeProcesso() {
		//
		documento.setProcesso(true);
		assertEquals(true, documento.getProcesso());
		//
		when(documentoMock.getProcesso()).thenReturn(false);
		assertEquals(false, documentoMock.getProcesso());
		verify(documentoMock, times(1)).getProcesso();
	}

	@Test
	public void testeSpu() {
		//
		documento.setSpu("010.203.040.5060-70809");
		assertEquals("010.203.040.5060-70809", documento.getSpu());
		//
		when(documentoMock.getSpu()).thenReturn("010.2030.40506/0708-09");
		assertEquals("010.2030.40506/0708-09", documentoMock.getSpu());
		verify(documentoMock, times(1)).getSpu();
	}

}
