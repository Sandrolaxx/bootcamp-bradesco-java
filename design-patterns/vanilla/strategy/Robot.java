package vanilla.strategy;

public class Robot {
    
    private IBehavior strategy;

    public void setStrategy(IBehavior strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.move();
    }

}
