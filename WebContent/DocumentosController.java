package br.gov.ce.metrofor.sfd.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.gov.ce.metrofor.sfd.dao.DocumentoDao;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Resource
public class DocumentosController {
	
	private Result result;
	private DocumentoDao documentoDao;
	
	public DocumentosController(Result result, DocumentoDao documentoDao) {
		this.result = result;
		this.documentoDao = documentoDao;
	}
	
	@Get("/documentos")
	public void documentos() {
		this.listar();
	}
	
	@Get("/documentos/listar")
	public void listar() {
		List<EntidadeBase> documentos = documentoDao.selectByNamedQuery("documentos");
		result.include("documentos", documentos);
	}
	
}
