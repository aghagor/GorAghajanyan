package car;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class Car {
    public void start() {
        System.out.println("You start car");
    }

    public void stop() {
        System.out.println("You stop car");
    }

    public int drive(int howLong) {
        int distance = howLong * 60;
        return distance;
    }
}
