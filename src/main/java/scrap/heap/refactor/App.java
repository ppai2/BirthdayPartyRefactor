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

        Balloon balloonObject1 = new Balloon("red", "mylar", "4");
        Cake cakeObject1 = new Cake("chocolate", "chocolate", "circle", "large", "brown");
        Order orderObject1 = new Order("party 1", balloonObject1, cakeObject1);
        orderObject1.order();

        Balloon balloonObject2 = new Balloon("blue", "latex", "7");
        Cake cakeObject2 = new Cake("Vanilla", "chocolate", "square", "med", "brown");
        Order orderObject2 = new Order("party 2", balloonObject2, cakeObject2);
        orderObject2.order();


        Balloon balloonObject3 = new Balloon("yellow", "mylar", "4");
        Cake cakeObject3 = new Cake("vanilla", "vanilla", "square", "small", "yellow");
        Order orderObject3 = new Order("party 3", balloonObject3, cakeObject3);
        orderObject3.order();
    }
}
