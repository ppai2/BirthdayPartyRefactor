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

	public boolean order() {
		if (balloon == null || cake == null) {
			return false;
		}

		balloon.order();
		cake.order();

		return true;
	}

	@Override
	public String toString() {
		return "Order{" +
				"name='" + name + '\'' +
				", balloon material=" + balloon.getMaterial() +
				", balloon number=" + balloon.getNumber() +
				", balloon color=" + balloon.getBalloonColor() +
				", cake flavor=" + cake.getFlavor() +
				", cake frosting flavor=" + cake.getFrostingFlavor() +
				", cake shape=" + cake.getShape() +
				", cake size=" + cake.getSize() +
				", cake color=" + cake.getCakeColor() +
				'}';
	}
}
