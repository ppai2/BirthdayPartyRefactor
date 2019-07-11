package scrap.heap.refactor;

public class Order {

	private final Party party;

	public Order(Party party) {
		this.party = party;
	}

	public void order() {

		party.order();

	}
}
