package sample04_String;

public class StringCharAt {

	public static void main(String[] args) {

		String str1 = "Hello Java";

		int cnt = 0;

		for (int i = 0; i < str1.length(); i++) {		// .length 는 문자 길이

			if (str1.charAt(i) == 'a') {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
