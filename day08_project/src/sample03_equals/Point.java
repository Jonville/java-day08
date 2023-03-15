package sample03_equals;

public class Point {

	private int x , y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {		// (Object  <- 를 쓰는 이유는 오버라이딩 해서 쓰기 위해 사용함
		
		Point p = (Point)obj;
		
		if(x == p.x && y == p.y){			// 이 if문은 사용하기 나름임. (x * y == p.x * p.y) 이렇게
			return true;
		} else {
			return false;
		}
		
	}
	
}
