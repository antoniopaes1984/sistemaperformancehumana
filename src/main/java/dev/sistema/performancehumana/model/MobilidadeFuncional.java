package dev.sistema.performancehumana.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mobilidade_funcional")
@SequenceGenerator(name = "seq_mobilidade", sequenceName = "seq_mobilidade", allocationSize = 1, initialValue = 1)
public class MobilidadeFuncional implements Serializable{

	    private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mobilidade")
	    private long codMobilidadeFuncional;
	   
	    private String pontuacaoAgachamentoProfundo;
	    private String textoAgachamentoProfundo;
	    
	    private String pontuacaoPassoEmLinhaEsquerdo;
	    private String pontuacaoPassoEmLinhaDireito;
	    private String textoPassoEmLinha;
	    
	    private String pontuacaoAvancoEsquerdo;
	    private String pontuacaoAvancoDireito;
	    private String textoAvanco;
	    
	    private String pontuacaoMobilidadeOmbroEsquerdo;
	    private String pontuacaoMobilidadeOmbroDireito;
	    private String textoMobilidadeOmbro;
	    
	    private String pontuacaoTesteLimitanteEsquerdo;
	    private String pontuacaoTesteLimitanteDireito;
	    
	    private String pontuacaoElevacaoDaPernaExtendidaEsquerdo;
	    private String pontuacaoElevacaoDaPernaExtendidaDireito;
	    private String textoElevacaoDaPernaExtendida;
	    
	    private String pontuacaoFlexaoDeBracos;
	    private String textoFlexaoDeBracos;
	    
	    private String pontuacaoTesteLimitanteExtensao;
	    
	    
	    private String pontuacaoEstabilidadeDeRotacaoEsquerdo;
	    private String pontuacaoEstabilidadeDeRotacaoDireito;
	    private String textoEstabilidadeDeRotacao;
	    
