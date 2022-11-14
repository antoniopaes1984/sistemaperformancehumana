package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tmb")
@SequenceGenerator(name="seq_tmb", sequenceName = "seq_tmb", allocationSize = 1, initialValue = 1)
public class TaxaMetabolicaBasal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tmb")
	private long codTmb;
    private String protocoloTmb;
    private double tmb;
	public long getCodTmb() {
		return codTmb;
	}
	public void setCodTmb(long codTmb) {
		this.codTmb = codTmb;
	}
	public String getProtocoloTmb() {
		return protocoloTmb;
	}
	public void setProtocoloTmb(String protocoloTmb) {
		this.protocoloTmb = protocoloTmb;
	}
	public double getTmb() {
		return tmb;
	}
	public void setTmb(double tmb) {
		this.tmb = tmb;
	}
    
    

    
}
