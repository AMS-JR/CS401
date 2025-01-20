package prob2.quackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" cannot quack");
    }
}
