package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        GermanShepperd dog = new GermanShepperd();
        dog.setAge(4);
        dog.setName("Rex");
        dog.setChipNr(122333);
        dog.setWeight(18.2F);
        dog.setRace("German shepperd");
        dog.setLevelOfMood(8);
        dog.setLevelOfHunger(10);
        dog.setLevelOfHealth(9);
        dog.setFavoriteFood("Royal canin");
        dog.setFavoriteActivity("Chasing cats");
        dog.setColour("Brown");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getWeight());
        System.out.println(dog.getRace());
        System.out.println(dog.getLevelOfMood());
        System.out.println(dog.getLevelOfHunger());
        System.out.println(dog.getLevelOfHealth());
        System.out.println(dog.getFavoriteFood());
        System.out.println(dog.getFavoriteActivity());
        System.out.println(dog.getColour());
        dog.speak();
        dog.sleep();
        dog.run();
        dog.walk();

        DogFood food = new DogFood();
        food.setAvailable("10 bags");
        food.setName("Royal canin");
        food.setPrice(67);
        food.setQuantity("3 bags");
        System.out.println(food.getAvailable());
        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());

        Sarah rescuer = new Sarah();
        rescuer.setName("Sara");
        rescuer.profession();
        rescuer.speak();
        rescuer.setMoney(1500);
        System.out.println(rescuer.getName());
        System.out.println(rescuer.getMoney());

        DogActivity activity = new DogActivity();
        activity.setActivity("Chasing cats");
        System.out.println(activity.getActivity());

        Vet vet = new Vet ();
        vet.proffesion();
        vet.workPlace();
        vet.setName("Sam");
        vet.setSpecialization("Nutritionist");
        System.out.println(vet.getName());
        System.out.println(vet.getSpecialization());
        vet.speak();


        Cat cat = new Cat();
        cat.setName("Pisi");
        System.out.println(cat.getName());
        cat.speak();
        cat.run();
        cat.sleep();
        cat.walk();


















    }




}
