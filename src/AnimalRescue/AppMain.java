package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.setAge(4);
        dog.setName("Rex");
        dog.setWeight(18.2F);
        dog.setRace("ciobanesc german");
        dog.setLevelOfMood(8);
        dog.setLevelOfHunger(10);
        dog.setLevelOfHealth(9);
        dog.setFavoriteFood("royal canin");
        dog.setFavoriteActivity("chasing cats");
        dog.setColour("brown");
        dog.setChipNr(123456);

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
        System.out.println(dog.getChipNr());




        Food food = new Food();
        food.setAvailable("10 bags");
        food.setName("royal canin");
        food.setPrice(67);
        food.setQuantity("3 bags");

        System.out.println(food.getAvailable());
        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());


        Adopter name = new Adopter();
        name.setName("Sara");
        name.setMoney(1500);

        System.out.println(name.getName());
        System.out.println(name.getMoney());


        Activity activity = new Activity();
        activity.setActivity("chasing cats");

        System.out.println(activity.getActivity());



        MedicalStaff vet = new MedicalStaff();
        vet.setName("doctor Sam");
        vet.setSpecialization("nutritionist");

        System.out.println(vet.getName());
        System.out.println(vet.getSpecialization());


















    }




}
