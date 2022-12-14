package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="teste_cardio")
@SequenceGenerator(name = "seq_teste_cardio", sequenceName = "seq_teste_cardio", allocationSize = 1, initialValue = 1)
public class TesteCardio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teste_cardio")
	private long codTeste;
    private String formulaUsada;
    private int fcTeste;
    private double cargaKg;
    private double cargaWatts;
    private String condicaoAtual;
    private int tempoMinutos;
    private int tempoSegundos;
    private double velocidadeMetroMinuto;
    private double velocidadeKmHora;
    private int inclinacaoEsteira;
    private int nivelAtvFisica;
    private int distanciaMetros;
    private double peso;
    
    private double vo2CargaLMin;
    private double vo2MaxLMin;
    private double vo2maxMlKgMin;
    private double kcalMin;
    private double metMax;
    private double vo2Obtido;
    private double vo2Predito;
    private double defictFuncional;
    private String classificaoAHA;
	public long getCodTeste() {
		return codTeste;
	}
	public void setCodTeste(long codTeste) {
		this.codTeste = codTeste;
	}
	public String getFormulaUsada() {
		return formulaUsada;
	}
	public void setFormulaUsada(String formulaUsada) {
		this.formulaUsada = formulaUsada;
	}
	public int getFcTeste() {
		return fcTeste;
	}
	public void setFcTeste(int fcTeste) {
		this.fcTeste = fcTeste;
	}
	public double getCargaKg() {
		return cargaKg;
	}
	public void setCargaKg(double cargaKg) {
		this.cargaKg = cargaKg;
	}
	public double getCargaWatts() {
		return cargaWatts;
	}
	public void setCargaWatts(double cargaWatts) {
		this.cargaWatts = cargaWatts;
	}
	public String getCondicaoAtual() {
		return condicaoAtual;
	}
	public void setCondicaoAtual(String condicaoAtual) {
		this.condicaoAtual = condicaoAtual;
	}
	public int getTempoMinutos() {
		return tempoMinutos;
	}
	public void setTempoMinutos(int tempoMinutos) {
		this.tempoMinutos = tempoMinutos;
	}
	public int getTempoSegundos() {
		return tempoSegundos;
	}
	public void setTempoSegundos(int tempoSegundos) {
		this.tempoSegundos = tempoSegundos;
	}
	public double getVelocidadeMetroMinuto() {
		return velocidadeMetroMinuto;
	}
	public void setVelocidadeMetroMinuto(double velocidadeMetroMinuto) {
		this.velocidadeMetroMinuto = velocidadeMetroMinuto;
	}
	public double getVelocidadeKmHora() {
		return velocidadeKmHora;
	}
	public void setVelocidadeKmHora(double velocidadeKmHora) {
		this.velocidadeKmHora = velocidadeKmHora;
	}
	public int getInclinacaoEsteira() {
		return inclinacaoEsteira;
	}
	public void setInclinacaoEsteira(int inclinacaoEsteira) {
		this.inclinacaoEsteira = inclinacaoEsteira;
	}
	public int getNivelAtvFisica() {
		return nivelAtvFisica;
	}
	public void setNivelAtvFisica(int nivelAtvFisica) {
		this.nivelAtvFisica = nivelAtvFisica;
	}
	public int getDistanciaMetros() {
		return distanciaMetros;
	}
	public void setDistanciaMetros(int distanciaMetros) {
		this.distanciaMetros = distanciaMetros;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVo2CargaLMin() {
		return vo2CargaLMin;
	}
	public void setVo2CargaLMin(double vo2CargaLMin) {
		this.vo2CargaLMin = vo2CargaLMin;
	}
	public double getVo2MaxLMin() {
		return vo2MaxLMin;
	}
	public void setVo2MaxLMin(double vo2MaxLMin) {
		this.vo2MaxLMin = vo2MaxLMin;
	}
	public double getVo2maxMlKgMin() {
		return vo2maxMlKgMin;
	}
	public void setVo2maxMlKgMin(double vo2maxMlKgMin) {
		this.vo2maxMlKgMin = vo2maxMlKgMin;
	}
	public double getKcalMin() {
		return kcalMin;
	}
	public void setKcalMin(double kcalMin) {
		this.kcalMin = kcalMin;
	}
	public double getMetMax() {
		return metMax;
	}
	public void setMetMax(double metMax) {
		this.metMax = metMax;
	}
	public double getVo2Obtido() {
		return vo2Obtido;
	}
	public void setVo2Obtido(double vo2Obtido) {
		this.vo2Obtido = vo2Obtido;
	}
	public double getVo2Predito() {
		return vo2Predito;
	}
	public void setVo2Predito(double vo2Predito) {
		this.vo2Predito = vo2Predito;
	}
	public double getDefictFuncional() {
		return defictFuncional;
	}
	public void setDefictFuncional(double defictFuncional) {
		this.defictFuncional = defictFuncional;
	}
	public String getClassificaoAHA() {
		return classificaoAHA;
	}
	public void setClassificaoAHA(String classificaoAHA) {
		this.classificaoAHA = classificaoAHA;
	}
    
    

}
