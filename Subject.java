
public class Subject {
	String nazwa;
	Person teacher;
	Student student;
	int i;
	Person[] studentsList = new Person[20];
	
	
	public Subject(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void setTeacher(Person person) {
		this.teacher = person;
	}
	
	

	public void addStudent(Student student) throws TooManyStudentsException{
		this.student = student;
		
		for(i = 0; i < studentsList.length; i++) {
			studentsList[i] = student;
		}
		
	}
	
	
	
	
	
	
	public String toString() {
		return nazwa + ", " + "teacher: " + teacher.imie + ", students: " + student.imie;
	}
}
