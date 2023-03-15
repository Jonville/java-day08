package java_mini_test;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car("램보루기니", "Black");
		
		car.setSpeed(100);
		
		System.out.println(car.speedUp());
		System.out.println(car.speedDown());
		
		
		
	}

}


