package prob2;

import prob2.fly_behavior.CannotFly;
import prob2.quack_behavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new CannotFly());
    }
    public void display() {
        System.out.println(" displaying");
    }
}
