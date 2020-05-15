package AnimalRescue;

public class MedicalStaff extends Humans{

    public String specialization;
    public void setSpecialization (String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void specialization (){
        System.out.println("Specialization");
    }

    public void speak (){
        System.out.println("");
    }
    public void proffesion (){
        System.out.println("Doctor");
    }



}
