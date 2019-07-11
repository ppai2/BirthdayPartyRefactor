package scrap.heap.refactor;

/**
 * Order class
 *
 * @author prasan
 */
public class Order {

	private final String name;
	private final Balloon balloon;
	private final Cake cake;

	public Order(String name, Balloon balloon, Cake cake) {
		this.name = name;
		this.balloon = balloon;
		this.cake = cake;
	}

	public void order() {

		balloon.order();

		cake.order();
	}
}
