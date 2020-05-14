import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Rezultatul este: " + calc.adunare(12, 15));
        System.out.println("Rezultatul este: " + calc.scadere(200, 123));
        System.out.println("Rezultatul este: " + calc.impartire(16, 2));
        System.out.println("Rezultatul este: " + calc.inmultire(100, 12));


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

        System.out.println(logicalOp.average(1));

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




    }
}











