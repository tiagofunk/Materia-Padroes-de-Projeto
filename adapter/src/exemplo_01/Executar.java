package exemplo_01;

public class Executar {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter( turkey );
		
		System.out.println("Pato ...");
		duck.quack();
		duck.fly();
		
		System.out.println("Peru ...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}
