package ch_16;

public class Exam1Main {
	public static void main(String[] args) {
		//다른 클래스에 있는 메서드를 사용하려면 해당 클래스의 객체를 만들어야 한다.
		//객체 생성 방법
		//클래스명 변수명 = new 클래스명();
		//		  ㄴ주소값을 받는다 ㄴ객체
		
		//클래스명 변수명;
		//변수명 = new 클래스명();
		Exam1 ex = new Exam1();
		
		int[] arr = {1,2,3,4,5};
		int result = ex.maxFinder(arr);
		System.out.println("최대값 : " + result);
		
		int res = ex.circleArea(5);
		System.out.println(res);
		
		ex.circleRound(5);
		
		ex.fToc();
		
		System.out.println(ex.calc(5, 6, "+"));
		
		//구구단
		TimeTable tt = new TimeTable();
		tt.showTable(5);
		
		
		
	}
}
