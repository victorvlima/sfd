package br.gov.ce.metrofor.sfd.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.gov.ce.metrofor.sfd.dao.DiretoriaDao;
import br.gov.ce.metrofor.sfd.model.Diretoria;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Resource
public class DiretoriaController {

	private Result result;
	private DiretoriaDao diretoriaDao;
	private String msg;
	private Validator validador;

	public DiretoriaController(Result result, DiretoriaDao diretoriaDao,
			Validator validador) {
		this.result = result;
		this.diretoriaDao = diretoriaDao;
		this.validador = validador;
	}

	@Get
	@Path("/diretoria")
	public void formulario() {
	}

	@Post
	@Path("/diretoria/salvar")
	public void salvar(Diretoria diretoria) {
		if (diretoria != null) {
			if (diretoria.getDescricao() == null
					|| diretoria.getDescricao().isEmpty()) {
				validador.add(new ValidationMessage(
						"Informar Descrição da Diretoria", "error"));
			}
			if (diretoria.getSigla() == null || diretoria.getSigla().isEmpty()) {
				validador.add(new ValidationMessage(
						"Informar Sigla da Diretoria", "error"));
			}
			validador.onErrorUsePageOf(this.getClass()).formulario();
			if (diretoria.getId() == null) {
				diretoriaDao.insert(diretoria);
				this.msg = "Nova Diretoria salva com sucesso.";
			} else {
				diretoriaDao.update(diretoria);
				this.msg = "Diretoria " + diretoria.getId().toString()
						+ " atualizada com sucesso.";
			}
		} else {
			this.msg = "ERRO: Diretoria nula.";
		}
		result.include("msg", this.msg).redirectTo(this.getClass())
				.listar();
	}

	@Path("/diretoria/editar/{diretoria.id}")
	public void editar(Diretoria diretoria) {
		diretoria = (Diretoria) diretoriaDao.selectById(diretoria);
		if (diretoria != null) {
			result.include("diretoria", diretoria);
		}
		result.redirectTo(this.getClass()).formulario();
	}

	@Path("/diretorias")
	public void listar() {
		try {
			List<EntidadeBase> diretorias = diretoriaDao
					.selectByNamedQuery("diretorias");
			result.include("diretorias", diretorias);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Path("/diretoria/excluir/{diretoria.id}")
	public void excluir(Diretoria diretoria) {
		diretoriaDao.remove(diretoria);
		diretoria = (Diretoria) diretoriaDao.selectById(diretoria);
		if (diretoria == null) {
			this.msg = "Diretoria excluida com sucesso.";
		}
		result.include("msg", this.msg).redirectTo(this.getClass())
				.listar();
	}

}
