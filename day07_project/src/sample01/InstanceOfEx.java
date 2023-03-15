package sample01;
/*
 * 
 * Student, Researcher , Professor 는 Person 에 속하기때문에.
 * 
 * else if 로 묶었으면, Person 만 출력 될것이다.
 * 
 * 
 */
public class InstanceOfEx {

	static void print(Person p) {
	
		if(p instanceof Person) {
			System.out.print("Person");
		}
		if(p instanceof Student) {
			System.out.print("Student");
		}
		if(p instanceof ReSearcher) {
			System.out.print("ReSearcher");
		}
		if(p instanceof Professor) {
			System.out.print("Professor");
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Person p = new Student();
		

		System.out.print("new Student() -> \t");
		print(new Student());
		
		System.out.print("new ReSearcher() -> \t");
		print(new ReSearcher());
		
		System.out.print("new Professor() -> \t");
		print(new Professor());
		
	}

}
