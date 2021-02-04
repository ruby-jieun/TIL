package test.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car car1=new Car();
		System.out.println(car1.company);
		
		Car car2=new Car("ÀÚ°¡¿ë");
		System.out.println(car2.company);
	}

}