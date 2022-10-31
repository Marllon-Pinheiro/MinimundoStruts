package br.com.minimundo.db;

import br.com.minimundo.model.Turma;

public class TurmaDB {
	
	private static Turma turma1;
	private static Turma turma2;
	private static Turma turma3;
	
	static {
		turma1 = new Turma("A", AlunoDB.getAlunos1());
	}
	
	static {
		turma2 = new Turma("B", AlunoDB.getAlunos2());
	}
	
	static {
		turma3 = new Turma("C", AlunoDB.getAlunos3());
	}

	public static Turma getTurma1() {
		return turma1;
	}

	public static Turma getTurma2() {
		return turma2;
	}

	public static Turma getTurma3() {
		return turma3;
	}
	
	

}
