package sample04;

public interface CalculatorImpl {
	
	public int add(int a , int b);		// 더하기		 int 가 있기때문에 리턴이 될것이다. 물론 인터페이스 밖에서
	public int subtract(int a , int b);	// 빼기
	public double average(int[] a);		// 평균

}
