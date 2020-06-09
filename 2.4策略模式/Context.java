package day02_demo04;

import day02_demo04.Strategy;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public void contextInterface() {
		strategy.algorithmInterface();
	}
}
