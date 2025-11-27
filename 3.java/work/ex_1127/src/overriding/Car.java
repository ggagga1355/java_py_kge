package overriding;

public class Car {
	int gasolineGague;
	
	public void showCurrentGague() {
		System.out.println("잔여 가스량 : " + this.gasolineGague);
	}
	
	
}

class HybridCar extends Car {
	
	int eletricGague;
	
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 전기량 : " + this.eletricGague);
	}		
}

class HybridWaterCar extends HybridCar {
	
	int waterGague;
	
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 물의양 : " + this.waterGague);
	}
	
}




