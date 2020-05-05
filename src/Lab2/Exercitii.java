package Lab2;

public class Exercitii {

    public static void main(String[] args) {
        printMyName();
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();

    }

    public static void printMyName() {
        System.out.println( "Hello \nMoise");

    }

    public static void ex1() {
        byte cineva = 100;
        short oricine = 134;
        int rezultat = cineva + oricine;
        System.out.println(rezultat);
    }

    public static void ex2 () {
        long money = 200000;
        int bills = 100000;
        long moneyLeftForSpendOnCandy = money / bills;
        System.out.println(moneyLeftForSpendOnCandy);

    }

    public static void ex3 () {
        byte undeva = -5;
        byte altceva = 8;
        byte orice = 6;
        int comoara = undeva + altceva * orice;
        System.out.println(comoara);
    }

    public static void ex4 () {
        byte ana = 55;
        byte are = 9;
        byte mere = 9;
        System.out.println((ana+are) % mere);
    }

    public static void ex5 () {
        byte ciresica = 20;
        byte avea = 3;
        byte capsuni = 5;
        byte ciresel = 8;
        System.out.println(ciresica +- avea * capsuni / ciresel);
    }

    public static void ex6 () {
        byte a = 5;
        byte aa = 15;
        byte b = 3;
        byte bb = 2;
        byte c = 8;
        byte cc = 3;
        System.out.println( a + aa / b * bb - c % cc);
    }



















































}
