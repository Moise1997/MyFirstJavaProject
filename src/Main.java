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

        int number = 1;
        logicalOp.printNumbers(number);

        int nr1 = -1;
        int nr2 = -100;
        logicalOp.countToMinusHundred(nr1,nr2);

        int a = 122;
        int b = 200;
        logicalOp.countingStars(a,b);

        int x =4;
        int y = 10;
        logicalOp.biggerNumber(x,y);

        logicalOp.evenNumbers();

        logicalOp.oddNumbers();

        int sum = 0;
        System.out.println(logicalOp.sum(0));

        float sum2 = 0;
        float average = sum2 / 100F;
        System.out.println(logicalOp.average(0));

        logicalOp.tipar(7);




    }
}











