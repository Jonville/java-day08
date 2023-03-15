package sample04;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int arr[] = {3,4,6};
		
		double avg = cal.average(arr);
		
		System.out.println(avg);
		
	}

}
