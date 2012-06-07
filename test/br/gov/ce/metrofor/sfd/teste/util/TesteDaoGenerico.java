package br.gov.ce.metrofor.sfd.teste.util;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.gov.ce.metrofor.sfd.util.DaoGenerico;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

public class TesteDaoGenerico {
	
	@Mock
	private DaoGenerico daoGenericoMock;
	
	private EntidadeBase entidadeBase;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
//		entidadeBase = (EntidadeBase) new Object(); 
	}
	
	@Test
	public void testDaoGenerico() {
		this.daoGenericoMock = new DaoGenerico();
		assertNotNull(this.daoGenericoMock);
	}
	
	@Test
	public void testInsertNullObject() {
		doNothing().when(this.daoGenericoMock).insert(null);
		this.daoGenericoMock.insert(null);
		verify(this.daoGenericoMock, times(1)).insert(null);
	}
	@Test
	public void testInsertObject() {
		doNothing().when(this.daoGenericoMock).insert(entidadeBase);
		this.daoGenericoMock.insert(entidadeBase);
		verify(this.daoGenericoMock, times(1)).insert(entidadeBase);
	}
	
	@Test
	public void testUpdateNullObject() {
		doNothing().when(this.daoGenericoMock).update(null);
		this.daoGenericoMock.update(null);
		verify(this.daoGenericoMock, times(1)).update(null);
	}
	@Test
	public void testUpdateObject() {
		doNothing().when(this.daoGenericoMock).update(entidadeBase);
		this.daoGenericoMock.update(entidadeBase);
		verify(this.daoGenericoMock, times(1)).update(entidadeBase);
	}
	
}
