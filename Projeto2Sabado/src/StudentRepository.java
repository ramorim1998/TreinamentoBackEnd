import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	private List<Student> dbStudents = new ArrayList<Student>();
	private Long sequenceStudents = 0L;

	public Student AddStudent(Student student) {
		student.setId(this.sequenceStudents);
		dbStudents.add(student);
		this.incSequenceStudent();
		return student;
	}

	public Student updateStudent(Student student) {
		for (int i = 0; i < dbStudents.size(); i++) {
			Student studentActual = dbStudents.get(i);
			if (studentActual.equals(student)) {
				dbStudents.add(i, student);
				break;
			}
		}

		return student; // RETORNA ESTUDANTE ATUALIZADO
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < dbStudents.size(); i++) {
			Student studentActual = dbStudents.get(i);
			if (studentActual.equals(student)) {
				dbStudents.remove(i);
			}

		}
	}

	public List<Student> readAll(Student student) {
		return this.dbStudents;
	}
	private void incSequenceStudent() {
		this.sequenceStudents++;
	}
}
