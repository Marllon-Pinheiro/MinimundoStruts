package br.com.minimundo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.model.Aluno;
import br.com.minimundo.util.NotaUtil;

public class AlunoDTO implements Serializable {

	private static final long serialVersionUID = 4583948591934028502L;

	private String nome;
	private BigDecimal nota1;
	private BigDecimal nota2;
	private BigDecimal nota3;
	private BigDecimal provaFinal;
	private BigDecimal provaEspecial;
	private BigDecimal media;
	private BigDecimal notaVencedor;
	private SituacaoBoletimEnum situacao;

	public AlunoDTO(Aluno aluno) {
		this.nome = aluno.getNome();
		this.nota1 = aluno.getProvas().get(0).getNota();
		this.nota2 = aluno.getProvas().get(1).getNota();
		this.nota3 = aluno.getProvas().get(2).getNota();
		this.provaFinal = aluno.getProvas().get(3).getNota();
		this.provaEspecial = aluno.getProvas().get(4).getNota();
		this.media = aluno.getBoletim().getMedia();
		this.situacao = aluno.getBoletim().getSituacao();
		this.notaVencedor = NotaUtil.pegarNotaTotal(aluno.getProvas());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getNota1() {
		return nota1;
	}

	public void setNota1(BigDecimal nota1) {
		this.nota1 = nota1;
	}

	public BigDecimal getNota2() {
		return nota2;
	}

	public void setNota2(BigDecimal nota2) {
		this.nota2 = nota2;
	}

	public BigDecimal getNota3() {
		return nota3;
	}

	public void setNota3(BigDecimal nota3) {
		this.nota3 = nota3;
	}

	public BigDecimal getProvaFinal() {
		return provaFinal;
	}

	public void setProvaFinal(BigDecimal provaFinal) {
		this.provaFinal = provaFinal;
	}

	public BigDecimal getProvaEspecial() {
		return provaEspecial;
	}

	public void setProvaEspecial(BigDecimal provaEspecial) {
		this.provaEspecial = provaEspecial;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public SituacaoBoletimEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBoletimEnum situacao) {
		this.situacao = situacao;
	}

	public BigDecimal getNotaVencedor() {
		return notaVencedor;
	}

	public void setNotaVencedor(BigDecimal notaVencedor) {
		this.notaVencedor = notaVencedor;
	}

	@Override
	public String toString() {
		return "AlunoDTO [nome=" + nome + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", nota3=" + nota3 + ", provaFinal=" + provaFinal
				+ ", provaEspecial=" + provaEspecial + ", media=" + media
				+ ", situacao=" + situacao + "]";
	}

}
