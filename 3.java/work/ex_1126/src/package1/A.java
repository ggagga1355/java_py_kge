package package1;

//A클래스의 접근제한은 default로 설정이 되어이쏙
//같은 패키지 대해서만 접근 허영
public class A {
	public int field1;
	int field2;
	private int field3;
	
	public void method1() {};
	void method2() {};
	private void method3() {};
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	}
	
	
	public A(boolean b) {
		
	}
	
	A(int b){
		
	}
	
	private A(String s) {
		
	}
	
	
	
}
