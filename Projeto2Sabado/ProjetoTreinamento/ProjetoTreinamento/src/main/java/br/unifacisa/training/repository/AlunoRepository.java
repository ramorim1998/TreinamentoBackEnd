package br.unifacisa.training.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.treinamento.Student;

@Repository
public interface AlunoRepository extends MongoRepository<Student, String>{
	
}
