import java.util.List;

public class StudentService {
	private StudentRepository studentRepository = new StudentRepository();

	public void addStudent(Student student) {
		if (student.getCourse().equals("SI")) {
			studentRepository.AddStudent(student);
		}
	}

	// ATUALIZA SOMENTE SE O CURSO NAO FOI ALTERADO
	public void removeStudent(Student student) {
		this.studentRepository.deleteStudent(student);
	}

	public List<Student> listAll() {
		return this.studentRepository.readAll(null);
	}

}
