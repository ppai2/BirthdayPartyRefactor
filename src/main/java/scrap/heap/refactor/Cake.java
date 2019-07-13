package scrap.heap.refactor;

/**
 * Cake class to hold information specific to cake
 *
 * @author prasan
 */
public class Cake {

	private final String flavor;
	private final String frostingFlavor;
	private final String shape;
	private final String size;
	private final String cakeColor;

	public Cake(String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
	}

	public String getFlavor() {
		return flavor;
	}

	public String getFrostingFlavor() {
		return frostingFlavor;
	}

	public String getShape() {
		return shape;
	}

	public String getSize() {
		return size;
	}

	public String getCakeColor() {
		return cakeColor;
	}

	public void order(){

		//for the purposes of this exercise, pretend that this method adds a cake to the order

		System.out.println("Cake ordered; " + getFlavor() + ", " + getFrostingFlavor() + ", " + getShape() + ", " + getSize() + ", " + getCakeColor());
	}

	@Override
	public String toString() {
		return "Cake{" +
				"flavor='" + flavor + '\'' +
				", frostingFlavor='" + frostingFlavor + '\'' +
				", shape='" + shape + '\'' +
				", size='" + size + '\'' +
				", cakeColor='" + cakeColor + '\'' +
				'}';
	}
}
