package scrap.heap.refactor;

import java.util.logging.Logger;

/**
 * Main class
 *
 * @author prasan
 */
public class App {

    private static  final Logger logger = Logger.getLogger("App");

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        final Balloon balloonObject1 = new Balloon("red", "mylar", "4");
        final Cake cakeObject1 = new Cake("chocolate", "chocolate", "circle", "large", "brown");
        final Order orderObject1 = new Order("party 1", balloonObject1, cakeObject1);
        orderObject1.order();
        logger.info("Order object 1 : " + orderObject1);

        final Balloon balloonObject2 = new Balloon("blue", "latex", "7");
        final Cake cakeObject2 = new Cake("Vanilla", "chocolate", "square", "med", "brown");
        final Order orderObject2 = new Order("party 2", balloonObject2, cakeObject2);
        orderObject2.order();
        logger.info("Order object 2 : " + orderObject2);

        final Balloon balloonObject3 = new Balloon("yellow", "mylar", "4");
        final Cake cakeObject3 = new Cake("vanilla", "vanilla", "square", "small", "yellow");
        final Order orderObject3 = new Order("party 3", balloonObject3, cakeObject3);
        orderObject3.order();
        logger.info("Order object 3 : " + orderObject3);
    }
}
