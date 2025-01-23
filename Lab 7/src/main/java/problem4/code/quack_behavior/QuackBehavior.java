package problem4.code.quack_behavior;

public interface QuackBehavior {
    default public void quack(){
        System.out.println(" cannot quack"); // MuteQuack
    }  // default behavior
}
