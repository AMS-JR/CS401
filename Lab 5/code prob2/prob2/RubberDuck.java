package prob2;

import prob2.fly_behavior.CannotFly;
import prob2.quack_behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        setQuackBehavior(new Squeak());
        setFlyBehavior(new CannotFly());
    }
    public void display() {
        System.out.println(" displaying");
    }
}
