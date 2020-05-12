package AnimalRescue;

public class AnimalRescuer {

    public String name;
    public int money;

    public void setName( String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMoney (int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }


    public void name (){
        System.out.println("name");
    }

    public void money (){
        System.out.println("money");
    }

}
