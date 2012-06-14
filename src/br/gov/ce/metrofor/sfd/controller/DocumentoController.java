package br.gov.ce.metrofor.sfd.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.gov.ce.metrofor.sfd.dao.DocumentoDao;
import br.gov.ce.metrofor.sfd.model.Documento;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Resource
public class DocumentoController {

	private final Result result;
	private final DocumentoDao documentoDao;
	private final Validator validador;
	private String msg;

	public DocumentoController(Result result, DocumentoDao documentoDao, Validator validador) {
		this.result = result;
		this.documentoDao = documentoDao;
		this.validador = validador;
	}

	@Get
	@Path("/documento")
	public void formulario() {
	}

	@Post
	@Path("/documento/salvar")
	public void salvar(final Documento documento) {
		validador.checking(new Validations(){{
			that(documento.getAssunto().isEmpty(), "erro", "documento.assunto.nulo");
		}});
		validador.onErrorUsePageOf(this).formulario();
		if (documento != null) {
			if (documento.getId() == null) {
				documentoDao.insert(documento);
				this.msg = "Novo documento salvo com sucesso.";
			} else {
				documentoDao.update(documento);
				this.msg = "Documento " + documento.getId().toString()
						+ " atualizado com sucesso.";
			}
		} else {
			this.msg = "ERRO: Documento nulo.";
		}
		result.include("msg", this.msg).redirectTo(this.getClass())
				.formulario();
	}

	@Path("/documento/editar/{documento.id}")
	public void editar(Documento documento) {
		documento = (Documento) documentoDao.selectById(documento);
		if (documento != null) {
			result.include("documento", documento);
		}
		result.redirectTo(this.getClass()).formulario();
	}

	@Path("/documentos")
	public void listar() {
		try {
			List<EntidadeBase> documentos = documentoDao
					.selectByNamedQuery("documentos");
			result.include("documentos", documentos);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
