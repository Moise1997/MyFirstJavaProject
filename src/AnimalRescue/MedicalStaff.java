package AnimalRescue;

public class MedicalStaff {

    public String name;
    public String specialization;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSpecialization (String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }


    public void name (){
        System.out.println("name");
    }

    public void specialization (){
        System.out.println("specialization");
    }



}
