package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="parq")
@SequenceGenerator(name="seq_parq", sequenceName = "seq_parq", allocationSize = 1, initialValue = 1)
public class Parq implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_parq")
	    private long codParq;
		
	    
	    private String pergunta1;
	    private String pergunta2;
	    private String pergunta3;
	    private String pergunta4;
	    private String pergunta5;
	    private String pergunta6;
	    private String pergunta7;
	    private String situacao;
	    
		public long getCodParq() {
			return codParq;
		}
		public void setCodParq(long codParq) {
			this.codParq = codParq;
		}
		public String getPergunta1() {
			return pergunta1;
		}
		public void setPergunta1(String pergunta1) {
			this.pergunta1 = pergunta1;
		}
		public String getPergunta2() {
			return pergunta2;
		}
		public void setPergunta2(String pergunta2) {
			this.pergunta2 = pergunta2;
		}
		public String getPergunta3() {
			return pergunta3;
		}
		public void setPergunta3(String pergunta3) {
			this.pergunta3 = pergunta3;
		}
		public String getPergunta4() {
			return pergunta4;
		}
		public void setPergunta4(String pergunta4) {
			this.pergunta4 = pergunta4;
		}
		public String getPergunta5() {
			return pergunta5;
		}
		public void setPergunta5(String pergunta5) {
			this.pergunta5 = pergunta5;
		}
		public String getPergunta6() {
			return pergunta6;
		}
		public void setPergunta6(String pergunta6) {
			this.pergunta6 = pergunta6;
		}
		public String getPergunta7() {
			return pergunta7;
		}
		public void setPergunta7(String pergunta7) {
			this.pergunta7 = pergunta7;
		}
		public String getSituacao() {
			return situacao;
		}
		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}
	    
	    

}
