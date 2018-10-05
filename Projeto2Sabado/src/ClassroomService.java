import java.util.List;

public class ClassroomService {
	private ClassroomRepository classroomRepository = new ClassroomRepository();
	
	public void addClassroom(Classroom classroom) {
		if (classroom.getAvailability().equals(true)) {
			classroomRepository.AddClassroom(classroom);
		}
	}
	public void removeClassroom(Classroom classroom) {
		this.classroomRepository.deleteClassroom(classroom);
	}
	public List<Classroom> listAll(){
		return this.classroomRepository.readAll(null);
	}
}
