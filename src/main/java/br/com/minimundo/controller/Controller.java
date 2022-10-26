package br.com.minimundo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.minimundo.comparator.NotaComparator;
import br.com.minimundo.converter.Converter;
import br.com.minimundo.db.AlunoDB;
import br.com.minimundo.dto.AlunoDTO;
import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.enums.TipoProvaEnum;
import br.com.minimundo.model.Aluno;
import br.com.minimundo.model.Boletim;
import br.com.minimundo.model.Competicao;
import br.com.minimundo.model.Prova;
import br.com.minimundo.model.Turma;


public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Prova> provas = new ArrayList<Prova>();
		Aluno aluno1 = new Aluno("Marllon");
		Boletim boletim = new Boletim();
		Prova prova1 = new Prova(9.0, TipoProvaEnum.PROVA1);
		Prova prova2 = new Prova(9.0, TipoProvaEnum.PROVA2);
		Prova prova3 = new Prova(9.0, TipoProvaEnum.PROVA3);
		Prova prova4 = new Prova(10.0, TipoProvaEnum.PROVAESPECIAL);
		provas.add(prova1);
		provas.add(prova2);
		provas.add(prova3);
		provas.add(prova4);
		aluno1.setProvas(provas);
		aluno1.setBoletim(boletim);
		
		
//		Boletim boletim = new Boletim();
//		boletim.NotaTotalAluno(provas);
//		System.out.println(aluno1.getBoletim().getNotaTotal());
		
		AlunoDB db = new AlunoDB();
//		
//		List<Aluno> teste = db.getAll();
//		System.out.println(teste);
//		
//		System.out.println("-----------------------");
//		
		Competicao comp = new Competicao();
//		
//		List<Aluno> alunosSelecionados = comp.selecionarOsMelhores(teste);
//		comp.aplicarProvaEspecial(alunosSelecionados);
//		System.out.println(alunosSelecionados);
		
		
		
//		System.out.println(comp.verificarVencedor(alunosSelecionados));
		List<Aluno> teste = db.getAlunos1();
		for(Aluno aluno : teste){
			System.out.println(aluno.getProvas().get(4).getNota());
		}
		Converter conv = new Converter();
		List<AlunoDTO> alunoDTO = conv.converterToDTO(teste);
//		System.out.println(alunoDTO);
		
		BigDecimal big = new BigDecimal(boletim.getMedia());
		big = big.setScale(2, BigDecimal.ROUND_HALF_UP);
//		List<Aluno> todosAlunos = new ArrayList<Aluno>();
//		todosAlunos.addAll(alunos1);
//		todosAlunos.addAll(alunos2);
//		todosAlunos.addAll(alunos3);
//		List<Aluno> alunos1 = new ArrayList<Aluno>();
//		
//		Aluno aluno1 = new Aluno("Milena");
//		List<Prova> provas1 = new ArrayList<Prova>();
//		Boletim boletim1 = new Boletim();
//		Prova prova1 = new Prova(9.0, TipoProvaEnum.PROVA1);
//		Prova prova2 = new Prova(9.5, TipoProvaEnum.PROVA2);
//		Prova prova3 = new Prova(9.5, TipoProvaEnum.PROVA3);
//		provas1.add(prova1);
//		provas1.add(prova2);
//		provas1.add(prova3);
//		aluno1.setProvas(provas1);
//		aluno1.setBoletim(boletim1);
//		double media1 = boletim1.calcularMedia(provas1);
//		boletim1.verificarSituacao(media1);
//		boletim1.aplicarProvaFinal(boletim1.getSituacao(), aluno1, 9.0);
//		alunos1.add(aluno1);

	}

}
