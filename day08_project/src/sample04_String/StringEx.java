package sample04_String;

public class StringEx {

	public static void main(String[] args) {

		
		String str1 = "";
		String str2 = "Java@gmail.com";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str2.charAt(2));		//  문자열의 특정 위치의 char 값을 가져올수있다.	 // index 값으로 찾아야함 0,1,2,3~~~~
		System.out.println(str2.length());		//  문자열의 길이
		System.out.println(str2.substring(4));	// 문자열 4번째 부터 쭉 나열 시켜줌.
		
		System.out.println(str1 == str3);	//!! 이렇게 쓰지마라 !!!!!
		System.out.println(str1.equals(str3));		// equals 는 객체안에 값이 같은지 접근시켜준다.
													// 문자열이 같은지 비교할땐 무조건 equals 를 사용해라
		if(str3.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if("".equals(str2)) {			// 빈 값도 같은지 비교가능.
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}

}
