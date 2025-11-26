package ch_16;

import java.util.Scanner;

public class Exam1 {
	//배열의 최대값을 찾는 maxFinder메서드 만들기
	//최대값을 찾아서 반환하기
//	public int maxFinder(int[] arr) {
//		outer : for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(arr[i] > arr[j]) {
//					return arr[i];
//				} else continue outer;
//			}
//			
//		}
//		
//		
//	}	
	public int maxFinder(int[] arr) {
		int max = 0;
		for(int v : arr) {
			if(v > max) {
				max = v;
			}
		}
		return max;
	}
	
	//원의 넓이를 구하는 circleArea메서드 만들기
	//원의 넓이 = 3.14 * r * r
	
	public int circleArea(int a) {
		int result = 0;
		result += 3.14 * a * a;
		return result;
	}
	
	//원의 둘레를 구하는 circleRound메서드 만들기
	//원의 둘레 : 2 * 3.14 * r
	//출력
	public void circleRound(int r) {
		int res = 0;
		res += 2 * 3.14 * r;
		System.out.println(res);
	}
	
	//화씨를 섭씨로 바꾸는 FToc
	//(화씨-32)/1.8
	//함수를 실행하면 온도를 입력받아서 출력하기
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		double faher;
		System.out.print("화씨를 입력하세요 : ");
		faher = sc.nextInt();
		double re = (faher - 32) / 1.8;
		System.out.println(re);
	} 
	
	//숫자 두개의 연산자를 매개변수로 받아서 사칙연산을 하는 calc메서드 만들기
	//매개변수 : 정수 2개, 문자열 1개
	
	public int calc(int a, int b, String op) {
		if(op.equals("+")){
				return a + b;
		} else if(op.equals("-")) {
			return a - b;
		} else if(op.equals("*")) {
			return a * b;
		} else if(op.equals("/")) {
			return a / b;
		} else {
			System.out.println("연산기호가 올바르지 않습니다.");
			return -1;
		}		
	}
	
	
}
