package sample03;


//예제 5-5의 Shape, Line, Rect, Circle 클래스 활용
public class UsingOverride {
	public static void main(String [] args) {
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // start => qqq
		last = start;		// last => qqq		// 일단 시작에는 같은 주소를 바라본다.
		
		obj = new Rect();	// obj => www
		last.next = obj;	// qqq.next => www 
		last = obj;			// last => www
		
		obj = new Line();	// obj => eee
		last.next = obj;	// www.next => eee
		last = obj;			// last => eee
		
		obj = new Circle(); // obj => rrr
		last.next = obj;	// last => rrr
		
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
}
