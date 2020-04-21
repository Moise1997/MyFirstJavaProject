package Lab2.lectie;

public class Lab2 {

    public static int memberVariable = 5;
    public static int firstNumber = 7;
    public static int secondNumber = 9;


    public static void main(String[] args) {
        int result = sum(56, 110); // atribuie valoarea rezultata din SUM, variabilei RESULT
        System.out.println(result); // afiseaza RESULT
        int aaa = result + 1;

        sum(5,6); // nu se afiseaza nimic, fiindaca nu se surprinde valoarea rezultata

        System.out.println(sum(5,6)); // afiseaza direct rezultatul metodei


    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;

    }

    public static void substraction() {
        int sum = firstNumber - secondNumber;
        System.out.println(sum);
    }


}