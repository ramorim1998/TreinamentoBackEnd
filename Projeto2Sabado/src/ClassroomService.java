
public class ClassroomService {
	private ClassroomRepository classroomRepository = new ClassroomRepository();
	
	public void addClassroom(Classroom classroom) {
		if (classroom.getAvailability().equals(true)) {
			classroomRepository.AddClassroom(classroom);
		}
	}
}
