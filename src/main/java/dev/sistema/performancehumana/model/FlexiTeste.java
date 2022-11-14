package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "flexiteste")
@SequenceGenerator(name = "seq_flexiteste", sequenceName = "seq_flexiteste", allocationSize = 1, initialValue = 1)
public class FlexiTeste implements Serializable{

	    private static final long serialVersionUID = 1L;
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_flexiteste")
		private long codFlexiTeste;
	    private boolean flexaoQuadril_0;
	    private boolean flexaoQuadril_1;
	    private boolean flexaoQuadril_2;
	    private boolean flexaoQuadril_3;
	    private boolean flexaoQuadril_4;
	    private int valorFlexaoQuadril; 
	    
	    private boolean extensaoQuadril_0;
	    private boolean extensaoQuadril_1;
	    private boolean extensaoQuadril_2;
	    private boolean extensaoQuadril_3;
	    private boolean extensaoQuadril_4;
	    private int valorExtensaoQuadril; 
	    
	    private boolean abducaoQuadril_0;
	    private boolean abducaoQuadril_1;
	    private boolean abducaoQuadril_2;
	    private boolean abducaoQuadril_3;
	    private boolean abducaoQuadril_4;
	    private int valorAbducaoQuadril; 
	    
	    private boolean flexaoTronco_0;
	    private boolean flexaoTronco_1;
	    private boolean flexaoTronco_2;
	    private boolean flexaoTronco_3;
	    private boolean flexaoTronco_4;
	    private int valorFlexaoTronco; 
	    
	    private boolean flexaoLateralTronco_0;
	    private boolean flexaoLateralTronco_1;
	    private boolean flexaoLateralTronco_2;
	    private boolean flexaoLateralTronco_3;
	    private boolean flexaoLateralTronco_4;
	    private int valorFlexaoLateralTronco; 
	    
	    private boolean extensaoAducaoOmbro_0;
	    private boolean extensaoAducaoOmbro_1;
	    private boolean extensaoAducaoOmbro_2;
	    private boolean extensaoAducaoOmbro_3;
	    private boolean extensaoAducaoOmbro_4;
	    private int valorExtensaoAducaoOmbro; 
	            
	    private boolean aducaoPosteriorOmbro_0;
	    private boolean aducaoPosteriorOmbro_1;
	    private boolean aducaoPosteriorOmbro_2;
	    private boolean aducaoPosteriorOmbro_3;
	    private boolean aducaoPosteriorOmbro_4;
	    private int valorAducaoPosteriorOmbro; 
	    
	    private boolean flexaoPosteriorOmbro_0;
	    private boolean flexaoPosteriorOmbro_1;
	    private boolean flexaoPosteriorOmbro_2;
	    private boolean flexaoPosteriorOmbro_3;
	    private boolean flexaoPosteriorOmbro_4;
	    private int valorFlexaoPosteriorOmbro; 
	    
