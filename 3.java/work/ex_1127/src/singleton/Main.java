package singleton;

public class Main {
	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		
		c1.increment();
		c2.increment();
		c2.increment();
		
		//c1, c2의 count값 조회
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		
		//모를때마다 찾아보기(횟수가 늘어나면 머리속에 들어감)
	}
}
