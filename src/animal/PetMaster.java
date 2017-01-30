package animal;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say(" I will study java and android");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
