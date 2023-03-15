package sample06_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, Object> student = new HashMap<String, Object>();
		
		student.put("name", "홍길동");
		
		student.put("math", 90);
		
		student.put("eng", 85);
		
		student.put("kor", 95);
		
		student.put("addr", "서울");
					// {name : "홍길동", math : 90, eng : 85, kor : 95, addr : "서울"}
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		list.add(student);

		
		HashMap<String, Object> student2 = new HashMap<String, Object>();
		
		student2.put("name", "김철수");
		
		student2.put("math", 80);
		
		student2.put("eng", 95);
		
		student2.put("kor", 85);
		
		student2.put("addr", "서울");

		list.add(student2);
		
		HashMap<String, Object> student3 = new HashMap<String, Object>();
		
		student3.put("name", "김이나");
		student3.put("math", 80);
		student3.put("eng", 90);
		student3.put("kor", 70);
		student3.put("addr", "인천");
		
		list.add(student3);
		
		for (int i = 0; i < list.size(); i++) {
			
			HashMap<String, Object> map = list.get(i);
		
			System.out.println("학생 : " + map.get("name"));
			
			System.out.println("수학점수 : " + map.get("math"));
			
			System.out.println("영어점수 : " + map.get("eng"));
			
			System.out.println("국어점수 : " + map.get("kor"));
			
			
			
			System.out.println();
			
		}
// map => {}
// list => [
//		{name : "홍길동", math : 90, eng : 85, kor : 95, addr : "서울"}
// 		, {name : "김철수", math : 90, eng : 85, kor : 95, addr : "서울"}
// ]	

	}

}
