package Interface;

import java.util.function.Consumer;

public class Consumer_Category {

	public static void main(String[] args) {
		Consumer<String> c= (p)-> System.out.println();
		c.accept("Hello world");
		

	}

}
