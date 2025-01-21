package prob2;

import prob2.fly_behavior.*;
import prob2.quack_behavior.*;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    void quack(){
        quackBehavior.quack();
    }
    //quack
    void swim() {
        System.out.println(" swimming");
    }
    abstract void display();
    void fly() {
        flyBehavior.fly();
    }
    protected void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }
    protected void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }
}
