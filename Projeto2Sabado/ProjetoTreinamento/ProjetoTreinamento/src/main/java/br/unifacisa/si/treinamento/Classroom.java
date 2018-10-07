package br.unifacisa.si.treinamento;
import java.util.List;

public class Classroom {
	private Integer number;
	private List<Student> students;
	private Boolean availability;
	private Integer capacity;
	private Long id;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Classroom(Integer number, Boolean availability, Integer capacity) {
		super();
		this.number = number;
		this.availability = availability;
		this.capacity = capacity;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Classroom [number=" + number + ", students=" + students + ", availability=" + availability
				+ ", capacity=" + capacity + "]";
	}
	public boolean equals (Classroom classroom) {
		return id.equals(classroom.id);
	}
	
	

}
