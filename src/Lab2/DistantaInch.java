package Lab2;

public class DistantaInch {
    public static void main(String[] args) {
        System.out.println(distantaInMetri(120.25));

    }

    public static double distantaInMetri (double distantaInch){
        // 1 inch = 2,54 cm = 0,0254 m

        return distantaInch * 2.54;
    }


}
