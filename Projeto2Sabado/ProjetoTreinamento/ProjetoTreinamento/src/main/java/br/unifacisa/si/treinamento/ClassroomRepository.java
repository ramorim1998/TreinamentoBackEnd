package br.unifacisa.si.treinamento;
import java.util.ArrayList;
import java.util.List;
public class ClassroomRepository {
	private List<Classroom> dbClassrooms = new ArrayList<Classroom>();
	private Long  sequenceClassroom = 0L;
	
	public Classroom AddClassroom(Classroom classroom) {
		classroom.setId(this.sequenceClassroom);
		dbClassrooms.add(classroom);
		this.incSequenceClassroom();
		return classroom;
	}
	private void incSequenceClassroom() {
		this.sequenceClassroom++;
	}

}
