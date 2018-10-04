import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Classroom classroom = new Classroom(3223,false,12);
		
		List<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i < 10; i++) {
			students.add(new Student((i*i + 3),"fulation" + i, "system of info"));
			
		}
		List<Classroom> listOfClassrooms = new ArrayList<Classroom>();
		listOfClassrooms.add(classroom);
		Team team = new Team(students, listOfClassrooms, 2);
		
		System.out.println(team);
	}
}
