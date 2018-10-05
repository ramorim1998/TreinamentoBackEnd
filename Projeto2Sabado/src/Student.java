
public class Student {
	private Integer register;
	private String name;
	private String course;
	private Long id;

	public Student(Integer register, String name, String course) {
		this.register = register;
		this.name = name;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRegister() {
		return register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setRegister(Integer register) {
		this.register = register;
	}

	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + ", course=" + course + "]";
	}

	public boolean equals(Student student) {
		return id.equals(student.id);
	}

}
