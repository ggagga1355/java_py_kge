package ch_16;

public class Earth {
	//static final : 상수
	//상수의 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	//상수의 선언
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; 
	}
	
	
	
}
