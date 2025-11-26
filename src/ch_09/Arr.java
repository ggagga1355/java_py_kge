package ch_09;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오름차순으로 정렬
		int[] arr = {1,8,9,6,3,12,5,10};
		
		int temp = 0;
		
		for(int i = arr.length; i > 0; i++) {
			for(int j = 0; j < i; j++) {
				//앞의 값이 뒤의 값보다 크다면
				if(arr[] > arr[]+1) {
					//두 변수의 값을 바꾸기
					temp = arr[]+1;
					arr[j+i] = arr[j];
					arr[j] = temp;
				}
			
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
