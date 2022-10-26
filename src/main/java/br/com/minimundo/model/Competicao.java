package br.com.minimundo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.minimundo.comparator.NotaComparator;
import br.com.minimundo.enums.TipoProvaEnum;

public class Competicao {

	public List<Aluno> selecionarOsMelhores(List<Aluno> alunos) {
		Collections.sort(alunos, new NotaComparator());
		List<Aluno> alunosSelecionados = new ArrayList<Aluno>();
		for (int i = 0; i < 5; i++) {
			if (alunos.get(i).getBoletim().getMedia() >= 5) {
				alunosSelecionados.add(alunos.get(i));
			}
		}
		return alunosSelecionados;
	}

	public List<Aluno> aplicarProvaEspecial(List<Aluno> alunos) {
		for (int i = 0; i < alunos.size(); i++) {
			alunos.get(i)
					.getProvas()
					.add(new Prova(Math.random() * (10 - 6) + 6,
							TipoProvaEnum.PROVAESPECIAL));
		}
		return alunos;
	}

	public Aluno verificarVencedor(List<Aluno> alunos) {
		double comparador = 0.0;
		Aluno alunoVencedor = null;
		for (int i = 0; i < alunos.size(); i++) {
			double nota = alunos.get(i).getBoletim().NotaTotalAluno(alunos.get(i).getProvas());
			if(nota > comparador){
				comparador = nota;
				alunoVencedor = alunos.get(i);
			}
		}
		return alunoVencedor;
	}

}
