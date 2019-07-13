package scrap.heap.refactor;

/**
 * Balloon class
 *
 * @author prasan
 */
public class Balloon {
	private final String balloonColor;
	private final String material;
	private final String number;

	public Balloon(String balloonColor, String material, String number) {
		this.balloonColor = balloonColor;
		this.material = material;
		this.number = number;
	}

	public String getBalloonColor() {
		return balloonColor;
	}

	public String getMaterial() {
		return material;
	}

	public String getNumber() {
		return number;
	}

	public void order(){

		//for the purposes of this exercise, pretend this method works and adds balloons to the order

		System.out.println("Balloons ordered; " + getBalloonColor() + ", " + getMaterial() + ", " + getNumber());
	}

	@Override
	public String toString() {
		return "Balloon{" +
				"balloonColor='" + balloonColor + '\'' +
				", material='" + material + '\'' +
				", number='" + number + '\'' +
				'}';
	}


}
