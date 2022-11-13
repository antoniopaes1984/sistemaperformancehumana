package dev.sistema.performancehumana.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="anamnese")
@SequenceGenerator(name="seq_anamnese",sequenceName = "seq_anamnese", allocationSize = 1, initialValue = 1)
public class Anamnese implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
			@Id
			@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_anamnese")
			private long cod_anamnese;
			
			private String atvfis_atual;
			private String atvfis_pretendida;
			private String objetivo;
			private String fumante;
			private String observacoes;
			private String hist_med_pessoal;
			private String hist_med_familiar;
			private String dor_lesao;
			private String pressao_arterial;
			private String classificacao_pressao_arterial;
			private String oximetria; 
			private String classificacao_oximetria;
			private String fc_repouso; 
			private double fc_Max; 
			private double fc_Res; 
			private String disponibilidade; 
			private String situacao;
			private Date data_avaliacao;
			private long glicemia;
			private String resulta_glicemia;
			private long triglicerideo;
			private String resulta_triglicerideo;
			private long colesterol_total;
			private String resulta_colesterol;
			private long hdl;
			private String resulta_hdl;
			private long ldl;
			private String resulta_ldl;
			private long vldl;
			private String resulta_vldl;
			public long getCod_anamnese() {
				return cod_anamnese;
			}
			public void setCod_anamnese(long cod_anamnese) {
				this.cod_anamnese = cod_anamnese;
			}
			public String getAtvfis_atual() {
				return atvfis_atual;
			}
			public void setAtvfis_atual(String atvfis_atual) {
				this.atvfis_atual = atvfis_atual;
			}
			public String getAtvfis_pretendida() {
				return atvfis_pretendida;
			}
			public void setAtvfis_pretendida(String atvfis_pretendida) {
				this.atvfis_pretendida = atvfis_pretendida;
			}
			public String getObjetivo() {
				return objetivo;
			}
			public void setObjetivo(String objetivo) {
				this.objetivo = objetivo;
			}
			public String getFumante() {
				return fumante;
			}
			public void setFumante(String fumante) {
				this.fumante = fumante;
			}
			public String getObservacoes() {
				return observacoes;
			}
			public void setObservacoes(String observacoes) {
				this.observacoes = observacoes;
			}
			public String getHist_med_pessoal() {
				return hist_med_pessoal;
			}
			public void setHist_med_pessoal(String hist_med_pessoal) {
				this.hist_med_pessoal = hist_med_pessoal;
			}
			public String getHist_med_familiar() {
				return hist_med_familiar;
			}
			public void setHist_med_familiar(String hist_med_familiar) {
				this.hist_med_familiar = hist_med_familiar;
			}
			public String getDor_lesao() {
				return dor_lesao;
			}
			public void setDor_lesao(String dor_lesao) {
				this.dor_lesao = dor_lesao;
			}
			public String getPressao_arterial() {
				return pressao_arterial;
			}
			public void setPressao_arterial(String pressao_arterial) {
				this.pressao_arterial = pressao_arterial;
			}
			public String getClassificacao_pressao_arterial() {
				return classificacao_pressao_arterial;
			}
			public void setClassificacao_pressao_arterial(String classificacao_pressao_arterial) {
				this.classificacao_pressao_arterial = classificacao_pressao_arterial;
			}
			public String getOximetria() {
				return oximetria;
			}
			public void setOximetria(String oximetria) {
				this.oximetria = oximetria;
			}
			public String getClassificacao_oximetria() {
				return classificacao_oximetria;
			}
			public void setClassificacao_oximetria(String classificacao_oximetria) {
				this.classificacao_oximetria = classificacao_oximetria;
			}
			public String getFc_repouso() {
				return fc_repouso;
			}
			public void setFc_repouso(String fc_repouso) {
				this.fc_repouso = fc_repouso;
			}
			public double getFc_Max() {
				return fc_Max;
			}
			public void setFc_Max(double fc_Max) {
				this.fc_Max = fc_Max;
			}
			public double getFc_Res() {
				return fc_Res;
			}
			public void setFc_Res(double fc_Res) {
				this.fc_Res = fc_Res;
			}
			public String getDisponibilidade() {
				return disponibilidade;
			}
			public void setDisponibilidade(String disponibilidade) {
				this.disponibilidade = disponibilidade;
			}
			public String getSituacao() {
				return situacao;
			}
			public void setSituacao(String situacao) {
				this.situacao = situacao;
			}
			public Date getData_avaliacao() {
				return data_avaliacao;
			}
			public void setData_avaliacao(Date data_avaliacao) {
				this.data_avaliacao = data_avaliacao;
			}
			public long getGlicemia() {
				return glicemia;
			}
			public void setGlicemia(long glicemia) {
				this.glicemia = glicemia;
			}
			public String getResulta_glicemia() {
				return resulta_glicemia;
			}
			public void setResulta_glicemia(String resulta_glicemia) {
				this.resulta_glicemia = resulta_glicemia;
			}
			public long getTriglicerideo() {
				return triglicerideo;
			}
			public void setTriglicerideo(long triglicerideo) {
				this.triglicerideo = triglicerideo;
			}
			public String getResulta_triglicerideo() {
				return resulta_triglicerideo;
			}
			public void setResulta_triglicerideo(String resulta_triglicerideo) {
				this.resulta_triglicerideo = resulta_triglicerideo;
			}
			public long getColesterol_total() {
				return colesterol_total;
			}
			public void setColesterol_total(long colesterol_total) {
				this.colesterol_total = colesterol_total;
			}
			public String getResulta_colesterol() {
				return resulta_colesterol;
			}
			public void setResulta_colesterol(String resulta_colesterol) {
				this.resulta_colesterol = resulta_colesterol;
			}
			public long getHdl() {
				return hdl;
			}
			public void setHdl(long hdl) {
				this.hdl = hdl;
			}
			public String getResulta_hdl() {
				return resulta_hdl;
			}
			public void setResulta_hdl(String resulta_hdl) {
				this.resulta_hdl = resulta_hdl;
			}
			public long getLdl() {
				return ldl;
			}
			public void setLdl(long ldl) {
				this.ldl = ldl;
			}
			public String getResulta_ldl() {
				return resulta_ldl;
			}
			public void setResulta_ldl(String resulta_ldl) {
				this.resulta_ldl = resulta_ldl;
			}
			public long getVldl() {
				return vldl;
			}
			public void setVldl(long vldl) {
				this.vldl = vldl;
			}
			public String getResulta_vldl() {
				return resulta_vldl;
			}
			public void setResulta_vldl(String resulta_vldl) {
				this.resulta_vldl = resulta_vldl;
			}
			
			
			


}
