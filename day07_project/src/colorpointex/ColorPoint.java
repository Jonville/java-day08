package colorpointex;

public class ColorPoint extends Point {

	private String color;		// 점의 색
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {		// 컬러 점의 좌표 출력
		
		System.out.println(color);
		
		showPoint();		// Point 클래스의 showPoint() 메소드를 호출
	}
}
