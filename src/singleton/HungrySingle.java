package singleton;

public class HungrySingle {
    private static final HungrySingle instant = new HungrySingle();
    private HungrySingle(){}

    public static HungrySingle getInstant(){
        return instant;
    }
}
