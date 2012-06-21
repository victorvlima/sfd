package br.gov.ce.metrofor.sfd.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Entity
@SequenceGenerator(name="sequence_gerencias", sequenceName="sequence_gerencias", allocationSize=1, initialValue=1)
public class Gerencia extends EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sequence_gerencias")	//(strategy=GenerationType.AUTO)
	private Long id;
	
	private String sigla;
	
	private String descricao;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Diretoria diretoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Diretoria getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(Diretoria diretoria) {
		this.diretoria = diretoria;
	}
	
}
