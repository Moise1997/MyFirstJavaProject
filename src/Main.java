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


        LogicalOperations LogicalOp = new LogicalOperations();
        int biggest = LogicalOp.checkBiggerNumber(143, 23);
        System.out.println("The biggest number is: " + biggest);


        System.out.println(LogicalOp.textCheck("Capra cu trei iezi"));


        System.out.println(LogicalOp.ceva("ceva", 5));


        System.out.println(LogicalOp.snow("The", 12));


        System.out.println(LogicalOp.number("ceva", 2));


        System.out.println(LogicalOp.isNumberEven(4));


        System.out.println(LogicalOp.isEligibleToVote(17));


        System.out.println(LogicalOp.la(6,2,5));



    }
}











