package br.com.minimundo.db;

import java.util.ArrayList;
import java.util.List;

import br.com.minimundo.enums.TipoProvaEnum;
import br.com.minimundo.model.Aluno;
import br.com.minimundo.model.Boletim;
import br.com.minimundo.model.Prova;

public class AlunoDB {
	
	private static List<Aluno> alunos1 = new ArrayList<Aluno>();
	private static List<Aluno> alunos2 = new ArrayList<Aluno>();
	private static List<Aluno> alunos3 = new ArrayList<Aluno>();
	
	private static List<Prova> provas = new ArrayList<Prova>();
	
	static {
		
		Aluno aluno1 = new Aluno("Marllon");
		Boletim boletim1 = new Boletim();
		List<Prova> provas1 = new ArrayList<Prova>();
		provas1.add(new Prova(10.0, TipoProvaEnum.PROVA1));
		provas1.add(new Prova(9.5, TipoProvaEnum.PROVA2));
		provas1.add(new Prova(9.5, TipoProvaEnum.PROVA3));
		provas1.add(new Prova(9.0, TipoProvaEnum.PROVA3));
		aluno1.setProvas(provas1);
		aluno1.setBoletim(boletim1);
		boletim1.calcularMedia(provas1);
		boletim1.verificarSituacao(boletim1.getMedia());
		boletim1.aplicarProvaFinal(boletim1.getSituacao(), aluno1, 8.0);
		alunos1.add(aluno1);
		provas.addAll(provas1);
		
		Aluno aluno2 = new Aluno("Milena");
		Boletim boletim2 = new Boletim();
		List<Prova> provas2 = new ArrayList<Prova>();
		provas2.add(new Prova(9.5, TipoProvaEnum.PROVA1));
		provas2.add(new Prova(9.5, TipoProvaEnum.PROVA2));
		provas2.add(new Prova(9.5, TipoProvaEnum.PROVA3));
		aluno2.setProvas(provas2);
		aluno2.setBoletim(boletim2);
		boletim2.calcularMedia(provas2);
		boletim2.verificarSituacao(boletim2.getMedia());
		boletim2.aplicarProvaFinal(boletim2.getSituacao(), aluno2, 8.0);
		alunos1.add(aluno2);
		provas.addAll(provas2);
		
		Aluno aluno3 = new Aluno("Patrick");
		Boletim boletim3 = new Boletim();
		List<Prova> provas3 = new ArrayList<Prova>();
		provas3.add(new Prova(6.5, TipoProvaEnum.PROVA1));
		provas3.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas3.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno3.setProvas(provas3);
		aluno3.setBoletim(boletim3);
		boletim3.calcularMedia(provas3);
		boletim3.verificarSituacao(boletim3.getMedia());
		boletim3.aplicarProvaFinal(boletim3.getSituacao(), aluno3, 8.0);
		alunos1.add(aluno3);
		
		Aluno aluno4 = new Aluno("Ennio");
		Boletim boletim4 = new Boletim();
		List<Prova> provas4 = new ArrayList<Prova>();
		provas4.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas4.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas4.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno4.setProvas(provas4);
		aluno4.setBoletim(boletim4);
		boletim4.calcularMedia(provas4);
		boletim4.verificarSituacao(boletim4.getMedia());
		boletim4.aplicarProvaFinal(boletim4.getSituacao(), aluno4, 8.0);
		alunos1.add(aluno4);
		
		Aluno aluno5 = new Aluno("Jos�");
		Boletim boletim5 = new Boletim();
		List<Prova> provas5 = new ArrayList<Prova>();
		provas5.add(new Prova(9.8, TipoProvaEnum.PROVA1));
		provas5.add(new Prova(10.0, TipoProvaEnum.PROVA2));
		provas5.add(new Prova(9.5, TipoProvaEnum.PROVA3));
		aluno5.setProvas(provas5);
		aluno5.setBoletim(boletim5);
		boletim5.calcularMedia(provas5);
		boletim5.verificarSituacao(boletim5.getMedia());
		boletim5.aplicarProvaFinal(boletim5.getSituacao(), aluno5, 8.0);
		alunos1.add(aluno5);
		
		Aluno aluno6 = new Aluno("Matheus");
		Boletim boletim6 = new Boletim();
		List<Prova> provas6 = new ArrayList<Prova>();
		provas6.add(new Prova(6.5, TipoProvaEnum.PROVA1));
		provas6.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas6.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno6.setProvas(provas6);
		aluno6.setBoletim(boletim6);
		boletim6.calcularMedia(provas6);
		boletim6.verificarSituacao(boletim6.getMedia());
		boletim6.aplicarProvaFinal(boletim6.getSituacao(), aluno6, 8.0);
		alunos1.add(aluno6);
		
		Aluno aluno7 = new Aluno("Pedro");
		Boletim boletim7 = new Boletim();
		List<Prova> provas7 = new ArrayList<Prova>();
		provas7.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas7.add(new Prova(5.0, TipoProvaEnum.PROVA2));
		provas7.add(new Prova(4.5, TipoProvaEnum.PROVA3));
		aluno7.setProvas(provas7);
		aluno7.setBoletim(boletim7);
		boletim7.calcularMedia(provas7);
		boletim7.verificarSituacao(boletim7.getMedia());
		boletim7.aplicarProvaFinal(boletim7.getSituacao(), aluno7, 8.0);
		alunos1.add(aluno7);
		
		Aluno aluno8 = new Aluno("Jo�o");
		Boletim boletim8 = new Boletim();
		List<Prova> provas8 = new ArrayList<Prova>();
		provas8.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas8.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas8.add(new Prova(3.5, TipoProvaEnum.PROVA3));
		aluno8.setProvas(provas8);
		aluno8.setBoletim(boletim8);
		boletim8.calcularMedia(provas8);
		boletim8.verificarSituacao(boletim8.getMedia());
		boletim8.aplicarProvaFinal(boletim8.getSituacao(), aluno8, 8.0);
		alunos1.add(aluno8);
		
		Aluno aluno9 = new Aluno("Luana");
		Boletim boletim9 = new Boletim();
		List<Prova> provas9 = new ArrayList<Prova>();
		provas9.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas9.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas9.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno9.setProvas(provas9);
		aluno9.setBoletim(boletim9);
		boletim9.calcularMedia(provas9);
		boletim9.verificarSituacao(boletim9.getMedia());
		boletim9.aplicarProvaFinal(boletim9.getSituacao(), aluno9, 8.0);
		alunos1.add(aluno9);
		
		Aluno aluno10 = new Aluno("Elinete");
		Boletim boletim10 = new Boletim();
		List<Prova> provas10 = new ArrayList<Prova>();
		provas10.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas10.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas10.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno10.setProvas(provas10);
		aluno10.setBoletim(boletim10);
	    boletim10.calcularMedia(provas10);
		boletim10.verificarSituacao(boletim10.getMedia());
		boletim10.aplicarProvaFinal(boletim10.getSituacao(), aluno10, 8.0);
		alunos1.add(aluno10);
		
		Aluno aluno11 = new Aluno("Thiago");
		Boletim boletim11 = new Boletim();
		List<Prova> provas11 = new ArrayList<Prova>();
		provas11.add(new Prova(3.5, TipoProvaEnum.PROVA1));
		provas11.add(new Prova(4.0, TipoProvaEnum.PROVA2));
		provas11.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno11.setProvas(provas11);
		aluno11.setBoletim(boletim11);
	    boletim11.calcularMedia(provas11);
		boletim11.verificarSituacao(boletim11.getMedia());
		boletim11.aplicarProvaFinal(boletim11.getSituacao(), aluno11, 8.0);
		alunos1.add(aluno11);
		
		Aluno aluno12 = new Aluno("Lucas");
		Boletim boletim12 = new Boletim();
		List<Prova> provas12 = new ArrayList<Prova>();
		provas12.add(new Prova(6.5, TipoProvaEnum.PROVA1));
		provas12.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas12.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno12.setProvas(provas12);
		aluno12.setBoletim(boletim12);
	    boletim12.calcularMedia(provas12);
		boletim12.verificarSituacao(boletim12.getMedia());
		boletim12.aplicarProvaFinal(boletim12.getSituacao(), aluno12, 8.0);
		alunos1.add(aluno12);
		
		Aluno aluno13 = new Aluno("Sofia");
		Boletim boletim13 = new Boletim();
		List<Prova> provas13 = new ArrayList<Prova>();
		provas13.add(new Prova(8.5, TipoProvaEnum.PROVA1));
		provas13.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas13.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno13.setProvas(provas13);
		aluno13.setBoletim(boletim13);
	    boletim13.calcularMedia(provas13);
		boletim13.verificarSituacao(boletim13.getMedia());
		boletim13.aplicarProvaFinal(boletim13.getSituacao(), aluno13, 8.0);
		alunos1.add(aluno13);
		
		Aluno aluno14 = new Aluno("Sara");
		Boletim boletim14 = new Boletim();
		List<Prova> provas14 = new ArrayList<Prova>();
		provas14.add(new Prova(9.5, TipoProvaEnum.PROVA1));
		provas14.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas14.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno14.setProvas(provas14);
		aluno14.setBoletim(boletim14);
	    boletim14.calcularMedia(provas14);
		boletim14.verificarSituacao(boletim14.getMedia());
		boletim14.aplicarProvaFinal(boletim14.getSituacao(), aluno14, 8.0);
		alunos1.add(aluno14);
		
		Aluno aluno15 = new Aluno("Livia");
		Boletim boletim15 = new Boletim();
		List<Prova> provas15 = new ArrayList<Prova>();
		provas15.add(new Prova(6.5, TipoProvaEnum.PROVA1));
		provas15.add(new Prova(5.0, TipoProvaEnum.PROVA2));
		provas15.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno15.setProvas(provas15);
		aluno15.setBoletim(boletim15);
	    boletim15.calcularMedia(provas15);
		boletim15.verificarSituacao(boletim15.getMedia());
		boletim15.aplicarProvaFinal(boletim15.getSituacao(), aluno15, 8.0);
		alunos1.add(aluno15);
		
		Aluno aluno16 = new Aluno("Luis");
		Boletim boletim16 = new Boletim();
		List<Prova> provas16 = new ArrayList<Prova>();
		provas16.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas16.add(new Prova(2.0, TipoProvaEnum.PROVA2));
		provas16.add(new Prova(4.5, TipoProvaEnum.PROVA3));
		aluno16.setProvas(provas16);
		aluno16.setBoletim(boletim16);
	    boletim16.calcularMedia(provas16);
		boletim16.verificarSituacao(boletim16.getMedia());
		boletim16.aplicarProvaFinal(boletim16.getSituacao(), aluno16, 8.0);
		alunos1.add(aluno16);
		
		Aluno aluno17 = new Aluno("Mauro");
		Boletim boletim17 = new Boletim();
		List<Prova> provas17 = new ArrayList<Prova>();
		provas17.add(new Prova(9.5, TipoProvaEnum.PROVA1));
		provas17.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas17.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno17.setProvas(provas17);
		aluno17.setBoletim(boletim17);
	    boletim17.calcularMedia(provas17);
		boletim17.verificarSituacao(boletim17.getMedia());
		boletim17.aplicarProvaFinal(boletim17.getSituacao(), aluno17, 8.0);
		alunos1.add(aluno17);
		
		Aluno aluno18 = new Aluno("Josu�");
		Boletim boletim18 = new Boletim();
		List<Prova> provas18 = new ArrayList<Prova>();
		provas18.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas18.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas18.add(new Prova(9.5, TipoProvaEnum.PROVA3));
		aluno18.setProvas(provas18);
		aluno18.setBoletim(boletim18);
	    boletim18.calcularMedia(provas18);
		boletim18.verificarSituacao(boletim18.getMedia());
		boletim18.aplicarProvaFinal(boletim18.getSituacao(), aluno18, 8.0);
		alunos1.add(aluno18);
		
		Aluno aluno19 = new Aluno("Nicolas");
		Boletim boletim19 = new Boletim();
		List<Prova> provas19 = new ArrayList<Prova>();
		provas19.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas19.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas19.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno19.setProvas(provas19);
		aluno19.setBoletim(boletim19);
	    boletim19.calcularMedia(provas19);
		boletim19.verificarSituacao(boletim19.getMedia());
		boletim19.aplicarProvaFinal(boletim19.getSituacao(), aluno19, 8.0);
		alunos1.add(aluno19);
		
		Aluno aluno20 = new Aluno("Maria Flor");
		Boletim boletim20 = new Boletim();
		List<Prova> provas20 = new ArrayList<Prova>();
		provas20.add(new Prova(10.0, TipoProvaEnum.PROVA1));
		provas20.add(new Prova(9.5, TipoProvaEnum.PROVA2));
		provas20.add(new Prova(10.0, TipoProvaEnum.PROVA3));
		aluno20.setProvas(provas20);
		aluno20.setBoletim(boletim20);
	    boletim20.calcularMedia(provas20);
		boletim20.verificarSituacao(boletim20.getMedia());
		boletim20.aplicarProvaFinal(boletim20.getSituacao(), aluno20, 8.0);
		alunos1.add(aluno20);
	}
	
