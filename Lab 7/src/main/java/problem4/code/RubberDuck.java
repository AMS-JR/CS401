package problem4.code;

import problem4.code.quack_behavior.QuackBehavior;
import problem4.code.quack_behavior.Squeak;

public class RubberDuck extends Duck {
    private final QuackBehavior quackBehavior = new Squeak();
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println(" displaying");
    }
}
