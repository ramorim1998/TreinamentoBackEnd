package br.unifacisa.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.treinamento.Student;
import br.unifacisa.training.back.Aluno;
import br.unifacisa.training.repository.AlunoRepository;

@Service
public class AlunoService{
	@Autowired
	private AlunoRepository repository;
	
	public Student criarAluno( Student aluno) {
		return repository.insert(aluno);
	}
	@Override
	public void run(String... args) throws Exception{
		Student aluno = new Student(null, null, null);
		aluno.setName("wesley");
		
	} 

}