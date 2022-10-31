package br.com.minimundo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.minimundo.comparator.NotaComparator;
import br.com.minimundo.util.NotaUtil;

public class Competicao {

	public static List<Aluno> selecionarOsMelhores(List<Aluno> alunos) {
		Collections.sort(alunos, new NotaComparator());
		List<Aluno> alunosSelecionados = new ArrayList<Aluno>();
		for (int i = 0; i < 5; i++) {
			if (alunos.get(i).getBoletim().getMedia().doubleValue() >= 5) {
				alunosSelecionados.add(alunos.get(i));
			}
		}
		return alunosSelecionados;
	}

	public static List<Aluno> aplicarProvaEspecial(List<Aluno> alunos) {
		for (int i = 0; i < alunos.size(); i++) {
			alunos.get(i)
					.getProvas()
					.get(4).setNota(new BigDecimal(Math.random() * (10 - 6) + 6).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		}
		return alunos;
	}

	public static Aluno verificarVencedor(List<Aluno> alunos) {
		BigDecimal comparador = new BigDecimal(0);
		Aluno alunoVencedor = null;
		for (int i = 0; i < alunos.size(); i++) {
			BigDecimal nota = NotaUtil.pegarNotaTotal(alunos.get(i).getProvas());
			if(nota.doubleValue() > comparador.doubleValue()){
				comparador = nota;
				alunoVencedor = alunos.get(i);
			}
		}
		return alunoVencedor;
	}

}
