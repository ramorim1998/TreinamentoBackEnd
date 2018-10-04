import java.util.List;

public class StudentService {
	private StudentRepository studentRespository = new StudentRepository();
	
	public void addStudent(Student student) {
		if (student.getCourse().equals("SI")) {
			studentRespository.AddStudent(student);
		}
	}
	//ATUALIZA SOMENTE SE O CURSO NAO FOI ALTERADO
	public void removeStudent(Student student) {
		this.studentRespository.deleteStudent(student);
	}
	
	public List<Student> listAll(){
		return this.studentRespository.readAll(null);
	}
	

}
