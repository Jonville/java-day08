package sample02;

public class ColorPoint extends Point {

	private String color;
	
	ColorPoint(int x, int y , String color) {
		super(x,y);
		
		this.color = color;
		
	}

	public void setColor(String color) {
		
		this.color = color;
	}
	
	
	
}
