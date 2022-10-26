package br.com.minimundo.model;

import java.util.List;

import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.enums.TipoProvaEnum;

public class Boletim {

	private double media;
	private SituacaoBoletimEnum situacao;
	private double notaTotal;

	public Boletim() {

	}

	public double calcularMedia(List<Prova> provas) {
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1) {
				this.media += prova.getNota();
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA2) {
				this.media += prova.getNota() * 1.2;
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA3) {
				this.media = (this.media + prova.getNota() * 1.4) / 3.6;
			}
		}
		return this.media;
	}

	public SituacaoBoletimEnum verificarSituacao(double media) {
		if (media >= 6) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else if (media < 6 && media >= 4) {
			this.situacao = SituacaoBoletimEnum.RECUPERACAO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
		return this.situacao;
	}

	public void aplicarProvaFinal(SituacaoBoletimEnum situacao, Aluno aluno,
			double nota) {
		if (situacao.equals(SituacaoBoletimEnum.RECUPERACAO)) {
			Prova provaFinal = new Prova(nota, TipoProvaEnum.PROVAFINAL);
			aluno.getProvas().add(provaFinal);
			this.media = (this.media + nota) / 2;
		}
		if (this.media >= 5) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
	}

	public double NotaTotalAluno(List<Prova> provas) {
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1
					|| prova.getTipo() == TipoProvaEnum.PROVA2
					|| prova.getTipo() == TipoProvaEnum.PROVA3) {
				this.notaTotal += prova.getNota();
			}
			if (prova.getTipo() == TipoProvaEnum.PROVAESPECIAL) {
				this.notaTotal += prova.getNota() * 2.0;
			}
		}
		return this.notaTotal;
	}

	public Boletim criarBoletim(Aluno aluno) {
		return null;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public SituacaoBoletimEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBoletimEnum situacao) {
		this.situacao = situacao;
	}

	public double getNotaTotal() {
		return notaTotal;
	}

	public void setNotaTotal(double notaTotal) {
		this.notaTotal = notaTotal;
	}

	@Override
	public String toString() {
		return "Boletim [media=" + media + "]";
	}

}
