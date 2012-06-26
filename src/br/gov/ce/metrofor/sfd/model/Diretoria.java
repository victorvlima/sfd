package br.gov.ce.metrofor.sfd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.gov.ce.metrofor.sfd.util.EntidadeBase;

@Entity
@SequenceGenerator(name="sequence_diretorias", sequenceName="sequence_diretorias", allocationSize=1, initialValue=1)
public class Diretoria extends EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sequence_diretorias")	//(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false, length=10, unique=true)
	private String sigla;
	
	private String descricao;

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
	
}
