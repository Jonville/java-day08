package sample05_exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">>");

		while (true) {

			String str = sc.nextLine();

			if (str.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}

			int cnt = 0;

			StringTokenizer st = new StringTokenizer(str, " ");

			while (st.hasMoreTokens()) {

				st.nextToken();
				cnt++;

			}

			System.out.println("어절 개수는 : " + cnt);
			
												// countTokens 로도 풀 수 있다.
			
			// String [] words = str.split(" ");
			// System.out.println("어절 개수는 " + words.length);   // 이렇게도 split 할수있다 (tokenizer 같이)

		}

	}

}
