package java_mini_test;

public class Car {

	private String name;
	private String color;
	private int speed;
	
	Car(String name, String color){
		this.name = name;
		this.color = color;
		this.speed = 0;
		
	}
	

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	int speedUp() {
		return speed + 10;
	}
	int speedDown() {
		return speed - 10;
	}
	
	
}
