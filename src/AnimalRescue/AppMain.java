package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog theDog = new Dog();

        System.out.println(theDog.age);
        System.out.println(theDog.chipNr);
        System.out.println(theDog.color);
        System.out.println(theDog.favoriteActivity);
        System.out.println(theDog.favoriteFood);
        System.out.println(theDog.levelOfHealth);
        System.out.println(theDog.levelOfHunger);
        System.out.println(theDog.levelOfMood);
        System.out.println(theDog.name);
        System.out.println(theDog.race);
        System.out.println(theDog.weight);


        DogFood theFood = new DogFood();

        System.out.println(theFood.dogFoodName);
        System.out.println(theFood.foodAvailableInStock);
        System.out.println(theFood.foodPrice);
        System.out.println(theFood.foodQuantity);


        Girl theGirl = new Girl();

        System.out.println(theGirl.girlName);
        System.out.println(theGirl.moneyAvailable);


        RecreationActivity theActivity = new RecreationActivity();

        System.out.println(theActivity.activity);


        Veterinarian theVet = new Veterinarian();

        System.out.println(theVet.vetName);
        System.out.println(theVet.vetSpecialization);


















    }




}
