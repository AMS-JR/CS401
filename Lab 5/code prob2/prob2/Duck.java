package prob2;

import prob2.fly_behavior.*;
import prob2.quack_behavior.*;

public abstract class Duck {

    void quack(){
        String duck = this.getClass().getSimpleName();
        QuackBehavior quackBehavior = switch(duck) {
            case "MallarDuck" -> new Quack();
            case "DecoyDuck" -> new MuteQuack();
            case "RedheadDuck"  -> new Quack();
            case "RubberDuck"  -> new Squeak();
            default  -> new Quack();
        };
        quackBehavior.quack();
    }
    //quack
    void swim() {
        System.out.println(" swimming");
    }
    abstract void display();
    void fly() {
        String duck = this.getClass().getSimpleName();
        FlyBehavior flyBehavior = switch(duck) {
            case "MallarDuck" -> new FlyWithWings();
            case "DecoyDuck" -> new CannotFly();
            case "RedheadDuck"  -> new FlyWithWings();
            case "RubberDuck"  -> new CannotFly();
            default  -> new CannotFly();
        };
        flyBehavior.fly();
    }
}
