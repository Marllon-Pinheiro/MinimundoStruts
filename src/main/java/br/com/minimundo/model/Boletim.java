package br.com.minimundo.model;

import java.math.BigDecimal;
import java.util.List;

import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.enums.TipoProvaEnum;

public class Boletim {

	private BigDecimal media = new BigDecimal(0);
	private SituacaoBoletimEnum situacao;

	public Boletim() {

	}

	public BigDecimal calcularMedia(List<Prova> provas) {
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1) {
				this.media = this.media.add(prova.getNota());
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA2) {
				this.media = this.media.add(prova.getNota().multiply(
						new BigDecimal(1.2)));
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA3) {
				this.media = this.media.add(prova.getNota().multiply(
						new BigDecimal(1.4)));
				this.media = this.media.divide(new BigDecimal(3.6), 2,
						BigDecimal.ROUND_HALF_UP);
			}
		}
		return this.media;
	}

	public SituacaoBoletimEnum verificarSituacao(BigDecimal media) {
		if (media.doubleValue() >= 6) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else if (media.doubleValue() < 6 && media.doubleValue() >= 4) {
			this.situacao = SituacaoBoletimEnum.RECUPERACAO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
		return this.situacao;
	}

	public void aplicarProvaFinal(SituacaoBoletimEnum situacao, Aluno aluno) {
		if (situacao.equals(SituacaoBoletimEnum.RECUPERACAO)) {
			BigDecimal nota = new BigDecimal(Math.random() * (7 - 3) + 3)
					.setScale(2, BigDecimal.ROUND_HALF_EVEN);
			aluno.getProvas().get(3).setNota(nota);
			
			this.media = this.media.add(nota).divide(new BigDecimal(2), 2,
					BigDecimal.ROUND_HALF_EVEN);
		}
		if (this.media.doubleValue() >= 5) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
	}


	public Boletim criarBoletim(Aluno aluno) {
		return null;
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

	@Override
	public String toString() {
		return "Boletim [media=" + media + "]";
	}

}
