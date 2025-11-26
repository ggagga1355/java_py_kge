package ch_16;

public class CalMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//길이가 4인 정사각형의 넓이 출력
		double result = calc.areaRectangle(4);
		System.out.println("정사각형의 넓이 : " + (int)result);
		
		//가로 5, 세로 10인 직사각형 넓이 출력
		result = calc.areaRectangle(5, 10);
		System.out.println("직사각형 넓이 : " + result);
		
		System.out.println(Calculator.pi);
		System.out.println(calc.pi);
		
		Calculator.plus(10, 5);
		
		
	}
}
