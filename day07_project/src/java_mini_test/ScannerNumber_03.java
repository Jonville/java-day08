package java_mini_test;

import java.util.Scanner;

public class ScannerNumber_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.");

		while(true){

			num = sc.nextInt();
			if (num < 0) {
				System.out.println("음수입니다. 다시입력하세요!");
				sum -= num;
			}
			if (num == 0) {
				System.out.println("종료합니다.");
				break;
			}

			sum += num;
		}

		System.out.println("총 합은 : " + sum);

	}

}
