package ex_abstract;

//추상 클래스와 추상 메서드
//추상 클래스
//공통 뼈대만 가진 미완성의 설계도
//abstract키워드로 선언되고 하나이상인 추상 메서드를 포함하고 있는 클래스다
//
public abstract class Animal {
	//필드, 생성자, 일반 메서드도 가질 수 있다.
//	String name;
//	
//	public Animal(String name) {
//		this.name = name;
//	}
//	
//	public void printName() {
//		System.out.println("이름 : " + name);
//	}
//		
	//추상메서드
	//메서드의 구현부가 없고 세미콜론으로 끝난다.
	//자식들이 꼭 만들어야 하는 메서드의 이름과 형태만 정의한 것
	public abstract void sound() {
		System.out.println("동물이 소리를 낸다.");
	}	
}

	//상속받는 자식 클래스는 추상 메서드를 반드시 구현해야 한다.
class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}





