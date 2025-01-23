package problem4.code.fly_behavior;

public interface FlyBehavior {
    default void fly(){
        System.out.println(" cannot fly");
    };  // default behavior
}
