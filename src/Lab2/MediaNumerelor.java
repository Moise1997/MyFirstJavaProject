package Lab2;

public class MediaNumerelor {
    public static void main(String[] args) {
        System.out.println("Media celor 3 numere este: " + media ( 100,100 ,100 ) / 3);



    }
    public static double media (double primulNumar, double alDoileaNumar, double alTreileaNumar){

        double media = (primulNumar + alDoileaNumar + alTreileaNumar) / 3;
        return media;


    }



}
