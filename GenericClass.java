package Interface;

class Demo<T,R> {
	T data;
	void show(R val) {
		
	}
}
public class GenericClass {
	public static void main(String[] args) {
		Demo<String,Integer> g= new Demo<String,Integer>();
		g.data="Akshay";
		g.show(25);
		System.out.println(g.data);
	}

}