package br.gov.ce.metrofor.sfd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.NotNull;

import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Entity
@SequenceGenerator(name="sequence_documentos", sequenceName="sequence_documentos", allocationSize=1, initialValue=1)
public class Documento extends EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sequence_documentos")	//(strategy=GenerationType.AUTO)
	private Long id;
	
//	@NotNull @Size(max=10)
	private String numero;
	
	@NotNull
	private String assunto;
	
//	@Column(nullable=false)
	private String interessado;
	
//	@Column(nullable=false)
	private String spu;
	
//	@Column(nullable=true)
	private String observacao;
	
//	@Column(nullable=false)
	private Boolean processo;
	
//	@Column(nullable=false)
	private Date data;

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
	
}
