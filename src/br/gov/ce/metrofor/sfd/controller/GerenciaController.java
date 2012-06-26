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
import br.gov.ce.metrofor.sfd.dao.GerenciaDao;
import br.gov.ce.metrofor.sfd.model.Diretoria;
import br.gov.ce.metrofor.sfd.model.Gerencia;
import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Resource
public class GerenciaController {

	private Result result;
	private GerenciaDao gerenciaDao;
	private DiretoriaDao diretoriaDao;
	private String msg;
	private Validator validador;

	public GerenciaController(Result result, GerenciaDao gerenciaDao,
			DiretoriaDao diretoriaDao, Validator validador) {
		this.result = result;
		this.gerenciaDao = gerenciaDao;
		this.diretoriaDao = diretoriaDao;
		this.validador = validador;
	}

	@Get
	@Path("/gerencia")
	public void formulario() {
		List<EntidadeBase> diretorias = diretoriaDao
				.selectByNamedQuery("diretorias");
		result.include("diretorias", diretorias);
	}

	@Post
	@Path("/gerencia/salvar")
	public void salvar(Gerencia gerencia) {
		gerencia.setDiretoria((Diretoria) diretoriaDao.selectById(gerencia.getDiretoria()));
		if (gerencia.getDescricao() == null
				|| gerencia.getDescricao().isEmpty()) {
			validador.add(new ValidationMessage(
					"Informar Descrição da Gerência", "error"));
		}
		if (gerencia.getSigla() == null || gerencia.getSigla().isEmpty()) {
			validador.add(new ValidationMessage("Informar Sigla da Gerência",
					"error"));
		}
		validador.onErrorRedirectTo(this.getClass()).formulario();
		if (gerencia.getId() == null) {
			gerenciaDao.insert(gerencia);
			this.msg = "Nova Gerência salva com sucesso.";
		} else {
			gerenciaDao.update(gerencia);
			this.msg = "Gerência " + gerencia.getId().toString()
					+ " atualizada com sucesso.";
		}
		result.include("msg", this.msg).redirectTo(this.getClass()).listar();
	}

	@Path("/gerencia/editar/{gerencia.id}")
	public void editar(Gerencia gerencia) {
		gerencia = (Gerencia) gerenciaDao.selectById(gerencia);
		if (gerencia != null) {
			result.include("gerencia", gerencia);
		}
		result.redirectTo(this.getClass()).formulario();
	}

	@Path("/gerencias")
	public void listar() {
		try {
			List<EntidadeBase> diretorias = gerenciaDao
					.selectByNamedQuery("gerencias");
			result.include("gerencias", diretorias);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Path("/gerencia/excluir/{gerencia.id}")
	public void excluir(Gerencia gerencia) {
		gerenciaDao.remove(gerencia);
		gerencia = (Gerencia) gerenciaDao.selectById(gerencia);
		if (gerencia == null) {
			this.msg = "Gerência excluida com sucesso.";
		}
		result.include("msg", this.msg).redirectTo(this.getClass()).listar();
	}

}
