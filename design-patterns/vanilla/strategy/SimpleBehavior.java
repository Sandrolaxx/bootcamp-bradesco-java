package vanilla.strategy;

public class SimpleBehavior implements IBehavior {

    @Override
    public void move() {
        System.out.println("Movendo-se normalmente...");
    }
    
}
