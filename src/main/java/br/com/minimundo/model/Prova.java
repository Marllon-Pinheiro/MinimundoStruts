package br.com.minimundo.model;

import java.math.BigDecimal;

import br.com.minimundo.enums.TipoProvaEnum;

public class Prova {

	private BigDecimal nota;
	private TipoProvaEnum tipo;

	public Prova(BigDecimal nota, TipoProvaEnum tipo) {
		this.nota = nota;
		this.tipo = tipo;
	}
	
	public Prova criarProva() {
		return null;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public TipoProvaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoProvaEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Prova [nota=" + nota + ", tipo=" + tipo + "]";
	}

}