	    private int pontuacao;
	    private String classificacao;
	    private String observacoes;
		public long getCodFlexiTeste() {
			return codFlexiTeste;
		}
		public void setCodFlexiTeste(long codFlexiTeste) {
			this.codFlexiTeste = codFlexiTeste;
		}
		public boolean isFlexaoQuadril_0() {
			return flexaoQuadril_0;
		}
		public void setFlexaoQuadril_0(boolean flexaoQuadril_0) {
			this.flexaoQuadril_0 = flexaoQuadril_0;
		}
		public boolean isFlexaoQuadril_1() {
			return flexaoQuadril_1;
		}
		public void setFlexaoQuadril_1(boolean flexaoQuadril_1) {
			this.flexaoQuadril_1 = flexaoQuadril_1;
		}
		public boolean isFlexaoQuadril_2() {
			return flexaoQuadril_2;
		}
		public void setFlexaoQuadril_2(boolean flexaoQuadril_2) {
			this.flexaoQuadril_2 = flexaoQuadril_2;
		}
		public boolean isFlexaoQuadril_3() {
			return flexaoQuadril_3;
		}
		public void setFlexaoQuadril_3(boolean flexaoQuadril_3) {
			this.flexaoQuadril_3 = flexaoQuadril_3;
		}
		public boolean isFlexaoQuadril_4() {
			return flexaoQuadril_4;
		}
		public void setFlexaoQuadril_4(boolean flexaoQuadril_4) {
			this.flexaoQuadril_4 = flexaoQuadril_4;
		}
		public int getValorFlexaoQuadril() {
			return valorFlexaoQuadril;
		}
		public void setValorFlexaoQuadril(int valorFlexaoQuadril) {
			this.valorFlexaoQuadril = valorFlexaoQuadril;
		}
		public boolean isExtensaoQuadril_0() {
			return extensaoQuadril_0;
		}
		public void setExtensaoQuadril_0(boolean extensaoQuadril_0) {
			this.extensaoQuadril_0 = extensaoQuadril_0;
		}
		public boolean isExtensaoQuadril_1() {
			return extensaoQuadril_1;
		}
		public void setExtensaoQuadril_1(boolean extensaoQuadril_1) {
			this.extensaoQuadril_1 = extensaoQuadril_1;
		}
		public boolean isExtensaoQuadril_2() {
			return extensaoQuadril_2;
		}
		public void setExtensaoQuadril_2(boolean extensaoQuadril_2) {
			this.extensaoQuadril_2 = extensaoQuadril_2;
		}
		public boolean isExtensaoQuadril_3() {
			return extensaoQuadril_3;
		}
		public void setExtensaoQuadril_3(boolean extensaoQuadril_3) {
			this.extensaoQuadril_3 = extensaoQuadril_3;
		}
		public boolean isExtensaoQuadril_4() {
			return extensaoQuadril_4;
		}
		public void setExtensaoQuadril_4(boolean extensaoQuadril_4) {
			this.extensaoQuadril_4 = extensaoQuadril_4;
		}
		public int getValorExtensaoQuadril() {
			return valorExtensaoQuadril;
		}
		public void setValorExtensaoQuadril(int valorExtensaoQuadril) {
			this.valorExtensaoQuadril = valorExtensaoQuadril;
		}
		public boolean isAbducaoQuadril_0() {
			return abducaoQuadril_0;
		}
		public void setAbducaoQuadril_0(boolean abducaoQuadril_0) {
			this.abducaoQuadril_0 = abducaoQuadril_0;
		}
		public boolean isAbducaoQuadril_1() {
			return abducaoQuadril_1;
		}
		public void setAbducaoQuadril_1(boolean abducaoQuadril_1) {
			this.abducaoQuadril_1 = abducaoQuadril_1;
		}
		public boolean isAbducaoQuadril_2() {
			return abducaoQuadril_2;
		}
		public void setAbducaoQuadril_2(boolean abducaoQuadril_2) {
			this.abducaoQuadril_2 = abducaoQuadril_2;
		}
		public boolean isAbducaoQuadril_3() {
			return abducaoQuadril_3;
		}
		public void setAbducaoQuadril_3(boolean abducaoQuadril_3) {
			this.abducaoQuadril_3 = abducaoQuadril_3;
		}
		public boolean isAbducaoQuadril_4() {
			return abducaoQuadril_4;
		}
		public void setAbducaoQuadril_4(boolean abducaoQuadril_4) {
			this.abducaoQuadril_4 = abducaoQuadril_4;
		}
		public int getValorAbducaoQuadril() {
			return valorAbducaoQuadril;
		}
		public void setValorAbducaoQuadril(int valorAbducaoQuadril) {
			this.valorAbducaoQuadril = valorAbducaoQuadril;
		}
		public boolean isFlexaoTronco_0() {
			return flexaoTronco_0;
		}
		public void setFlexaoTronco_0(boolean flexaoTronco_0) {
			this.flexaoTronco_0 = flexaoTronco_0;
		}
		public boolean isFlexaoTronco_1() {
			return flexaoTronco_1;
		}
		public void setFlexaoTronco_1(boolean flexaoTronco_1) {
			this.flexaoTronco_1 = flexaoTronco_1;
		}
		public boolean isFlexaoTronco_2() {
			return flexaoTronco_2;
		}
		public void setFlexaoTronco_2(boolean flexaoTronco_2) {
			this.flexaoTronco_2 = flexaoTronco_2;
		}
		public boolean isFlexaoTronco_3() {
			return flexaoTronco_3;
		}
		public void setFlexaoTronco_3(boolean flexaoTronco_3) {
			this.flexaoTronco_3 = flexaoTronco_3;
		}
		public boolean isFlexaoTronco_4() {
			return flexaoTronco_4;
		}
		public void setFlexaoTronco_4(boolean flexaoTronco_4) {
			this.flexaoTronco_4 = flexaoTronco_4;
		}
		public int getValorFlexaoTronco() {
			return valorFlexaoTronco;
		}
		public void setValorFlexaoTronco(int valorFlexaoTronco) {
			this.valorFlexaoTronco = valorFlexaoTronco;
		}
		public boolean isFlexaoLateralTronco_0() {
			return flexaoLateralTronco_0;
		}
		public void setFlexaoLateralTronco_0(boolean flexaoLateralTronco_0) {
			this.flexaoLateralTronco_0 = flexaoLateralTronco_0;
		}
		public boolean isFlexaoLateralTronco_1() {
			return flexaoLateralTronco_1;
		}
		public void setFlexaoLateralTronco_1(boolean flexaoLateralTronco_1) {
			this.flexaoLateralTronco_1 = flexaoLateralTronco_1;
		}
		public boolean isFlexaoLateralTronco_2() {
			return flexaoLateralTronco_2;
		}
		public void setFlexaoLateralTronco_2(boolean flexaoLateralTronco_2) {
			this.flexaoLateralTronco_2 = flexaoLateralTronco_2;
		}
		public boolean isFlexaoLateralTronco_3() {
			return flexaoLateralTronco_3;
		}
		public void setFlexaoLateralTronco_3(boolean flexaoLateralTronco_3) {
			this.flexaoLateralTronco_3 = flexaoLateralTronco_3;
		}
		public boolean isFlexaoLateralTronco_4() {
			return flexaoLateralTronco_4;
		}
		public void setFlexaoLateralTronco_4(boolean flexaoLateralTronco_4) {
			this.flexaoLateralTronco_4 = flexaoLateralTronco_4;
		}
		public int getValorFlexaoLateralTronco() {
			return valorFlexaoLateralTronco;
		}
		public void setValorFlexaoLateralTronco(int valorFlexaoLateralTronco) {
			this.valorFlexaoLateralTronco = valorFlexaoLateralTronco;
		}
		public boolean isExtensaoAducaoOmbro_0() {
			return extensaoAducaoOmbro_0;
		}
		public void setExtensaoAducaoOmbro_0(boolean extensaoAducaoOmbro_0) {
			this.extensaoAducaoOmbro_0 = extensaoAducaoOmbro_0;
		}
		public boolean isExtensaoAducaoOmbro_1() {
			return extensaoAducaoOmbro_1;
		}
		public void setExtensaoAducaoOmbro_1(boolean extensaoAducaoOmbro_1) {
			this.extensaoAducaoOmbro_1 = extensaoAducaoOmbro_1;
		}
		public boolean isExtensaoAducaoOmbro_2() {
			return extensaoAducaoOmbro_2;
		}
		public void setExtensaoAducaoOmbro_2(boolean extensaoAducaoOmbro_2) {
			this.extensaoAducaoOmbro_2 = extensaoAducaoOmbro_2;
		}
		public boolean isExtensaoAducaoOmbro_3() {
			return extensaoAducaoOmbro_3;
		}
		public void setExtensaoAducaoOmbro_3(boolean extensaoAducaoOmbro_3) {
			this.extensaoAducaoOmbro_3 = extensaoAducaoOmbro_3;
		}
		public boolean isExtensaoAducaoOmbro_4() {
			return extensaoAducaoOmbro_4;
		}
		public void setExtensaoAducaoOmbro_4(boolean extensaoAducaoOmbro_4) {
			this.extensaoAducaoOmbro_4 = extensaoAducaoOmbro_4;
		}
		public int getValorExtensaoAducaoOmbro() {
			return valorExtensaoAducaoOmbro;
		}
		public void setValorExtensaoAducaoOmbro(int valorExtensaoAducaoOmbro) {
			this.valorExtensaoAducaoOmbro = valorExtensaoAducaoOmbro;
		}
		public boolean isAducaoPosteriorOmbro_0() {
			return aducaoPosteriorOmbro_0;
		}
		public void setAducaoPosteriorOmbro_0(boolean aducaoPosteriorOmbro_0) {
			this.aducaoPosteriorOmbro_0 = aducaoPosteriorOmbro_0;
		}
		public boolean isAducaoPosteriorOmbro_1() {
			return aducaoPosteriorOmbro_1;
		}
		public void setAducaoPosteriorOmbro_1(boolean aducaoPosteriorOmbro_1) {
			this.aducaoPosteriorOmbro_1 = aducaoPosteriorOmbro_1;
		}
		public boolean isAducaoPosteriorOmbro_2() {
			return aducaoPosteriorOmbro_2;
		}
		public void setAducaoPosteriorOmbro_2(boolean aducaoPosteriorOmbro_2) {
			this.aducaoPosteriorOmbro_2 = aducaoPosteriorOmbro_2;
		}
		public boolean isAducaoPosteriorOmbro_3() {
			return aducaoPosteriorOmbro_3;
		}
		public void setAducaoPosteriorOmbro_3(boolean aducaoPosteriorOmbro_3) {
			this.aducaoPosteriorOmbro_3 = aducaoPosteriorOmbro_3;
		}
		public boolean isAducaoPosteriorOmbro_4() {
			return aducaoPosteriorOmbro_4;
		}
		public void setAducaoPosteriorOmbro_4(boolean aducaoPosteriorOmbro_4) {
			this.aducaoPosteriorOmbro_4 = aducaoPosteriorOmbro_4;
		}
		public int getValorAducaoPosteriorOmbro() {
			return valorAducaoPosteriorOmbro;
		}
		public void setValorAducaoPosteriorOmbro(int valorAducaoPosteriorOmbro) {
			this.valorAducaoPosteriorOmbro = valorAducaoPosteriorOmbro;
		}
		public boolean isFlexaoPosteriorOmbro_0() {
			return flexaoPosteriorOmbro_0;
		}
		public void setFlexaoPosteriorOmbro_0(boolean flexaoPosteriorOmbro_0) {
			this.flexaoPosteriorOmbro_0 = flexaoPosteriorOmbro_0;
		}
		public boolean isFlexaoPosteriorOmbro_1() {
			return flexaoPosteriorOmbro_1;
		}
		public void setFlexaoPosteriorOmbro_1(boolean flexaoPosteriorOmbro_1) {
			this.flexaoPosteriorOmbro_1 = flexaoPosteriorOmbro_1;
		}
		public boolean isFlexaoPosteriorOmbro_2() {
			return flexaoPosteriorOmbro_2;
		}
		public void setFlexaoPosteriorOmbro_2(boolean flexaoPosteriorOmbro_2) {
			this.flexaoPosteriorOmbro_2 = flexaoPosteriorOmbro_2;
		}
		public boolean isFlexaoPosteriorOmbro_3() {
			return flexaoPosteriorOmbro_3;
		}
		public void setFlexaoPosteriorOmbro_3(boolean flexaoPosteriorOmbro_3) {
			this.flexaoPosteriorOmbro_3 = flexaoPosteriorOmbro_3;
		}
		public boolean isFlexaoPosteriorOmbro_4() {
			return flexaoPosteriorOmbro_4;
		}
		public void setFlexaoPosteriorOmbro_4(boolean flexaoPosteriorOmbro_4) {
			this.flexaoPosteriorOmbro_4 = flexaoPosteriorOmbro_4;
		}
		public int getValorFlexaoPosteriorOmbro() {
			return valorFlexaoPosteriorOmbro;
		}
		public void setValorFlexaoPosteriorOmbro(int valorFlexaoPosteriorOmbro) {
			this.valorFlexaoPosteriorOmbro = valorFlexaoPosteriorOmbro;
		}
		public int getPontuacao() {
			return pontuacao;
		}
		public void setPontuacao(int pontuacao) {
			this.pontuacao = pontuacao;
		}
		public String getClassificacao() {
			return classificacao;
		}
		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}
		public String getObservacoes() {
			return observacoes;
		}
		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}
	    
	    

}
