package test.constructor;

public class A extends Object{
	private int i;
	private String s;		
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public A() {
		super();
		System.out.println("A() ������ ȣ��");
	}	
//	public A(int i) {
//		super();
//		System.out.println("A(int i) ������ ȣ��");
//	}	
	public A(int i, String s) {
		super();
		setI(i);
		setS(s);
		System.out.println("A(int i, String s) ������ ȣ��");
	}
	public static void main(String[] args) {		
		A a3=new A(10,"java");
		
	}

}
