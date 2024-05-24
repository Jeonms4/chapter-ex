package object_ex;

public class Student {
	private int no;
	private String name;
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
//		super();
//		this.no = no;
//		this.name = name;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
//	public int getNo() {
//		return no;
//	}
//	
//	public void setNo(int no) {
//		this.no = no;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int hashcode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
//		int hash = no + name.hashCode();
//		return 0;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			Student stu = (Student) obj;
			if(this.studentNum.equals(target.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
}
