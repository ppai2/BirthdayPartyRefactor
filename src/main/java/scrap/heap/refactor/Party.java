package scrap.heap.refactor;

public class Party {

	private final Balloon balloon;
	private final Cake cake;

	public Party(Balloon balloon, Cake cake) {
		this.balloon = balloon;
		this.cake = cake;
	}

	public void order() {

		 balloon.order();

		 cake.order();
	}
}
