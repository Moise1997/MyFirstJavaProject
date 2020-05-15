package AnimalRescue;

public class Food {

    public String name;
    public int price;
    public String quantity;
    public String available;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setAvailable(String available){
        this.available = available;
    }
    public String getAvailable(){
        return available;
    }

    public void setQuantity (String quantity){
        this.quantity = quantity;
    }
    public String getQuantity(){
        return quantity;
    }


    public void name (){
        System.out.println("Food name");
    }

    public void price (){
        System.out.println("Price");
    }

    public void quantity (){
        System.out.println("Quantity");
    }

    public void availability (){
        System.out.println("Availability");
    }

}
