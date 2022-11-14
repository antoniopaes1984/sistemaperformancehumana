package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
@SequenceGenerator(name="seq_somatotipo", sequenceName = "seq_somatotipo", allocationSize = 1, initialValue = 1)
public class Somatotipo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_somatotipo")
	private long cod_somatotipo;
    private double dcTriceps;
    private double dcSubEscapular;
    private double dcSupraIliaca;
    private double dcPanturrilha;
    private double circBracoDireitoRelax;
    private double circPanturrilha;
    private double diamFemur;
    private double diamUmero;
    private double peso;
    private double altura;
    private double somatoTipoEndomorfia;
    private double somatoTipoMesomorfia;
    private double somatoTipoEctomorfia;
    private String classificacaoSomatotipo;
    private String acaoSomatotipo;
	public long getCod_somatotipo() {
		return cod_somatotipo;
	}
	public void setCod_somatotipo(long cod_somatotipo) {
		this.cod_somatotipo = cod_somatotipo;
	}
	public double getDcTriceps() {
		return dcTriceps;
	}
	public void setDcTriceps(double dcTriceps) {
		this.dcTriceps = dcTriceps;
	}
	public double getDcSubEscapular() {
		return dcSubEscapular;
	}
	public void setDcSubEscapular(double dcSubEscapular) {
		this.dcSubEscapular = dcSubEscapular;
	}
	public double getDcSupraIliaca() {
		return dcSupraIliaca;
	}
	public void setDcSupraIliaca(double dcSupraIliaca) {
		this.dcSupraIliaca = dcSupraIliaca;
	}
	public double getDcPanturrilha() {
		return dcPanturrilha;
	}
	public void setDcPanturrilha(double dcPanturrilha) {
		this.dcPanturrilha = dcPanturrilha;
	}
	public double getCircBracoDireitoRelax() {
		return circBracoDireitoRelax;
	}
	public void setCircBracoDireitoRelax(double circBracoDireitoRelax) {
		this.circBracoDireitoRelax = circBracoDireitoRelax;
	}
	public double getCircPanturrilha() {
		return circPanturrilha;
	}
	public void setCircPanturrilha(double circPanturrilha) {
		this.circPanturrilha = circPanturrilha;
	}
	public double getDiamFemur() {
		return diamFemur;
	}
	public void setDiamFemur(double diamFemur) {
		this.diamFemur = diamFemur;
	}
	public double getDiamUmero() {
		return diamUmero;
	}
	public void setDiamUmero(double diamUmero) {
		this.diamUmero = diamUmero;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getSomatoTipoEndomorfia() {
		return somatoTipoEndomorfia;
	}
	public void setSomatoTipoEndomorfia(double somatoTipoEndomorfia) {
		this.somatoTipoEndomorfia = somatoTipoEndomorfia;
	}
	public double getSomatoTipoMesomorfia() {
		return somatoTipoMesomorfia;
	}
	public void setSomatoTipoMesomorfia(double somatoTipoMesomorfia) {
		this.somatoTipoMesomorfia = somatoTipoMesomorfia;
	}
	public double getSomatoTipoEctomorfia() {
		return somatoTipoEctomorfia;
	}
	public void setSomatoTipoEctomorfia(double somatoTipoEctomorfia) {
		this.somatoTipoEctomorfia = somatoTipoEctomorfia;
	}
	public String getClassificacaoSomatotipo() {
		return classificacaoSomatotipo;
	}
	public void setClassificacaoSomatotipo(String classificacaoSomatotipo) {
		this.classificacaoSomatotipo = classificacaoSomatotipo;
	}
	public String getAcaoSomatotipo() {
		return acaoSomatotipo;
	}
	public void setAcaoSomatotipo(String acaoSomatotipo) {
		this.acaoSomatotipo = acaoSomatotipo;
	}
    
    

}
