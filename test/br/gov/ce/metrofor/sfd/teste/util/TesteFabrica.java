package br.gov.ce.metrofor.sfd.teste.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.gov.ce.metrofor.sfd.util.Fabrica;

public class TesteFabrica {
	
	@Mock
	private Fabrica fabricaMock;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFabrica() {
		this.fabricaMock = new Fabrica();
		assertNotNull(this.fabricaMock);
	}
	
	@Test @Ignore
	public void testGetEntityManager() {
		fail("implementar!");
	}
	
}
