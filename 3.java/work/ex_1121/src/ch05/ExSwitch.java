package ch05;
import java.util.Scanner;

public class ExSwitch {
	public static void main(String[] args) {
		
		//swich의 기본형
		//switch(비교값) {
		//  case 조건값1:
		//		비교값과 조건값이 일치할 때 실행할 문장.
		//		break;
		//  case 조건값2:
		//		비교값과 조건값이 일치할 때 실행할 문장.
		//		break;
		//  case 조건값3:
		//		비교값과 조건값이 일치할 때 실행할 문장.
		//		break;
		//	default:
		//		비교값과 일치하는 조건값이 없을 때 실행할 문장.
			//  break;
		//}
		
		//키보드에서 1~12사이의 월(月)을 입력받아서 month 변수에 저장
		//해당 월이 몇일까지 있는지 출력하세요
		//5월 -> 5월은 31일까지 있습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 :");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:			
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일까지 있습니다.\n",month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일까지 있습니다.\n",month);
			break;
		case 2:
			System.out.printf("%d월은 28일 또는 29일까지 있습니다.\n",month);
			break;
		}
		
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();
		
		switch(op) {
		case "+":
			System.out.printf("결과 : %d %s %d = %d\n",a,op,b,a+b);
			break;
		case "-":
			System.out.printf("결과 : %d %s %d = %d\n",a,op,b,a-b);
			break;
		case "*":
			System.out.printf("결과 : %d %s %d = %d\n",a,op,b,a*b);
			break;
		case "/":
			if(b == 0) {
				System.out.println("정수를 0으로 나눌 수 없습니다.");
			} else {
				System.out.printf("결과 : %d %s %d = %d\n",a,op,b,a/b);
			}			
			break;			
		}
		
		
		
		
		
		
		}
		
		
	}

