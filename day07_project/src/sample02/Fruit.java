package sample02;

public class Fruit {
	
	static void save(Fruit fruit) {				// static 을 선언하는 이유는 Main 에서 바로 클래스명. ~~  이렇게 접근이 가능하기때문
	
		if (fruit instanceof Banana) {
			System.out.println("바나나를 과일 바구니에 담았습니다.");
		}
		else if (fruit instanceof Kiwi) {
			System.out.println("키위를 과일 바구니에 담았습니다.");
		}
		else if (fruit instanceof Apple) {
			System.out.println("사과를 과일 바구니에 담았습니다.");
		}
		
	}

	
}
