package ch05;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		//1~10까지 출력하는 for문 작성
		//가로로
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		//10~1까지 출력하는 for문 작성
		for(int i = 10; i >= 1; i--) {			
			System.out.print(i+ " ");
		}
		System.out.print("\n");
		
		//1~10사이 3의 배수만		
		for(int i = 1; i <= 10;i++) {
			if(i % 3 == 0) {
				System.out.print(i+ " ");
			}			
		}
		
		//1~10총합
		System.out.print("\n");
		int sum = 0;
		for(int i = 1; i <= 10;i++) {
			sum += i;			
		}
		System.out.println(sum);
		
		//입력받고 구구단 출력		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}	
		
		// 키보드에서 숫자 두개를 입력받아서
		//받은 숫자 x부터 y까지의 총합 구하기
		//x가 y보다 크다면 값을 서로 교환해서 총합 구하기
		System.out.print("x 입력 : ");
		int x = sc.nextInt();
		System.out.print("y 입력 : ");
		int y = sc.nextInt();		
		
		if(x > y) {
			int ch = x;
			x = y;
			y = ch;					
		}
		int plus = 0;
		for(int i = x; i <= y; i++) {
			plus += i;
		}		
		System.out.println(plus);
		
		//1~20까지 정수 중 2의 배수가 아니면서 3의 배수가 아닌 수의 총합을 구하기
		int total = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {				
				total += i;
			}
		}
		System.out.println("총합 : " + total);
		
		//int 타입의 num 변수에 12345를 대입한다.
		//각 자리수의 합을 구한 결과를 출력하는 코드 작성
		// 1 + 2 + 3 + 4 + 5 = 15
		
		int num = 12345;
		int total2 = 0;
				
		while(num > 0) {
			total2 += num % 10; // 0 + 5 + 4 + 3 + 2 + 1
			num = num / 10;//1234 123 12 1 0 
		}
		System.out.println(total2);
		
		//1 + (1+2) + (1+2+3)+(1+2+3+4)+....(1 +...10)
		int total3 = 0;
		int r = 0;
		
		for(int i = 1; i <= 10; i++) {
			total3 += i; // 1 + 2 + 3....
			r += total3; // 1 + (1+2) + (1+2+3)...
		}
		System.out.println(r);
		
		
	}
}
