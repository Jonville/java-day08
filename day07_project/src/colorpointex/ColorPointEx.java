package colorpointex;

public class ColorPointEx {

	public static void main(String[] args) {

//		Point p = new Point(); // Point 객체 생성
//
//		p.set(1, 2); // Point 클래스의 매개변수를 세팅함
//		p.showPoint(); // Point 클래스의 showPoint() 메소드를 불러들임

		Point p;
		ColorPoint cp = new ColorPoint(5, 6, "blue");		// 생성자 ColorPoint 를 생성후 호출시킴
		
//		Point p = new ColorPoint(4,6,"blue");		// 이렇게도 사용가능
		
		p = cp;

//		cp.set(3, 4); // Point 클래스의 set() 메소드를 호출
//		cp.setColor("Red"); // ColorPoint 클래스의 setColor() 메소드를 호출
		cp.showColorPoint(); // ColorPoint 클래스의 showColorPoint를 호출
		
//		p.showColorPoint();	// ColorPoint 클래스에 접근이 불가능해진다. <-- upcasting

	}

}
