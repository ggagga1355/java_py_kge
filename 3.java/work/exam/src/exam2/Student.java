package exam2;

public class Student extends Person {
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void introduce() {
		System.out.println("이름: "+name+", 나이: "+age+", 전공: "+major);
	}
	
	
}
