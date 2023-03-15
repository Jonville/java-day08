package sample03_equals;

public class EqualsEx {

	public static void main(String[] args) {

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if (a == b) {				// a 와 b 는 레퍼런스 주소 값이 다르기 때문에 false 임
			System.out.println("a == b");	
		}

		if (a.equals(b)) {			// equals() 클래스 에서 값을 비교하게 만들어줘서 true 임
			System.out.println("a is equal to b");
		}

		if (a.equals(c)) {
			System.out.println("a is equal to c");
		}
		
		String str = "10";				// 문자열 10
		int q = Integer.parseInt(str);		//문자열 10 을 정수형 10으로 반환 한다.

	}

}
