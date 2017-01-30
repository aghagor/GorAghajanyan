package car;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class CarOwner {
    public static void main(String[] args) {
        Car myCar = new Car();
        JamesBondCar jamesBondCar =new JamesBondCar();
        myCar.start();
        int myCarDistnce = myCar.drive(7);
        System.out.println("I drivemay car "+myCarDistnce + " km");
        myCar.stop();

        int jamesBondCarDistace = jamesBondCar.drive(7);
        System.out.println("James Bond drive his car "+ jamesBondCarDistace+" km");
    }
}
