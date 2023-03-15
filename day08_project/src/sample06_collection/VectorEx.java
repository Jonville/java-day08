package sample06_collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector <Integer> v = new Vector <Integer>();		// 용량 초기화를 안줘서 기본으로 10준다.
															// 알아서 크기를 조절해준다.
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100);		// add(인덱스 n번째 , 값 )
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		
		for(int i = 0; i < v.size(); i++) {
			
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		
		for(int i = 0; i < v.size(); i++) {
			
			int n = v.get(i);			// elementAt() 이랑 get() 이랑 똑같다.
			sum += n;
			
		}
		
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
