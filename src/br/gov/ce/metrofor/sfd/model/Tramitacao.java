package br.gov.ce.metrofor.sfd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Entity
@SequenceGenerator(name="sequence_tramitacoes", sequenceName="sequence_tramitacoes", allocationSize=1, initialValue=1)
public class Tramitacao extends EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sequence_tramitacoes")	//(strategy=GenerationType.AUTO)
	private Long id;
	
	private Documento documento;
	
	private Gerencia gerenciaOrigem;
	
	private Gerencia gerenciaDestino;
	
	private Date dataHora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Gerencia getGerenciaOrigem() {
		return gerenciaOrigem;
	}

	public void setGerenciaOrigem(Gerencia gerenciaOrigem) {
		this.gerenciaOrigem = gerenciaOrigem;
	}

	public Gerencia getGerenciaDestino() {
		return gerenciaDestino;
	}

	public void setGerenciaDestino(Gerencia gerenciaDestino) {
		this.gerenciaDestino = gerenciaDestino;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
//		this.dataHora = dataHora;
		this.dataHora = new Date();
	}
	
}
