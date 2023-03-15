package sample02;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드

	abstract protected String getSrcString(); // 추상 메소드

	abstract protected String getDestString(); // 추상 메소드

	protected double ratio; // 비율

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
	}

}

class Won2Dollar extends Converter {

	int won;

	Won2Dollar(int won) {
		this.won = won;
	}


	@Override
	protected double convert(double src) {
		return won / 60;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}

class Km2Mile extends Converter {

	private double distance;
	
	Km2Mile(double distance){
		this.distance = distance;
	}

	@Override
	protected double convert(double src) {
		return distance / 0.08 ;
	}

	@Override
	protected String getSrcString() {
		
		return "km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
	
}

