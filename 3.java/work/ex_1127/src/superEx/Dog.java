package superEx;

public class Dog extends Animal {
	int age;
	
	@Override
	public void info() {
		System.out.println("이름 : "+name + ", 나이 : " + age);
	}
	
	
}
