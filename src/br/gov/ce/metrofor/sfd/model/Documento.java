package br.gov.ce.metrofor.sfd.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Entity
@SequenceGenerator(name="sequence_documentos", sequenceName="sequence_documentos", allocationSize=1, initialValue=1)
public class Documento extends EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sequence_documentos")
	private Long id;
	
	private String numero;
	
	private String assunto;
	
	private String interessado;
	
	private String spu;
	
	private String observacao;
	
	private Boolean processo;
	
	private Date data;
	
	@OneToMany(mappedBy="documento", fetch=FetchType.LAZY)
	private Collection<Tramitacao> tramitacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getInteressado() {
		return interessado;
	}

	public void setInteressado(String interessado) {
		this.interessado = interessado;
	}

	public String getSpu() {
		return spu;
	}

	public void setSpu(String spu) {
		this.spu = spu;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getProcesso() {
		return processo;
	}

	public void setProcesso(Boolean processo) {
		this.processo = processo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tramitacao getTramitacao() {
		return (Tramitacao) tramitacao;
	}

	@SuppressWarnings("unchecked")
	public void setTramitacao(Tramitacao tramitacao) {
		this.tramitacao = (Collection<Tramitacao>) tramitacao;
	}

}
