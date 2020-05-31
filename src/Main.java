import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Rezultatul este: " + calc.adunare(12, 15));
        System.out.println("Rezultatul este: " + calc.adunare(12.5F, 20));
        System.out.println("Rezultatul este: " + calc.adunare(12,22,42));

        System.out.println("Rezultatul este: " + calc.scadere(200, 123));
        System.out.println("Rezultatul este: " + calc.scadere(2000, 145.24F));
        System.out.println("Rezultatul este: " + calc.scadere(5000, 600, 1400));

        System.out.println("Rezultatul este: " + calc.inmultire(100, 12));
        System.out.println("Rezultatul este: " + calc.inmultire(20,15,20));
        System.out.println("Rezultatul este: " + calc.inmultire(4,7,4));

        System.out.println("Rezultatul este: " + calc.impartire(16, 2));
        System.out.println("Rezultatul este: " + calc.impartire(144.5F, 50));
        System.out.println("Rezultatul este: " + calc.impartire(20000, 40, 20));


        LogicalOperations logicalOp = new LogicalOperations();

        int biggest = logicalOp.checkBiggerNumber(143, 23);
        System.out.println("The biggest number is: " + biggest);

        System.out.println(logicalOp.textCheck("Capra cu trei iezi"));

        System.out.println(logicalOp.ceva("ceva", 5));

        System.out.println(logicalOp.snow("The", 12));

        System.out.println(logicalOp.number("ceva", 2));

        System.out.println(logicalOp.la(3));

        System.out.println(logicalOp.isNumberEven(4));

        System.out.println(logicalOp.isEligibleToVote(17));

        System.out.println(logicalOp.la(6,2,5));

        // Tema loop for

        int number = 1;                     //ex1
        logicalOp.printNumbers(number);

        int nr1 = -1;                               //ex2
        int nr2 = -100;
        logicalOp.countToMinusHundred(nr1,nr2);

        int a = 122;                                //ex3
        int b = 200;
        logicalOp.countingStars(a,b);

        int x =4;                           //ex4
        int y = 10;
        logicalOp.biggerNumber(x,y);

        logicalOp.evenNumbers();            //ex5

        logicalOp.oddNumbers();             //ex6

        System.out.println(logicalOp.sum());            //ex7

        System.out.println(logicalOp.average(1));       //ex8

        logicalOp.tipar(7);         //ex9

        // Tema loop while

        logicalOp.counting(1);                   //ex1

        logicalOp.countingBackwards(-1);              //ex2

        logicalOp.countingApples(15,20);         //ex3

        logicalOp.bigger(3,8);             //ex4

        logicalOp.evenNumbersShow();             //ex5

        logicalOp.oddNumbersShow();             //ex6

        logicalOp.sumAndAverage();              //ex7

        logicalOp.numereDivizibile(1,222);     // ex8

        logicalOp.fibonnaciNumbers();                   //ex9

        logicalOp.wozaCozaLoza();                    //ex10

        // Teme array

        int [] array = logicalOp.getArray();        //ex2

        int [] evenNumbers = logicalOp.evenNumbersArray(1,100);        //ex3

        System.out.println(logicalOp.averageArray(array));          //ex4

        System.out.println(logicalOp.stringArrays(new String []{"mere","pere","nuci","banane"},"mere"));     //ex5

        System.out.println("Number position is : " + logicalOp.checkNumber(new int[]{1,2,3,4,5,6},2));     //ex6

        logicalOp.pattern();                //ex7

        System.out.println(Arrays.toString(logicalOp.removeNrFromArray(new int[]{1, 2, 3, 4, 5, 6}, 2)));     //ex8

        System.out.println(logicalOp.getSecondSmallestNrInArray(new int[]{1,2,3,4,5,6,7}));     //ex9

        //System.out.println(Arrays.toString(logicalOp.copyArray(new int[]{1, 2, 3, 4, 5, 6}, new int[]{})));     //ex10

        //Teme List

        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        logicalOp.displayList(myList);      //ex1

        logicalOp.addToList(myList,10);     //ex2
        System.out.println(myList);            //ex2

        logicalOp.listShow(myList,3);       //ex3       (nu functioneaza)

        logicalOp.backwardsList(myList);        //ex4

       List<String> stringList = new ArrayList();      //ex5
       stringList.add("Ana");
        stringList.add("are");
        stringList.add("mere");
        stringList.add("si");
        logicalOp.stringList(stringList,4,"pere");
        System.out.println(stringList);

        logicalOp.someList(myList,0,9);     //ex6
        System.out.println(myList);

        logicalOp.listPositions(myList);        //ex7

        System.out.println(logicalOp.biggestListNumber(myList));        //ex8 (nu functioneaza)

    }
}











