package studentDao;

public class StudentDto {
	
	// Student Project(id,name,rollNo,age,marks);

	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	private String studentName;
	private int studentId;
	private int rollNo;
	private int age;
	private String yearOfPassOut;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getYearOfPassOut() {
		return yearOfPassOut;
	}
	public void setYearOfPassOut(String yearOfPassOut) {
		this.yearOfPassOut = yearOfPassOut;
	}
	@Override
	public String toString() {
		return "StudentDto [studentName=" + studentName + ", studentId=" + studentId + ", rollNo=" + rollNo + ", age="
				+ age + ", yearOfPassOut=" + yearOfPassOut + "]";
	}
	
	
	

}
