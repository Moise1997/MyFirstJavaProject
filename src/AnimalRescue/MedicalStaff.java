package AnimalRescue;

public abstract class MedicalStaff extends Humans{

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

    public abstract void speak ();
    public abstract void proffesion ();



}
