package br.gov.ce.metrofor.sfd.teste.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.util.test.MockResult;
import br.gov.ce.metrofor.sfd.controller.IndexController;

public class TesteIndexController {
	
	@Mock
	private Result resultMock;
	
	@Mock
	private IndexController ic;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.resultMock = new MockResult();
		this.ic = new IndexController(this.resultMock);
	}
	
	@Test
	public void testIndexController() {
		assertNotNull(this.ic);
	}

	@Test
	public void testIndex() {
		doNothing().when(this.resultMock).nothing();
		this.resultMock.nothing();
		verify(this.resultMock, times(1)).nothing();
	}

}
