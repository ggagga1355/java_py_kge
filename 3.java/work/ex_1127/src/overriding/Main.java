package overriding;

public class Main {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		cal.areaCircle(r);
		
		Computer c = new Computer();
		c.areaCircle(r);
		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(15, 15));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));
		
		System.out.println("-----------------");
		
		
		
		HybridWaterCar HybridWater = new HybridWaterCar();
		
		HybridWater.waterGague = 25;
		HybridWater.gasolineGague = 15;
		HybridWater.eletricGague = 30;
		
		HybridWater.showCurrentGague();
		
		
		
		
		
		
	}
}
