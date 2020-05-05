package AnimalRescue;

public class Animal {

    public String name;
    public int age;
    public String  colour;
    public String race;
    public int chipNr;
    public float weight;
    public int levelOfHealth;
    public int levelOfHunger;
    public int levelOfMood;
    public String favoriteFood;
    public String favoriteActivity;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setColour (String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }

    public void setRace (String race){
        this.race = race;
    }
    public String getRace (){
        return race;
    }

    public void setChipNr (int chipNr){
        this.chipNr = chipNr;
    }
    public int getChipNr(){
        return chipNr;
    }

    public void setWeight (float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return weight;
    }

    public void setLevelOfHealth (int levelOfHealth){
        this.levelOfHealth = levelOfHealth;
    }
    public int getLevelOfHealth(){
        return levelOfHealth;
    }

    public void setLevelOfHunger (int levelOfHunger){
        this.levelOfHunger = levelOfHunger;
    }
    public int getLevelOfHunger(){
        return levelOfHunger;
    }

    public void setLevelOfMood (int levelOfMood){
        this.levelOfMood = levelOfMood;
    }
    public int getLevelOfMood(){
        return levelOfMood;
    }

    public void setFavoriteFood (String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }

    public void setFavoriteActivity (String favoriteActivity){
        this.favoriteActivity = favoriteActivity;
    }
    public String getFavoriteActivity (){
        return favoriteActivity;
    }











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
