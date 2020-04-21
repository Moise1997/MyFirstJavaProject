package AnimalRescue;

public class Dog {

    public String name = "Rex";
    public int age = 4;
    public String  color = "Brown and white";
    public String race = "Ciobanesc";
    public int chipNr = 123123;
    public float weight = 23.5F;
    public int levelOfHealth = 10;
    public int levelOfHunger = 8;
    public int levelOfMood = 10;
    public String favoriteFood = "royal canin";
    public String favoriteActivity = "chasing cats";



    public void eat(){
        System.out.println("Eating..");
    }

    public void run(){
        System.out.println("running..");
    }

    public void sleep(){
        System.out.println("ZzzZZzz..");
    }
}
