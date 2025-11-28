package ex_abstract;

public class Main {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//추상화
		//공통된 속성과 메서드가 있고, 일부 동작만 다를 때
		//반드시 구현해야 하는 메서드를 강제하고 싶을 때
		//큰 흐름은 부모에서 정하고 세부 단계만 자식에게 맡길 때
		
		GoodCalc gc = new GoodCalc();
		int[] a = {1,2,3,4,5};
		
		System.out.printf("합 : %d\n",gc.add(5, 7));
		System.out.printf("합 : %d\n",gc.sub(5, 7));
		System.out.printf("합 : %d\n",gc.average(a));
		
		
		
		
	}
}
