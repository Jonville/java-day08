package sample01_TV;

public class ColorTV extends TV {
	
	private int color;
	
	ColorTV(int size, int color){
		
		super(size);
		this.color = color;
	}

	public int getColor() {
		
		return color;
	}

	void printProperty() {
		
		System.out.println(getSize() + " 인치 , " + color + " 컬러");
		
	}
}