	static {
		
		Aluno aluno1 = new Aluno("Antonio");
		Boletim boletim1 = new Boletim();
		List<Prova> provas1 = new ArrayList<Prova>();
		provas1.add(new Prova(8.5, TipoProvaEnum.PROVA1));
		provas1.add(new Prova(5.0, TipoProvaEnum.PROVA2));
		provas1.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno1.setProvas(provas1);
		aluno1.setBoletim(boletim1);
	    boletim1.calcularMedia(provas1);
		boletim1.verificarSituacao(boletim1.getMedia());
		boletim1.aplicarProvaFinal(boletim1.getSituacao(), aluno1, 8.0);
		alunos2.add(aluno1);
		
		Aluno aluno2 = new Aluno("Igor");
		Boletim boletim2 = new Boletim();
		List<Prova> provas2 = new ArrayList<Prova>();
		provas2.add(new Prova(7.5, TipoProvaEnum.PROVA1));
		provas2.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas2.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno2.setProvas(provas2);
		aluno2.setBoletim(boletim2);
	    boletim2.calcularMedia(provas2);
		boletim2.verificarSituacao(boletim2.getMedia());
		boletim2.aplicarProvaFinal(boletim2.getSituacao(), aluno2, 8.0);
		alunos2.add(aluno2);
		
		Aluno aluno3 = new Aluno("Jean");
		Boletim boletim3 = new Boletim();
		List<Prova> provas3 = new ArrayList<Prova>();
		provas3.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas3.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas3.add(new Prova(4.5, TipoProvaEnum.PROVA3));
		aluno3.setProvas(provas3);
		aluno3.setBoletim(boletim3);
	    boletim3.calcularMedia(provas3);
		boletim3.verificarSituacao(boletim3.getMedia());
		boletim3.aplicarProvaFinal(boletim3.getSituacao(), aluno3, 8.0);
		alunos2.add(aluno3);
		
		Aluno aluno4 = new Aluno("Luisa");
		Boletim boletim4 = new Boletim();
		List<Prova> provas4 = new ArrayList<Prova>();
		provas4.add(new Prova(7.5, TipoProvaEnum.PROVA1));
		provas4.add(new Prova(5.0, TipoProvaEnum.PROVA2));
		provas4.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno4.setProvas(provas4);
		aluno4.setBoletim(boletim4);
	    boletim4.calcularMedia(provas4);
		boletim4.verificarSituacao(boletim4.getMedia());
		boletim4.aplicarProvaFinal(boletim4.getSituacao(), aluno4, 8.0);
		alunos2.add(aluno4);
		
		Aluno aluno5 = new Aluno("Marcia");
		Boletim boletim5 = new Boletim();
		List<Prova> provas5 = new ArrayList<Prova>();
		provas5.add(new Prova(8.5, TipoProvaEnum.PROVA1));
		provas5.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas5.add(new Prova(4.5, TipoProvaEnum.PROVA3));
		aluno5.setProvas(provas5);
		aluno5.setBoletim(boletim5);
	    boletim5.calcularMedia(provas5);
		boletim5.verificarSituacao(boletim5.getMedia());
		boletim5.aplicarProvaFinal(boletim5.getSituacao(), aluno5, 8.0);
		alunos2.add(aluno5);
		
		Aluno aluno6 = new Aluno("Mayza");
		Boletim boletim6 = new Boletim();
		List<Prova> provas6 = new ArrayList<Prova>();
		provas6.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas6.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas6.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno6.setProvas(provas6);
		aluno6.setBoletim(boletim6);
	    boletim6.calcularMedia(provas6);
		boletim6.verificarSituacao(boletim6.getMedia());
		boletim6.aplicarProvaFinal(boletim6.getSituacao(), aluno6, 8.0);
		alunos2.add(aluno6);
		
		Aluno aluno7 = new Aluno("Juliana");
		Boletim boletim7 = new Boletim();
		List<Prova> provas7 = new ArrayList<Prova>();
		provas7.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas7.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas7.add(new Prova(3.5, TipoProvaEnum.PROVA3));
		aluno7.setProvas(provas7);
		aluno7.setBoletim(boletim7);
	    boletim7.calcularMedia(provas7);
		boletim7.verificarSituacao(boletim7.getMedia());
		boletim7.aplicarProvaFinal(boletim7.getSituacao(), aluno7, 8.0);
		alunos2.add(aluno7);
		
		Aluno aluno8 = new Aluno("Davi");
		Boletim boletim8 = new Boletim();
		List<Prova> provas8 = new ArrayList<Prova>();
		provas8.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas8.add(new Prova(4.0, TipoProvaEnum.PROVA2));
		provas8.add(new Prova(3.5, TipoProvaEnum.PROVA3));
		aluno8.setProvas(provas8);
		aluno8.setBoletim(boletim8);
	    boletim8.calcularMedia(provas8);
		boletim8.verificarSituacao(boletim8.getMedia());
		boletim8.aplicarProvaFinal(boletim8.getSituacao(), aluno8, 8.0);
		alunos2.add(aluno8);
		
		Aluno aluno9 = new Aluno("Julio");
		Boletim boletim9 = new Boletim();
		List<Prova> provas9 = new ArrayList<Prova>();
		provas9.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas9.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas9.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno9.setProvas(provas9);
		aluno9.setBoletim(boletim9);
	    boletim9.calcularMedia(provas9);
		boletim9.verificarSituacao(boletim9.getMedia());
		boletim9.aplicarProvaFinal(boletim9.getSituacao(), aluno9, 8.0);
		alunos2.add(aluno9);
		
		Aluno aluno10 = new Aluno("Jorge");
		Boletim boletim10 = new Boletim();
		List<Prova> provas10 = new ArrayList<Prova>();
		provas10.add(new Prova(6.5, TipoProvaEnum.PROVA1));
		provas10.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas10.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno10.setProvas(provas10);
		aluno10.setBoletim(boletim10);
	    boletim10.calcularMedia(provas10);
		boletim10.verificarSituacao(boletim10.getMedia());
		boletim10.aplicarProvaFinal(boletim10.getSituacao(), aluno10, 8.0);
		alunos2.add(aluno10);
		
		Aluno aluno11 = new Aluno("Oruam");
		Boletim boletim11 = new Boletim();
		List<Prova> provas11 = new ArrayList<Prova>();
		provas11.add(new Prova(3.5, TipoProvaEnum.PROVA1));
		provas11.add(new Prova(2.0, TipoProvaEnum.PROVA2));
		provas11.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno11.setProvas(provas11);
		aluno11.setBoletim(boletim11);
	    boletim11.calcularMedia(provas11);
		boletim11.verificarSituacao(boletim11.getMedia());
		boletim11.aplicarProvaFinal(boletim11.getSituacao(), aluno11, 8.0);
		alunos2.add(aluno11);
		
		Aluno aluno12 = new Aluno("Bruno");
		Boletim boletim12 = new Boletim();
		List<Prova> provas12 = new ArrayList<Prova>();
		provas12.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas12.add(new Prova(6.0, TipoProvaEnum.PROVA2));
		provas12.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno12.setProvas(provas12);
		aluno12.setBoletim(boletim12);
	    boletim12.calcularMedia(provas12);
		boletim12.verificarSituacao(boletim12.getMedia());
		boletim12.aplicarProvaFinal(boletim12.getSituacao(), aluno12, 8.0);
		alunos2.add(aluno12);
		
		Aluno aluno13 = new Aluno("Victoria");
		Boletim boletim13 = new Boletim();
		List<Prova> provas13 = new ArrayList<Prova>();
		provas13.add(new Prova(7.5, TipoProvaEnum.PROVA1));
		provas13.add(new Prova(2.0, TipoProvaEnum.PROVA2));
		provas13.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno13.setProvas(provas13);
		aluno13.setBoletim(boletim13);
	    boletim13.calcularMedia(provas13);
		boletim13.verificarSituacao(boletim13.getMedia());
		boletim13.aplicarProvaFinal(boletim13.getSituacao(), aluno13, 8.0);
		alunos2.add(aluno13);
		
		Aluno aluno14 = new Aluno("Felipe");
		Boletim boletim14 = new Boletim();
		List<Prova> provas14 = new ArrayList<Prova>();
		provas14.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas14.add(new Prova(5.0, TipoProvaEnum.PROVA2));
		provas14.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno14.setProvas(provas14);
		aluno14.setBoletim(boletim14);
	    boletim14.calcularMedia(provas14);
		boletim14.verificarSituacao(boletim14.getMedia());
		boletim14.aplicarProvaFinal(boletim14.getSituacao(), aluno14, 8.0);
		alunos2.add(aluno14);
		
		Aluno aluno15 = new Aluno("Gabriel");
		Boletim boletim15 = new Boletim();
		List<Prova> provas15 = new ArrayList<Prova>();
		provas15.add(new Prova(7.5, TipoProvaEnum.PROVA1));
		provas15.add(new Prova(8.0, TipoProvaEnum.PROVA2));
		provas15.add(new Prova(8.5, TipoProvaEnum.PROVA3));
		aluno15.setProvas(provas15);
		aluno15.setBoletim(boletim15);
	    boletim15.calcularMedia(provas15);
		boletim15.verificarSituacao(boletim15.getMedia());
		boletim15.aplicarProvaFinal(boletim15.getSituacao(), aluno15, 8.0);
		alunos2.add(aluno15);
		
		Aluno aluno16 = new Aluno("Lucas");
		Boletim boletim16 = new Boletim();
		List<Prova> provas16 = new ArrayList<Prova>();
		provas16.add(new Prova(4.5, TipoProvaEnum.PROVA1));
		provas16.add(new Prova(2.0, TipoProvaEnum.PROVA2));
		provas16.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno16.setProvas(provas16);
		aluno16.setBoletim(boletim16);
	    boletim16.calcularMedia(provas16);
		boletim16.verificarSituacao(boletim16.getMedia());
		boletim16.aplicarProvaFinal(boletim16.getSituacao(), aluno16, 8.0);
		alunos2.add(aluno16);
		
		Aluno aluno17 = new Aluno("Andiara");
		Boletim boletim17 = new Boletim();
		List<Prova> provas17 = new ArrayList<Prova>();
		provas17.add(new Prova(5.5, TipoProvaEnum.PROVA1));
		provas17.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas17.add(new Prova(7.5, TipoProvaEnum.PROVA3));
		aluno17.setProvas(provas17);
		aluno17.setBoletim(boletim17);
	    boletim17.calcularMedia(provas17);
		boletim17.verificarSituacao(boletim17.getMedia());
		boletim17.aplicarProvaFinal(boletim17.getSituacao(), aluno17, 8.0);
		alunos2.add(aluno17);
		
		Aluno aluno18 = new Aluno("Tulio");
		Boletim boletim18 = new Boletim();
		List<Prova> provas18 = new ArrayList<Prova>();
		provas18.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas18.add(new Prova(7.0, TipoProvaEnum.PROVA2));
		provas18.add(new Prova(6.5, TipoProvaEnum.PROVA3));
		aluno18.setProvas(provas18);
		aluno18.setBoletim(boletim18);
	    boletim18.calcularMedia(provas18);
		boletim18.verificarSituacao(boletim18.getMedia());
		boletim18.aplicarProvaFinal(boletim18.getSituacao(), aluno18, 8.0);
		alunos2.add(aluno18);
		
		Aluno aluno19 = new Aluno("Cafeseiro");
		Boletim boletim19 = new Boletim();
		List<Prova> provas19 = new ArrayList<Prova>();
		provas19.add(new Prova(9.0, TipoProvaEnum.PROVA1));
		provas19.add(new Prova(10.0, TipoProvaEnum.PROVA2));
		provas19.add(new Prova(10.0, TipoProvaEnum.PROVA3));
		aluno19.setProvas(provas19);
		aluno19.setBoletim(boletim19);
	    boletim19.calcularMedia(provas19);
		boletim19.verificarSituacao(boletim19.getMedia());
		boletim19.aplicarProvaFinal(boletim19.getSituacao(), aluno19, 8.0);
		alunos2.add(aluno19);
		
		Aluno aluno20 = new Aluno("Tomas");
		Boletim boletim20 = new Boletim();
		List<Prova> provas20 = new ArrayList<Prova>();
		provas20.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas20.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas20.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno20.setProvas(provas20);
		aluno20.setBoletim(boletim20);
	    boletim20.calcularMedia(provas20);
		boletim20.verificarSituacao(boletim20.getMedia());
		boletim20.aplicarProvaFinal(boletim20.getSituacao(), aluno20, 8.0);
		alunos2.add(aluno20);
		
	}
	
