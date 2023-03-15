package sample02;

public class Sample_02_Main {
	
	public static void main(String[] args) {

		Fruit banana = new Banana();
		Fruit kiwi = new Kiwi();
		Fruit apple = new Apple();
		
		Fruit.save(banana);
		Fruit.save(kiwi);
		Fruit.save(apple);
		
//		Banna b;		// 이건 null
		
		new Banana(); 		// 이건 인스턴스만 생성되고 가리키고 있는게 없다 ( 만들어 지진 않았다. 저장이 안된상태임 )
							// 이상태에선 특정 변수에 담을 순 없다.
							// 웬만하면 이렇게 쓰지마라.
	}

}
