package superEx;

import overriding.Student;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "쭈";
		animal.info();
		
		Dog dog = new Dog();
		dog.name = "쭈";
		dog.age = 11;
		System.out.println("나이 : " + dog.age + "살");
		dog.info();
		
		Student st = new Student();
		st.introduce();
		
		
		
		
		
		
	}
}
