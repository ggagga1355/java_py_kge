package inherit;

public class Pen {
	private int amount; //남은 량
	public int getAmount(){return amount;}
	public void setAmount(int amount){this.amount = amount;}	
}

class Ballpen extends Pen {
    private String color; //볼펜의 색   
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class SharpPencil extends Pen {
	private int width; //펜의 굵기
}

class FountainPen extends Ballpen {
    public void refill(int n){setAmount(n);}
}