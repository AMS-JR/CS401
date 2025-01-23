package problem4.code;

public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        super.quack();
    }

    public void display() {
        System.out.println(" displaying");
    }
}
