package prob2;

import prob2.flyBehavior.CannotFly;
import prob2.flyBehavior.FlyBehavior;
import prob2.flyBehavior.FlyWithWings;
import prob2.quackBehavior.MuteQuack;
import prob2.quackBehavior.Quack;
import prob2.quackBehavior.QuackBehavior;
import prob2.quackBehavior.Squeak;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    void quack(){
        String duck = this.getClass().getSimpleName();
        quackBehavior = switch(duck) {
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
        flyBehavior = switch(duck) {
            case "MallarDuck" -> new FlyWithWings();
            case "DecoyDuck" -> new CannotFly();
            case "RedheadDuck"  -> new FlyWithWings();
            case "RubberDuck"  -> new CannotFly();
            default  -> new CannotFly();
        };
        flyBehavior.fly();
    }
}
