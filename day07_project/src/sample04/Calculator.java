package sample04;

public class Calculator implements CalculatorImpl { // 추상 메소드를 하나라도 구현을 안하면 빨간줄이 뜬다.
									// 다중 상속은 안되지만 다중 인터페이스 로 다중 상속 느낌은 낼수있다.
									// 근데 클래스 안에서 메소드를 추가하는것은 가능함.
									// 오버라이딩은 필수임;
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		
		int sum = 0;
		for(int i=0; i < a.length; i++) {
			sum += a[i];
		}
		
		return (double)sum/a.length;
	}		
	
	

}
