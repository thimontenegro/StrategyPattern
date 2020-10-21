package strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public String executeString(String text) {
		return strategy.fixString(text);
	}

}
