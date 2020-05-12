package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAge(4);
        dog.setName("Rex");
        dog.setChipNr(122333);
        dog.setWeight(18.2F);
        dog.setRace("ciobanesc german");
        dog.setLevelOfMood(8);
        dog.setLevelOfHunger(10);
        dog.setLevelOfHealth(9);
        dog.setFavoriteFood("royal canin");
        dog.setFavoriteActivity("chasing cats");
        dog.setColour("brown");
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

        DogFood food = new DogFood();
        food.setAvailable("10 bags");
        food.setName("royal canin");
        food.setPrice(67);
        food.setQuantity("3 bags");
        System.out.println(food.getAvailable());
        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());

        Rescuer name = new Rescuer();
        name.setName("Sara");
        name.setMoney(1500);
        System.out.println(name.getName());
        System.out.println(name.getMoney());

        DogActivity activity = new DogActivity();
        activity.setActivity("chasing cats");
        System.out.println(activity.getActivity());

        Vet vet = new Vet ();
        vet.setName("doctor Sam");
        vet.setSpecialization("nutritionist");
        System.out.println(vet.getName());
        System.out.println(vet.getSpecialization());

        Cat cat = new Cat();
        cat.setName("Pisi");
        System.out.println(cat.getName());


















    }




}
