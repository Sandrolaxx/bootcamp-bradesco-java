package vanilla.strategy;

public class Main {

    public static void main(String[] args) {

        IBehavior common = new SimpleBehavior();
        IBehavior defense = new DefenseBehavior();
        IBehavior atack = new AtackBehavior();

        Robot robot = new Robot();

        robot.setStrategy(common);

        robot.move();
        robot.move();

        robot.setStrategy(defense);

        robot.move();

        robot.setStrategy(atack);

        robot.move();
    }

}