	static {
		
		Aluno aluno1 = new Aluno("Tomas");
		Boletim boletim1 = new Boletim();
		List<Prova> provas1 = new ArrayList<Prova>();
		provas1.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas1.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas1.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno1.setProvas(provas1);
		aluno1.setBoletim(boletim1);
	    boletim1.calcularMedia(provas1);
		boletim1.verificarSituacao(boletim1.getMedia());
		boletim1.aplicarProvaFinal(boletim1.getSituacao(), aluno1, 8.0);
		alunos3.add(aluno1);
		
		Aluno aluno2 = new Aluno("Tomas");
		Boletim boletim2 = new Boletim();
		List<Prova> provas2 = new ArrayList<Prova>();
		provas2.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas2.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas2.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno2.setProvas(provas2);
		aluno2.setBoletim(boletim2);
	    boletim2.calcularMedia(provas2);
		boletim2.verificarSituacao(boletim2.getMedia());
		boletim2.aplicarProvaFinal(boletim2.getSituacao(), aluno2, 8.0);
		alunos3.add(aluno2);
		
		Aluno aluno3 = new Aluno("Tomas");
		Boletim boletim3 = new Boletim();
		List<Prova> provas3 = new ArrayList<Prova>();
		provas3.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas3.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas3.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno3.setProvas(provas3);
		aluno3.setBoletim(boletim3);
	    boletim3.calcularMedia(provas3);
		boletim3.verificarSituacao(boletim3.getMedia());
		boletim3.aplicarProvaFinal(boletim3.getSituacao(), aluno3, 8.0);
		alunos3.add(aluno3);
		
		Aluno aluno4 = new Aluno("Tomas");
		Boletim boletim4 = new Boletim();
		List<Prova> provas4 = new ArrayList<Prova>();
		provas4.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas4.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas4.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno4.setProvas(provas4);
		aluno4.setBoletim(boletim4);
	    boletim4.calcularMedia(provas4);
		boletim4.verificarSituacao(boletim4.getMedia());
		boletim4.aplicarProvaFinal(boletim4.getSituacao(), aluno4, 8.0);
		alunos3.add(aluno4);
		
		Aluno aluno5 = new Aluno("Tomas");
		Boletim boletim5 = new Boletim();
		List<Prova> provas5 = new ArrayList<Prova>();
		provas5.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas5.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas5.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno5.setProvas(provas5);
		aluno5.setBoletim(boletim5);
	    boletim5.calcularMedia(provas5);
		boletim5.verificarSituacao(boletim5.getMedia());
		boletim5.aplicarProvaFinal(boletim5.getSituacao(), aluno5, 8.0);
		alunos3.add(aluno5);
		
		Aluno aluno6 = new Aluno("Tomas");
		Boletim boletim6 = new Boletim();
		List<Prova> provas6 = new ArrayList<Prova>();
		provas6.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas6.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas6.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno6.setProvas(provas6);
		aluno6.setBoletim(boletim6);
	    boletim6.calcularMedia(provas6);
		boletim6.verificarSituacao(boletim6.getMedia());
		boletim6.aplicarProvaFinal(boletim6.getSituacao(), aluno6, 8.0);
		alunos3.add(aluno6);
		
		Aluno aluno7 = new Aluno("Tomas");
		Boletim boletim7 = new Boletim();
		List<Prova> provas7 = new ArrayList<Prova>();
		provas7.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas7.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas7.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno7.setProvas(provas7);
		aluno7.setBoletim(boletim7);
	    boletim7.calcularMedia(provas7);
		boletim7.verificarSituacao(boletim7.getMedia());
		boletim7.aplicarProvaFinal(boletim7.getSituacao(), aluno7, 8.0);
		alunos3.add(aluno7);
		
		Aluno aluno8 = new Aluno("Tomas");
		Boletim boletim8 = new Boletim();
		List<Prova> provas8 = new ArrayList<Prova>();
		provas8.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas8.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas8.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno8.setProvas(provas8);
		aluno8.setBoletim(boletim8);
	    boletim8.calcularMedia(provas8);
		boletim8.verificarSituacao(boletim8.getMedia());
		boletim8.aplicarProvaFinal(boletim8.getSituacao(), aluno8, 8.0);
		alunos3.add(aluno8);
		
		Aluno aluno9 = new Aluno("Tomas");
		Boletim boletim9 = new Boletim();
		List<Prova> provas9 = new ArrayList<Prova>();
		provas9.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas9.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas9.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno9.setProvas(provas9);
		aluno9.setBoletim(boletim9);
	    boletim9.calcularMedia(provas9);
		boletim9.verificarSituacao(boletim9.getMedia());
		boletim9.aplicarProvaFinal(boletim9.getSituacao(), aluno9, 8.0);
		alunos3.add(aluno9);
		
		Aluno aluno10 = new Aluno("Tomas");
		Boletim boletim10 = new Boletim();
		List<Prova> provas10 = new ArrayList<Prova>();
		provas10.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas10.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas10.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno10.setProvas(provas10);
		aluno10.setBoletim(boletim10);
	    boletim10.calcularMedia(provas10);
		boletim10.verificarSituacao(boletim10.getMedia());
		boletim10.aplicarProvaFinal(boletim10.getSituacao(), aluno10, 8.0);
		alunos3.add(aluno10);
		
		Aluno aluno11 = new Aluno("Tomas");
		Boletim boletim11 = new Boletim();
		List<Prova> provas11 = new ArrayList<Prova>();
		provas11.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas11.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas11.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno11.setProvas(provas11);
		aluno11.setBoletim(boletim11);
	    boletim11.calcularMedia(provas11);
		boletim11.verificarSituacao(boletim11.getMedia());
		boletim11.aplicarProvaFinal(boletim11.getSituacao(), aluno11, 8.0);
		alunos3.add(aluno11);
		
		Aluno aluno12 = new Aluno("Tomas");
		Boletim boletim12 = new Boletim();
		List<Prova> provas12 = new ArrayList<Prova>();
		provas12.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas12.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas12.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno12.setProvas(provas12);
		aluno12.setBoletim(boletim12);
	    boletim12.calcularMedia(provas12);
		boletim12.verificarSituacao(boletim12.getMedia());
		boletim12.aplicarProvaFinal(boletim12.getSituacao(), aluno12, 8.0);
		alunos3.add(aluno12);
		
		Aluno aluno13 = new Aluno("Tomas");
		Boletim boletim13 = new Boletim();
		List<Prova> provas13 = new ArrayList<Prova>();
		provas13.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas13.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas13.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno13.setProvas(provas13);
		aluno13.setBoletim(boletim13);
	    boletim13.calcularMedia(provas13);
		boletim13.verificarSituacao(boletim13.getMedia());
		boletim13.aplicarProvaFinal(boletim13.getSituacao(), aluno13, 8.0);
		alunos3.add(aluno13);
		
		Aluno aluno14 = new Aluno("Tomas");
		Boletim boletim14 = new Boletim();
		List<Prova> provas14 = new ArrayList<Prova>();
		provas14.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas14.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas14.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno14.setProvas(provas14);
		aluno14.setBoletim(boletim14);
	    boletim14.calcularMedia(provas14);
		boletim14.verificarSituacao(boletim14.getMedia());
		boletim14.aplicarProvaFinal(boletim14.getSituacao(), aluno14, 8.0);
		alunos3.add(aluno14);
		
		Aluno aluno15 = new Aluno("Tomas");
		Boletim boletim15 = new Boletim();
		List<Prova> provas15 = new ArrayList<Prova>();
		provas15.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas15.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas15.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno15.setProvas(provas15);
		aluno15.setBoletim(boletim15);
	    boletim15.calcularMedia(provas15);
		boletim15.verificarSituacao(boletim15.getMedia());
		boletim15.aplicarProvaFinal(boletim15.getSituacao(), aluno15, 8.0);
		alunos3.add(aluno15);
		
		Aluno aluno16 = new Aluno("Tomas");
		Boletim boletim16 = new Boletim();
		List<Prova> provas16 = new ArrayList<Prova>();
		provas16.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas16.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas16.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno16.setProvas(provas16);
		aluno16.setBoletim(boletim16);
	    boletim16.calcularMedia(provas16);
		boletim16.verificarSituacao(boletim16.getMedia());
		boletim16.aplicarProvaFinal(boletim16.getSituacao(), aluno16, 8.0);
		alunos3.add(aluno16);
		
		Aluno aluno17 = new Aluno("Tomas");
		Boletim boletim17 = new Boletim();
		List<Prova> provas17 = new ArrayList<Prova>();
		provas17.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas17.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas17.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno17.setProvas(provas17);
		aluno17.setBoletim(boletim17);
	    boletim17.calcularMedia(provas17);
		boletim17.verificarSituacao(boletim17.getMedia());
		boletim17.aplicarProvaFinal(boletim17.getSituacao(), aluno17, 8.0);
		alunos3.add(aluno17);
		
		Aluno aluno18 = new Aluno("Tomas");
		Boletim boletim18 = new Boletim();
		List<Prova> provas18 = new ArrayList<Prova>();
		provas18.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas18.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas18.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno18.setProvas(provas18);
		aluno18.setBoletim(boletim18);
	    boletim18.calcularMedia(provas18);
		boletim18.verificarSituacao(boletim18.getMedia());
		boletim18.aplicarProvaFinal(boletim18.getSituacao(), aluno18, 8.0);
		alunos3.add(aluno18);
		
		Aluno aluno19 = new Aluno("Tomas");
		Boletim boletim19 = new Boletim();
		List<Prova> provas19 = new ArrayList<Prova>();
		provas19.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas19.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas19.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno19.setProvas(provas19);
		aluno19.setBoletim(boletim19);
	    boletim19.calcularMedia(provas19);
		boletim19.verificarSituacao(boletim19.getMedia());
		boletim19.aplicarProvaFinal(boletim19.getSituacao(), aluno19, 8.0);
		alunos3.add(aluno19);
		
		Aluno aluno20 = new Aluno("Tomas");
		Boletim boletim20 = new Boletim();
		List<Prova> provas20 = new ArrayList<Prova>();
		provas20.add(new Prova(2.5, TipoProvaEnum.PROVA1));
		provas20.add(new Prova(3.0, TipoProvaEnum.PROVA2));
		provas20.add(new Prova(5.5, TipoProvaEnum.PROVA3));
		aluno20.setProvas(provas20);
		aluno20.setBoletim(boletim20);
	    boletim20.calcularMedia(provas20);
		boletim20.verificarSituacao(boletim20.getMedia());
		boletim20.aplicarProvaFinal(boletim20.getSituacao(), aluno20, 8.0);
		alunos3.add(aluno20);
	}
	
	public List<Aluno> getAlunos1(){
		return AlunoDB.alunos1;
	}
	
	public List<Aluno> getAlunos2(){
		return AlunoDB.alunos2;
	}
	
	public List<Aluno> getAlunos3(){
		return AlunoDB.alunos3;
	}
	
	public List<Aluno> getAll() {
		List<Aluno> todosAlunos = new ArrayList<Aluno>();
		todosAlunos.addAll(AlunoDB.alunos1);
		todosAlunos.addAll(AlunoDB.alunos2);
		todosAlunos.addAll(AlunoDB.alunos3);
 		return todosAlunos;
	}
	
	public List<Prova> getProvas(){
		return provas;
	}
	

}
