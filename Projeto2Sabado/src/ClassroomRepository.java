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
	public Classroom updateClassroom(Classroom classroom) {
		for (int i = 0; i < dbClassrooms.size(); i++) {
			Classroom classroomActual = dbClassrooms.get(i);
			if (classroomActual.equals(classroom)) {
				dbClassrooms.add(i, classroom);
				break;
			}
		}

		return classroom; // RETORNA CLASSE ATUALIZADO
	}
	public void deleteClassroom(Classroom classroom) {
		for (int i = 0; i < dbClassrooms.size(); i++) {
			Classroom classroomActual = dbClassrooms.get(i);
			if (classroomActual.equals(classroom)) {
				dbClassrooms.remove(i);
			}

		}
	}
		public List<Classroom> readAll(Classroom classroom) {
			return this.dbClassrooms;
		}

	private void incSequenceClassroom() {
		this.sequenceClassroom++;
	}

}
