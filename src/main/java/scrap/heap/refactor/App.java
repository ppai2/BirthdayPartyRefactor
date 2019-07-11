package scrap.heap.refactor;

/**
 *
 * Main class
 *
 * @author prasan
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        // balloon objects
        Balloon balloonObject1 = new Balloon("red", "mylar", "4");
        Balloon balloonObject2 = new Balloon("blue", "latex", "7");
        Balloon balloonObject3 = new Balloon("yellow", "mylar", "4");

        // cake objects
        Cake cakeObject1 = new Cake("chocolate", "chocolate", "circle", "large", "brown");
        Cake cakeObject2 = new Cake("Vanilla", "chocolate", "square", "med", "brown");
        Cake cakeObject3 = new Cake("vanilla", "vanilla", "square", "small", "yellow");

        // party object for order
        Party partyObject1 = new Party(balloonObject1, cakeObject1);
        Order orderObject1 = new Order(partyObject1);
        orderObject1.order();

        Party partyObject2 = new Party(balloonObject2, cakeObject2);
        Order orderObject2 = new Order(partyObject2);
        orderObject2.order();

        Party partyObject3 = new Party(balloonObject3, cakeObject3);
        Order orderObject3 = new Order(partyObject3);
        orderObject3.order();
    }
}
