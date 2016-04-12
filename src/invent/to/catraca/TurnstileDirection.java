package invent.to.catraca;

public enum TurnstileDirection {
	enter(1),
	exit(-1),
	both(0),
	lock(-2);
	
	private int value;
	TurnstileDirection(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
