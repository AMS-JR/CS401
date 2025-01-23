package problem4.code;

import problem4.code.fly_behavior.FlyBehavior;
import problem4.code.fly_behavior.FlyWithWings;
import problem4.code.quack_behavior.Quack;
import problem4.code.quack_behavior.QuackBehavior;

public class MallarDuck extends Duck {
    private final FlyBehavior flyBehavior = new FlyWithWings();
    private final QuackBehavior quackBehavior = new Quack();
    @Override
    public void fly() {
        flyBehavior.fly();
    }
    @Override
    public void quack() {
        quackBehavior.quack();
    }
    public void display() {
        System.out.println(" display");
    }
}
