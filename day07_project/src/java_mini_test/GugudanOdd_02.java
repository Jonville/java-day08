package java_mini_test;

public class GugudanOdd_02 {

	public static void main(String[] args) {

		
		for(int i = 3; i < 10 ; i+=3) {
			System.out.println("====" + i + "단====");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
	}

}
