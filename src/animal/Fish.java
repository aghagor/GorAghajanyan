package animal;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class Fish extends Pet {

    int currentDepth = 0;

    public int dive(int howDown) {
        currentDepth = currentDepth + howDown;
        if (currentDepth > 100 && currentDepth <200) {
            System.out.println("I'm a little fish and " +
                    " I can't dive down then 100 metrs");
        } else {
            System.out.println("Diving in to " + howDown + " feet");
            System.out.println("I am in " + currentDepth + " feet");
        }

        return currentDepth;
    }

    public String say(String something) {
        return "Fishes don't speek!!!";
    }
}
