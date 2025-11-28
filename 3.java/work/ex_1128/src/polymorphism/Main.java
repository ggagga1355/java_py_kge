package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		//자동차 객체 만들기
		Car myCar = new Car();
		
		//필드의 다형성
		//Car클래스의 필드인 tire에 tire객체를 대입
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체를 대입
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		Driver driver = new Driver();
		
		//Bus bus = new Bus();
		//driver.drive(bus);
		
		driver.drive(new Bus());
		
//		Taxi taxi = new Taxi();
//		driver.drive(taxi);
		driver.drive(new Taxi());
		
		
	}
}
