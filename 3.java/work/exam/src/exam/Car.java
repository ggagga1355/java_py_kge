package exam;

public class Car implements Movable {
	
	int x;
	int y;
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.printf("자동차가 (d%,d%) 위치로 이동했습니다\n",x,y);
	}

}
