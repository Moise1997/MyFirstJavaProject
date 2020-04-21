package Lab1.lectie;

public class Main {

    public static void main(String[] args) {

        char myChar = '@';
        byte myByte = 127;
        short myShort = 1231;
        int myInt = 12;
        long myLong = 12312312312312312L;
        String myString = "Cosmin";
        boolean myBool = false;
        boolean myBool2 = false;


        boolean myBool3 = myBool || myBool2;

        System.out.println(myBool3);


        myInt++; // myInt  = myInt + 1;

        System.out.println("Valoarea ++ : " + myInt++); // cand ++ ii la final, se executa ultimul, codul se executa de la stanga spre dreapta
        System.out.println("valoarea ++2 : " + myInt); // cand ++ ii inainte, se executa in ordinea stabilita

        myInt +=2;// myInt = myInt + 2;
        myInt -=2;// myInt = myInt - 2;

        boolean greater = myLong != myInt;

        System.out.println(greater);

        float myFloat = 3.123F;
        double myDouble = 6.312312312;

        int resultat = myByte * myShort;
        long resultat2 = myInt + myLong;

        float restulImpartirii = myShort % 2;
        System.out.println("Restul impartirii: " + restulImpartirii);

        System.out.println("Rezultat f = " + (myFloat + myDouble));
        System.out.println("Rezultat 2 = " + resultat2);

        float resultat3 = myInt + myFloat;
        System.out.println(resultat3);


        System.out.println(myString + " prezinta java.");

        System.out.println(myString + (myInt + 3));

        System.out.println("------------------");
        int x = 2;

        x+=x+=x++ + ++x;

        System.out.println(x+=x+=x++ + ++x);

    }
}