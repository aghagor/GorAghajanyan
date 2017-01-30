package car;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class JamesBondCar extends Car {
    @Override
    public int drive(int howLong) {
        int distace = howLong * 180;
        return distace;
    }
}
