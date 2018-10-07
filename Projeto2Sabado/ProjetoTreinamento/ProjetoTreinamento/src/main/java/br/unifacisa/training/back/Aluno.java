package br.unifacisa.training.back;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aluno {
 
	@Id
	private String id;
	private String nome;
	private Long matricula;
	
}
