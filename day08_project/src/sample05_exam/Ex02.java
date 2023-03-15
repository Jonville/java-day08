package sample05_exam;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		int len = text.length();

		System.out.println(text);
		for (int i = 0; i < len; i++) {

			String first = text.substring(0, 1); // 인덱스 0에서 1까지 니까 0의 글자
			String last = text.substring(1); // 인덱스 1부터 끝까지 니까 0빼고 다~
			text = last + first;
			System.out.println(text);
		}

	}

}
