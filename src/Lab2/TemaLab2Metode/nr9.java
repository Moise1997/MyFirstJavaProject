package Lab2.TemaLab2Metode;

public class nr9 {

    public static void main(String[] args) {
        // 6 h
        // distanta in metri 30000

        double distantaInMetri = 30000;
        double timpulInSecunde = 6*60*60;
        double mps;
        double kph;
        double mph;

        mps = distantaInMetri / timpulInSecunde;
        kph = (distantaInMetri/1000) / ((timpulInSecunde/60)/60);
        mph = ((distantaInMetri/1000)*1.609) / ((timpulInSecunde/60)/60);

        System.out.println("Viteza in metri pe secunda este: " +mps);
        System.out.println("Viteza in kilometri pe ora este: " +kph);
        System.out.println("Viteza in mile pe ora este: " +mph);





    }






}




