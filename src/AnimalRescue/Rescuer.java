package AnimalRescue;

public class Rescuer extends Humans{

    public int money;
    public void setMoney (int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }

    public void money (){
        System.out.println("Money");
    }

    public void proffesion (){
        System.out.println("Student");
    }
    public void speak (){
        System.out.println("Hello. I would like to adopt a dog");
    }
}