	    private String pontuacaoTesteLimitanteFlexao;
	    
	    
	    private String consideracoesFinais;
	    private String pontuacaoTotal;
		public long getCodMobilidadeFuncional() {
			return codMobilidadeFuncional;
		}
		public void setCodMobilidadeFuncional(long codMobilidadeFuncional) {
			this.codMobilidadeFuncional = codMobilidadeFuncional;
		}
		public String getPontuacaoAgachamentoProfundo() {
			return pontuacaoAgachamentoProfundo;
		}
		public void setPontuacaoAgachamentoProfundo(String pontuacaoAgachamentoProfundo) {
			this.pontuacaoAgachamentoProfundo = pontuacaoAgachamentoProfundo;
		}
		public String getTextoAgachamentoProfundo() {
			return textoAgachamentoProfundo;
		}
		public void setTextoAgachamentoProfundo(String textoAgachamentoProfundo) {
			this.textoAgachamentoProfundo = textoAgachamentoProfundo;
		}
		public String getPontuacaoPassoEmLinhaEsquerdo() {
			return pontuacaoPassoEmLinhaEsquerdo;
		}
		public void setPontuacaoPassoEmLinhaEsquerdo(String pontuacaoPassoEmLinhaEsquerdo) {
			this.pontuacaoPassoEmLinhaEsquerdo = pontuacaoPassoEmLinhaEsquerdo;
		}
		public String getPontuacaoPassoEmLinhaDireito() {
			return pontuacaoPassoEmLinhaDireito;
		}
		public void setPontuacaoPassoEmLinhaDireito(String pontuacaoPassoEmLinhaDireito) {
			this.pontuacaoPassoEmLinhaDireito = pontuacaoPassoEmLinhaDireito;
		}
		public String getTextoPassoEmLinha() {
			return textoPassoEmLinha;
		}
		public void setTextoPassoEmLinha(String textoPassoEmLinha) {
			this.textoPassoEmLinha = textoPassoEmLinha;
		}
		public String getPontuacaoAvancoEsquerdo() {
			return pontuacaoAvancoEsquerdo;
		}
		public void setPontuacaoAvancoEsquerdo(String pontuacaoAvancoEsquerdo) {
			this.pontuacaoAvancoEsquerdo = pontuacaoAvancoEsquerdo;
		}
		public String getPontuacaoAvancoDireito() {
			return pontuacaoAvancoDireito;
		}
		public void setPontuacaoAvancoDireito(String pontuacaoAvancoDireito) {
			this.pontuacaoAvancoDireito = pontuacaoAvancoDireito;
		}
		public String getTextoAvanco() {
			return textoAvanco;
		}
		public void setTextoAvanco(String textoAvanco) {
			this.textoAvanco = textoAvanco;
		}
		public String getPontuacaoMobilidadeOmbroEsquerdo() {
			return pontuacaoMobilidadeOmbroEsquerdo;
		}
		public void setPontuacaoMobilidadeOmbroEsquerdo(String pontuacaoMobilidadeOmbroEsquerdo) {
			this.pontuacaoMobilidadeOmbroEsquerdo = pontuacaoMobilidadeOmbroEsquerdo;
		}
		public String getPontuacaoMobilidadeOmbroDireito() {
			return pontuacaoMobilidadeOmbroDireito;
		}
		public void setPontuacaoMobilidadeOmbroDireito(String pontuacaoMobilidadeOmbroDireito) {
			this.pontuacaoMobilidadeOmbroDireito = pontuacaoMobilidadeOmbroDireito;
		}
		public String getTextoMobilidadeOmbro() {
			return textoMobilidadeOmbro;
		}
		public void setTextoMobilidadeOmbro(String textoMobilidadeOmbro) {
			this.textoMobilidadeOmbro = textoMobilidadeOmbro;
		}
		public String getPontuacaoTesteLimitanteEsquerdo() {
			return pontuacaoTesteLimitanteEsquerdo;
		}
		public void setPontuacaoTesteLimitanteEsquerdo(String pontuacaoTesteLimitanteEsquerdo) {
			this.pontuacaoTesteLimitanteEsquerdo = pontuacaoTesteLimitanteEsquerdo;
		}
		public String getPontuacaoTesteLimitanteDireito() {
			return pontuacaoTesteLimitanteDireito;
		}
		public void setPontuacaoTesteLimitanteDireito(String pontuacaoTesteLimitanteDireito) {
			this.pontuacaoTesteLimitanteDireito = pontuacaoTesteLimitanteDireito;
		}
		public String getPontuacaoElevacaoDaPernaExtendidaEsquerdo() {
			return pontuacaoElevacaoDaPernaExtendidaEsquerdo;
		}
		public void setPontuacaoElevacaoDaPernaExtendidaEsquerdo(String pontuacaoElevacaoDaPernaExtendidaEsquerdo) {
			this.pontuacaoElevacaoDaPernaExtendidaEsquerdo = pontuacaoElevacaoDaPernaExtendidaEsquerdo;
		}
		public String getPontuacaoElevacaoDaPernaExtendidaDireito() {
			return pontuacaoElevacaoDaPernaExtendidaDireito;
		}
		public void setPontuacaoElevacaoDaPernaExtendidaDireito(String pontuacaoElevacaoDaPernaExtendidaDireito) {
			this.pontuacaoElevacaoDaPernaExtendidaDireito = pontuacaoElevacaoDaPernaExtendidaDireito;
		}
		public String getTextoElevacaoDaPernaExtendida() {
			return textoElevacaoDaPernaExtendida;
		}
		public void setTextoElevacaoDaPernaExtendida(String textoElevacaoDaPernaExtendida) {
			this.textoElevacaoDaPernaExtendida = textoElevacaoDaPernaExtendida;
		}
		public String getPontuacaoFlexaoDeBracos() {
			return pontuacaoFlexaoDeBracos;
		}
		public void setPontuacaoFlexaoDeBracos(String pontuacaoFlexaoDeBracos) {
			this.pontuacaoFlexaoDeBracos = pontuacaoFlexaoDeBracos;
		}
		public String getTextoFlexaoDeBracos() {
			return textoFlexaoDeBracos;
		}
		public void setTextoFlexaoDeBracos(String textoFlexaoDeBracos) {
			this.textoFlexaoDeBracos = textoFlexaoDeBracos;
		}
		public String getPontuacaoTesteLimitanteExtensao() {
			return pontuacaoTesteLimitanteExtensao;
		}
		public void setPontuacaoTesteLimitanteExtensao(String pontuacaoTesteLimitanteExtensao) {
			this.pontuacaoTesteLimitanteExtensao = pontuacaoTesteLimitanteExtensao;
		}
		public String getPontuacaoEstabilidadeDeRotacaoEsquerdo() {
			return pontuacaoEstabilidadeDeRotacaoEsquerdo;
		}
		public void setPontuacaoEstabilidadeDeRotacaoEsquerdo(String pontuacaoEstabilidadeDeRotacaoEsquerdo) {
			this.pontuacaoEstabilidadeDeRotacaoEsquerdo = pontuacaoEstabilidadeDeRotacaoEsquerdo;
		}
		public String getPontuacaoEstabilidadeDeRotacaoDireito() {
			return pontuacaoEstabilidadeDeRotacaoDireito;
		}
		public void setPontuacaoEstabilidadeDeRotacaoDireito(String pontuacaoEstabilidadeDeRotacaoDireito) {
			this.pontuacaoEstabilidadeDeRotacaoDireito = pontuacaoEstabilidadeDeRotacaoDireito;
		}
		public String getTextoEstabilidadeDeRotacao() {
			return textoEstabilidadeDeRotacao;
		}
		public void setTextoEstabilidadeDeRotacao(String textoEstabilidadeDeRotacao) {
			this.textoEstabilidadeDeRotacao = textoEstabilidadeDeRotacao;
		}
		public String getPontuacaoTesteLimitanteFlexao() {
			return pontuacaoTesteLimitanteFlexao;
		}
		public void setPontuacaoTesteLimitanteFlexao(String pontuacaoTesteLimitanteFlexao) {
			this.pontuacaoTesteLimitanteFlexao = pontuacaoTesteLimitanteFlexao;
		}
		public String getConsideracoesFinais() {
			return consideracoesFinais;
		}
		public void setConsideracoesFinais(String consideracoesFinais) {
			this.consideracoesFinais = consideracoesFinais;
		}
		public String getPontuacaoTotal() {
			return pontuacaoTotal;
		}
		public void setPontuacaoTotal(String pontuacaoTotal) {
			this.pontuacaoTotal = pontuacaoTotal;
		}
	    
	    

}
