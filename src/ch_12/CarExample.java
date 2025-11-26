package ch_12;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "소나타";
		c1.start = false;
		c1.speed = 60;
		c1.color = "Black";
		
		//클래스에 포함된 필드들을 출력하기
		System.out.println(c1.model);
		System.out.println(c1.start);
		System.out.println(c1.speed);
		
		c1.color = "white";
		System.out.println(c1.color);
		
		//자동차 객체 c2 만들기
		//c2의 필드값 출력하기
		Car c2 = new Car();
		c2.model = "소나타";
		c2.start = false;
		c2.speed = 60;
		c2.color = "white";
		System.out.println(c2.model);
		System.out.println(c2.start);
		System.out.println(c2.speed);
		System.out.println(c2.color);
		
		//클래스에 정의하지 않은 변수는 추가를 못한다.
		//클래스에서 정의만 하고 직접 추가하는 방법도 있다.
		
	}

}
