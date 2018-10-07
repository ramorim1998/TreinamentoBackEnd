package br.unifacisa.training.back;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {

	@Id
	private String id;
	
	@DBRef
	private Sala sala;
	
	@DBRef
	private ArrayList<Aluno> alunos	= new ArrayList<Aluno>();
	
	private Short periodo;
	
}
