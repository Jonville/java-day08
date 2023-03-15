package sample04_String;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {			// hasMoreTokens 로 위에 토큰들을 찾아주는의미 ( / )<-
			System.out.println(st.nextToken());			// 토큰으로 분리된 다음 문자열을 호출한다.
			
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
