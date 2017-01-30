package animal;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("I need to sleep, good night");
    }

    public void eat() {
        System.out.println("I am very hungry, may we eat something?");
    }

    public String say(String aWord) {
        String petResponce = "OK!" + aWord;
        return petResponce;
    }
}
