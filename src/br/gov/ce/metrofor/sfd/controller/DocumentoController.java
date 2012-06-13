package br.gov.ce.metrofor.sfd.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.gov.ce.metrofor.sfd.dao.DocumentoDao;
import br.gov.ce.metrofor.sfd.model.Documento;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Resource
public class DocumentoController {

	private final Result result;
	private final DocumentoDao documentoDao;
	private String msg;

	public DocumentoController(Result result, DocumentoDao documentoDao) {
		this.result = result;
		this.documentoDao = documentoDao;
	}

	@Get @Path("/documento")
	public void formulario() {
	}

	@Post @Path("/documento/salvar")
	public void salvar(Documento documento) {
		if (documento != null) {
			if (documento.getId() == null) {
				try {
					documentoDao.insert(documento);
					this.msg = "Novo documento salvo com sucesso.";
					
				} catch (Exception e) {
					e.getStackTrace();
				}
			} else {
				try {
					documentoDao.update(documento);
					this.msg = "Documento atualizado com sucesso.";
					
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		} else {
			this.msg = "ERRO: Documento nulo.";
		}
		formulario();
		result.include("msg", this.msg).redirectTo(this.getClass()).formulario();
	}

	@Path("/documento/editar/{documento.id}")
	public void editar(Documento documento) {
		documento = (Documento) documentoDao.selectById(documento);
		if (documento != null) {
			result.include("documento", documento);
		}
		result.redirectTo(this.getClass()).formulario();
	}

	@Get @Path("/documentos")
	public void listar() {
		try {
			List<EntidadeBase> documentos = documentoDao.selectByNamedQuery("documentos");
			result.include("documentos", documentos);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
