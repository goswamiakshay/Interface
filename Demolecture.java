package Interface;

interface I1{
	default void show() {
		System.out.println("HelloWorld I");
		
	}
}
interface J1{
	static void display() {
		System.out.println("Display");
	}
	default void show() {
		System.out.println("Hello world J");
	}
}
class B implements I1,J1{
	public void show() {
		J1.super.show();
		I1.super.show();
	}
}
public class Demolecture {

	public static void main(String[] args) {
		J1.display();
		B b=new B();
		b.show();
	

	}

}
