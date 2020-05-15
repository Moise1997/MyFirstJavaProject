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




}
