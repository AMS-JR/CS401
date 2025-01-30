package prob12;

import java.util.Optional;

public class MySingletonNullable {
    private static int count = 0;
    private static MySingletonNullable instance = null;
    private MySingletonNullable() {
        count++;
    }
    public static MySingletonNullable getInstance() {
        return Optional.ofNullable(instance).orElseGet(() -> createInstance());
    }

    private static MySingletonNullable createInstance() {
        instance = new MySingletonNullable();
        return instance;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            getInstance();
        }
        System.out.println(count);
    }
}
