package ch_16;

public class StudentMain {
	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동",95,85,90);
		
		System.out.println("이름 : " + st1.name);
		System.out.println("총점 : " + st1.getTotal());
		System.out.println("평균 : " + st1.getAverage());
		System.out.println("학점 : " + st1.getGrade());		
	}
}
