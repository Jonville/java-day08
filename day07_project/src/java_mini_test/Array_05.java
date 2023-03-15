package java_mini_test;

public class Array_05 {

	public static void main(String[] args) {

		int arr[] = {10, -20, 30 ,40 ,50};
		
		int cnt = 0;
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0) {
				
				sum += arr[i];
				cnt++;
			}
			
		}
		
		System.out.println("배열의 평균 값은 : " + (double)sum/cnt);
		
	}

}
