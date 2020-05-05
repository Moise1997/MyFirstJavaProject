package Lab2;

public class FahnrenheitCelsius {
    public static void main(String[] args) {
        System.out.println(fahnrenheitToCelsius(100));

    }

    public static double fahnrenheitToCelsius (double tempInFahnrenheit){

        return 5.0/9.0 * (tempInFahnrenheit - 32);
    }


}
