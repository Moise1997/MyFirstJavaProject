package AnimalRescue;

public abstract class Rescuer extends Humans{

    public int money;
    public void setMoney (int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }

    public abstract void money ();
    public abstract void profession ();
    public abstract void speak ();
}
