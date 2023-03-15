package sample05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		ArrayClass arrC = new ArrayClass();
		
		
//		for(int i = 0 ; i < arr.length; i++) {
//		
//			arrC.arraySort(arr);
//			System.out.println(arr[i]);
//		}

		int arrA[] = arrC.arraySort(arr);
		
		System.out.println(arrC.arrayAvg(arr));
		System.out.println(arrC.arrayMax(arr));
		System.out.println(Arrays.toString(arr));


	}

}
