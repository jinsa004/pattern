package adapter;

public class App {
	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine(); // 바라보는 타겟이 어댑터
		m.brew(new Americano());
		m.brew(new CafeLatte());
		m.brew(new Espresso());
		m.brew(new AmericanoAdapter(new Americano()));
	}
}
