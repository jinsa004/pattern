package singleton;

public class App {

	public static void main(String[] args) {
		President p1 = President.getInstance();
		System.out.println(p1.getName());
	}
}
