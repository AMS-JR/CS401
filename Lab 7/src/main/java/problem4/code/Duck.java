package problem4.code;

import problem4.code.fly_behavior.FlyBehavior;
import problem4.code.quack_behavior.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    void swim() {
        System.out.println(" swimming");
    }
    abstract void display();
}
