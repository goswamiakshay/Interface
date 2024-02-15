package Interface;


interface I2{
	void show();
	default void display() {}
}
public class Lambda {

	public static void main(String[] args) {
		I i=()->System.out.println("I am Functional interface");
		i.show();
	}

}
