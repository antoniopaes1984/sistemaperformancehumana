package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="circunferencia")
@SequenceGenerator(name="seq_circunferencia", sequenceName = "seq_circunferencia", allocationSize = 1, initialValue = 1)
public class Circunferencia implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_circunferencia")
	private long codCircunferencia; 
	private double cirOmbro;
	private double cirTorax;
	private double cirBracoDirRelax; 
	private double cirBracoEsqRelax; 
	private double cirBracoDirCont; 
	private double cirBracoEsqCont; 
	private double cirAntebracoDir; 
	private double cirAntebracoEsq;
	private double cirCintura;
	private double cirAbdomen;
	private double cirIliaco;
	private double cirQuadril;
	private double cirCoxaProxDir;
	private double cirCoxaProxEsq;
	private double cirCoxaMediaDir;
	private double cirCoxaMediaEsq;
	private double cirCoxaDistalDir;
	private double cirCoxaDistalEsq;
	private double cirPanturrilhaDir;
	private double cirPanturrilhaEsq;
	private double relacaoCinturaQuadril;
	private String classRelacaoCinturaQuadril;
	private double relacaoCirCintura;
	private String classRelacaoCirCintura;
	private double relacaoCinturaEstatura;
	private String classRelacaoCinturaEstatura;
	private double indiceConicidade;
	private String classIndiceConicidade;
	public long getCodCircunferencia() {
		return codCircunferencia;
	}
	public void setCodCircunferencia(long codCircunferencia) {
		this.codCircunferencia = codCircunferencia;
	}
	public double getCirOmbro() {
		return cirOmbro;
	}
	public void setCirOmbro(double cirOmbro) {
		this.cirOmbro = cirOmbro;
	}
	public double getCirTorax() {
		return cirTorax;
	}
	public void setCirTorax(double cirTorax) {
		this.cirTorax = cirTorax;
	}
	public double getCirBracoDirRelax() {
		return cirBracoDirRelax;
	}
	public void setCirBracoDirRelax(double cirBracoDirRelax) {
		this.cirBracoDirRelax = cirBracoDirRelax;
	}
	public double getCirBracoEsqRelax() {
		return cirBracoEsqRelax;
	}
	public void setCirBracoEsqRelax(double cirBracoEsqRelax) {
		this.cirBracoEsqRelax = cirBracoEsqRelax;
	}
	public double getCirBracoDirCont() {
		return cirBracoDirCont;
	}
	public void setCirBracoDirCont(double cirBracoDirCont) {
		this.cirBracoDirCont = cirBracoDirCont;
	}
	public double getCirBracoEsqCont() {
		return cirBracoEsqCont;
	}
	public void setCirBracoEsqCont(double cirBracoEsqCont) {
		this.cirBracoEsqCont = cirBracoEsqCont;
	}
	public double getCirAntebracoDir() {
		return cirAntebracoDir;
	}
	public void setCirAntebracoDir(double cirAntebracoDir) {
		this.cirAntebracoDir = cirAntebracoDir;
	}
	public double getCirAntebracoEsq() {
		return cirAntebracoEsq;
	}
	public void setCirAntebracoEsq(double cirAntebracoEsq) {
		this.cirAntebracoEsq = cirAntebracoEsq;
	}
	public double getCirCintura() {
		return cirCintura;
	}
	public void setCirCintura(double cirCintura) {
		this.cirCintura = cirCintura;
	}
	public double getCirAbdomen() {
		return cirAbdomen;
	}
	public void setCirAbdomen(double cirAbdomen) {
		this.cirAbdomen = cirAbdomen;
	}
	public double getCirIliaco() {
		return cirIliaco;
	}
	public void setCirIliaco(double cirIliaco) {
		this.cirIliaco = cirIliaco;
	}
	public double getCirQuadril() {
		return cirQuadril;
	}
	public void setCirQuadril(double cirQuadril) {
		this.cirQuadril = cirQuadril;
	}
	public double getCirCoxaProxDir() {
		return cirCoxaProxDir;
	}
	public void setCirCoxaProxDir(double cirCoxaProxDir) {
		this.cirCoxaProxDir = cirCoxaProxDir;
	}
	public double getCirCoxaProxEsq() {
		return cirCoxaProxEsq;
	}
	public void setCirCoxaProxEsq(double cirCoxaProxEsq) {
		this.cirCoxaProxEsq = cirCoxaProxEsq;
	}
	public double getCirCoxaMediaDir() {
		return cirCoxaMediaDir;
	}
	public void setCirCoxaMediaDir(double cirCoxaMediaDir) {
		this.cirCoxaMediaDir = cirCoxaMediaDir;
	}
	public double getCirCoxaMediaEsq() {
		return cirCoxaMediaEsq;
	}
	public void setCirCoxaMediaEsq(double cirCoxaMediaEsq) {
		this.cirCoxaMediaEsq = cirCoxaMediaEsq;
	}
	public double getCirCoxaDistalDir() {
		return cirCoxaDistalDir;
	}
	public void setCirCoxaDistalDir(double cirCoxaDistalDir) {
		this.cirCoxaDistalDir = cirCoxaDistalDir;
	}
	public double getCirCoxaDistalEsq() {
		return cirCoxaDistalEsq;
	}
	public void setCirCoxaDistalEsq(double cirCoxaDistalEsq) {
		this.cirCoxaDistalEsq = cirCoxaDistalEsq;
	}
	public double getCirPanturrilhaDir() {
		return cirPanturrilhaDir;
	}
	public void setCirPanturrilhaDir(double cirPanturrilhaDir) {
		this.cirPanturrilhaDir = cirPanturrilhaDir;
	}
	public double getCirPanturrilhaEsq() {
		return cirPanturrilhaEsq;
	}
	public void setCirPanturrilhaEsq(double cirPanturrilhaEsq) {
		this.cirPanturrilhaEsq = cirPanturrilhaEsq;
	}
	public double getRelacaoCinturaQuadril() {
		return relacaoCinturaQuadril;
	}
	public void setRelacaoCinturaQuadril(double relacaoCinturaQuadril) {
		this.relacaoCinturaQuadril = relacaoCinturaQuadril;
	}
	public String getClassRelacaoCinturaQuadril() {
		return classRelacaoCinturaQuadril;
	}
	public void setClassRelacaoCinturaQuadril(String classRelacaoCinturaQuadril) {
		this.classRelacaoCinturaQuadril = classRelacaoCinturaQuadril;
	}
	public double getRelacaoCirCintura() {
		return relacaoCirCintura;
	}
	public void setRelacaoCirCintura(double relacaoCirCintura) {
		this.relacaoCirCintura = relacaoCirCintura;
	}
	public String getClassRelacaoCirCintura() {
		return classRelacaoCirCintura;
	}
	public void setClassRelacaoCirCintura(String classRelacaoCirCintura) {
		this.classRelacaoCirCintura = classRelacaoCirCintura;
	}
	public double getRelacaoCinturaEstatura() {
		return relacaoCinturaEstatura;
	}
	public void setRelacaoCinturaEstatura(double relacaoCinturaEstatura) {
		this.relacaoCinturaEstatura = relacaoCinturaEstatura;
	}
	public String getClassRelacaoCinturaEstatura() {
		return classRelacaoCinturaEstatura;
	}
	public void setClassRelacaoCinturaEstatura(String classRelacaoCinturaEstatura) {
		this.classRelacaoCinturaEstatura = classRelacaoCinturaEstatura;
	}
	public double getIndiceConicidade() {
		return indiceConicidade;
	}
	public void setIndiceConicidade(double indiceConicidade) {
		this.indiceConicidade = indiceConicidade;
	}
	public String getClassIndiceConicidade() {
		return classIndiceConicidade;
	}
	public void setClassIndiceConicidade(String classIndiceConicidade) {
		this.classIndiceConicidade = classIndiceConicidade;
	}
	
	

}
