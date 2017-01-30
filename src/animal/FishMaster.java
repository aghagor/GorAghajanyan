package animal;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive(202);
        myFish.dive(3);
        String fishReact = myFish.say("");
        System.out.println(fishReact);
        myFish.sleep();
    }
}
