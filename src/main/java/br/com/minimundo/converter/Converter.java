package br.com.minimundo.converter;

import java.util.ArrayList;
import java.util.List;

import br.com.minimundo.dto.AlunoDTO;
import br.com.minimundo.model.Aluno;

public class Converter {

	public List<AlunoDTO> converterToDTO(List<Aluno> alunos) {
		
		List<AlunoDTO> dtos = new ArrayList<AlunoDTO>();
		
		for(Aluno aluno : alunos){
			AlunoDTO dto = new AlunoDTO(aluno);
			dtos.add(dto);
		}
		return dtos;
	}
}
