package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "consideracoes_gerais")
@SequenceGenerator(name = "seq_consideracoes", sequenceName = "seq_consideracoes", allocationSize = 1, initialValue = 1)
public class ConsideracoesGerais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_consideracoes")
	private long codConsideracoes;
    
    private String textoConsideracoes;

	public long getCodConsideracoes() {
		return codConsideracoes;
	}

	public void setCodConsideracoes(long codConsideracoes) {
		this.codConsideracoes = codConsideracoes;
	}

	public String getTextoConsideracoes() {
		return textoConsideracoes;
	}

	public void setTextoConsideracoes(String textoConsideracoes) {
		this.textoConsideracoes = textoConsideracoes;
	}
    
    

}
