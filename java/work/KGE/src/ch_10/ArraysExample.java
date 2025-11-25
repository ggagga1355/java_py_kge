package ch_10;

import java.util.*;

public class ArraysExample {

	public static void main(String[] args) {
		//arrays클래스
		//배열의 복사, 정렬, 검색 등
		//배열을 다루기 위한 다양한 메서드를 가지고 있다.
		
		//자바는 클래스가 함수를 가지고 있다.
		//클래스를 객체화 해서 메서드(함수)를 호출해야 한다.
		//변수 = new 생성자() -> 객체 생성
		//변수명 메서드명() -> 메서드 호출
		
		//Scanner, Random 클래스에 있는 기능을 가져올 때
		
		//Arrays는 객체의 생성 없이 호출해서 쓸 수 있다.
		//static -> 객체의 생성없이 홀출하는 것이 가능하다.
		// ㄴ 클래스의 붙어있는 변수를 만들거나 메서드를 만들때 붙이는 키워드
		//메모리에 무조건 한번만 올라간다.
		
		//toString()
		//배열의 출력
		
		int[] arr = {1,23,4,5,6,7,8,9,10};

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		for(int i : arr) {
		//	System.out.println(arr[i]+ " "); 
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		//sort()
		//배열의 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순
		//Comparator.reverseOrder()
		//기본타입의 배열로는 불가능하다.
		//기본자료형의 클래스타입이 필요하다. -> Wrapper 클래스
//		Integer[] ar = {1,6,3,2,10,7,5,9,4,8};
//		Arrays.sort(arr,Comparator.reverseOrder());
//		System.out.println(Arrays.toString(ar));
	
		//배열의 복사
		//자바에서 배열은 한 번 생성하면 길이 변경할 수 없
		//더 많은 데이터를 저장해야 하거나 기존의 밸과 같은배열을 만드려면
		//배열을복사
		
		//얕은 복사(Shallow copy)
		int[] arr01 = {1,2,3};
		System.out.println(arr01);
		
		int[] arr02 = arr01;
		System.out.println(arr02);
		
		System.out.println("arr02 배열 : "+ Arrays.toString(arr02));
	
		arr01[1] = 20;
		System.out.println("arr02 배열 : "+ Arrays.toString(arr02));
	
		//깊은 복사
		//반복문을 이용해서 새로운 배열에 값을 직접 넣거나
		//Arrays클래스 또는 System 클래스가 가진 기능을 이용한다.
		
		int[] cards = {1,6,4,5,3,2};
		int[] newCards = new int[cards.length];
		
		//1. 반복문을 이용한 깊은 복사
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		System.out.println(Arrays.toString(cards));
				
		//2. Arrays클래스를 이용한
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		
		cards[1] = 100;
		System.out.println(Arrays.toString(cards));//[1, 100, 4, 5, 3, 2]
		System.out.println(Arrays.toString(newCards));//[1, 6, 4, 5, 3, 2]
		System.out.println(Arrays.toString(newCards2));//[1, 6, 4, 5, 3, 2]
		
		
		
		
	}		
}





