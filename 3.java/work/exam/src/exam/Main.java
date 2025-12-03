package exam;

public class Main {
	public static void main(String[] args) {
		//1번
		Student s1 = new Student("홍길동", 20, "컴퓨터공학");
		s1.printInfo();
		
		//2번
		Calculator cal = new Calculator();
		System.out.println(cal.add(2, 8));
		System.out.println(cal.subtaract(8, 2));
		System.out.println(cal.multiply(2, 8));
		System.out.println(cal.divide(8, 0));
		
		//3번
		Point p = new Point(3,5);
		p.printPoint();
		
		//4번
		Printer printer = new Printer();
		printer.print("문자열");
//		printer.print(10);
//		printer.print(3.14);
		
		
		//6번
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		for(Animal animal : animals) {
			animal.sound();
		}
		
		//7번
		Shape[] shape = new Shape[2];
		
		shape[0] = new Rectangle(4, 5);
		shape[1] = new Circle(3);
		
		System.out.println(shape[0].area());
		System.out.println(shape[1].area());
		
		//8번
		Movable car = new Car();
		car.move(10, 20);
		
		//9번
		Printable[] pt = new Printable[2];
		pt[0] = new ConsolePrinter();
		pt[1] = new FilePrinter();
		
		for(Printable printable : pt) {
			printable.print("Hello");
		}
		
		//10번
		SavingsAccount sa = new SavingsAccount();
		sa.withdraw(30000);
		sa.withdraw(80000);
		
		
		
		
		
		
	}
}
