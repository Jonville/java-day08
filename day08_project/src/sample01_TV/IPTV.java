package sample01_TV;

public class IPTV extends ColorTV{

	private String addr;
	
	IPTV(String addr , int size, int color){
		
		super(size, color);
		
		this.addr = addr;
	}
	
	void printProperty() {
		
		System.out.print("\"" + addr + "\"" + " 주소에 ");
		super.printProperty();
	}
	
}
