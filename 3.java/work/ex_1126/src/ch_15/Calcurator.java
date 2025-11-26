package ch_15;

public class Calcurator {
	//리턴값이 없는 powerOn메서드 만들기
	//매개변수 없음
	//기능 : "전원을 킵니다" 문자열 출력
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//두 수를 더하는 plus 메서드 만들기
	//반환형 : int
	//매개변수 : 정수형 변수 2개
	//기능 : 두수를 더하여 반환
	public int plus(int a, int b) {
		return a+b;
	}
	
	//두 수를 나누는 divide 메서드 작성하기
	//반환형 : double
	//매개변수 : 정수형 변수 2개
	//기능 : 두수를 나누어 반환
	public double divide(int a, int b) {
		int c;
		if(a < b) {
			c = a;
			a = b;
			b = c;
			return (double)a / b;
		} else return (double)a / b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
