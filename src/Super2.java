
public class Super2 extends Super {
	
	int a;
	
	Super2(){
		System.out.println("Constructor of B");
	}
	void display() {
		
		super.display();
		System.out.println("its B");
		a=20;
		super.a=40;
		int c=a+super.a;
		
		System.out.println("the answer is:"+c);
	}
	
	public static void main(String[] args) {
		
		Super2 su = new Super2();
		su.display();
		
		
		
	}

}
