package day02_demo04;

public class Main {
	public static void main(String[]args) {
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
