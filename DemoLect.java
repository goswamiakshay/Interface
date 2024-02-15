package Interface;


interface I{
	void show();
}

interface J{
	void display();
}

class A implements I,J{

	@Override
	public void display() {
		System.out.println("Hello World");
		
	}

	@Override
	public void show() {
		System.out.println("Hello Display");
	}
	
}
public class DemoLect {

	public static void main(String[] args) {
		A a=new A();
		a.show();

	}

}
