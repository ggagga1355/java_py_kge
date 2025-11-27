package singleton;

public class Counter {
	//필드로 정수형 타입의 count를 가진다.
	private int count = 0;
	
	private static Counter counter = new Counter();
	
	//'외부'에서 new Counter로 객체 생성을 하지 못한다.
	private Counter() {
		
	};
	
	//getInstance()메서드로만 객체의 정보를 얻을 수 있다.
	//ㄴ역할 : 만들어진 객체의 주소값을 전달하는 것
  //접근제한자	       반환타입    메서드명
	public static Counter getInstance() { //
		return counter;
	}
	
	//increment()메서드를 호출하면 count가 1 증가한다.
	public void increment() {
		count++;
	}
	
	//getCount()메서드로 현재 count값을 조회할 수 있다.
	public int getCount() {
		return count; 
	}
	
	
	
}
 