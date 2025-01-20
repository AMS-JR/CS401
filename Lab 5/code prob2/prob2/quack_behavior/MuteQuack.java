package prob2.quack_behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" cannot quack");
    }
}
