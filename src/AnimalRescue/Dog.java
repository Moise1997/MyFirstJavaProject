package AnimalRescue;

public class Dog extends Animal {

    int chipNr = 122333;

    public int getChipNr() {
        return chipNr;
    }
    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
    }
    public void speak (){
        System.out.println("Woof Woof");
    }
    public void sleep (){
        System.out.println("Snore");
    }
    public void eat (){
        System.out.println("Eating pedigree");
    }
    public void run(){
        System.out.println("Running at 20 kph");
    }
    public void walk (){
        System.out.println("Walking at 4 kph");
    }



}
