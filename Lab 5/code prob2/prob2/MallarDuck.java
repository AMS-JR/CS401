package prob2;

import prob2.fly_behavior.FlyWithWings;
import prob2.quack_behavior.Quack;

public class MallarDuck extends Duck {
    public MallarDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
    public void display() {
        System.out.println(" display");
    }
}
