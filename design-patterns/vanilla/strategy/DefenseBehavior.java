package vanilla.strategy;

public class DefenseBehavior implements IBehavior {

    @Override
    public void move() {
        System.out.println("Movendo-se com defensivamente...");
    }
    
}
