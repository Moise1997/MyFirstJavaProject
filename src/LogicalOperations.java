import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class LogicalOperations {


    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }
    }

    public String textCheck(String text) {
        if (text.equals("FastTrackIt")) {
            return "Learning text comparison";
        } else if (!text.equals("FastTrackIt")) {
            return "Got to try some more";
        }
        return text;
    }


    public String ceva(String text, int x) {
        if (text.equals("FastTrackIt") && x <= 3) {
            return "FastTrackIt" + x;
        } else if (!text.equals("FastTrackIt") && x >= 4) {
            return x + "FastTrackIt";
        }
        return text + x;
    }


    public String snow(String text, int x) {
        if (x > 8 || x == 6) {
            return "The amount of snow this winter was: " + x;
        } else if (x < 8 || x > 6) {
            return "The forecast snow is: " + x;
        }
        return text + x;
    }

    public String number(String text, int x) {
        if (x > 3 && x != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
            return "The number is lower than 3";
        }
        return text + x;
    }


    public int la (int x){
        int la = x;
        switch (x){
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;

        }
        return la;

    }


    public String isNumberEven (int x){
        int remainder = x%2;
        if (remainder == 0){
            return "True";
        }else{
            return "False";
        }
    }


    public String isEligibleToVote (int x){
        if (x > 18){
            return "True";
        }else{
            return "False";
        }
    }


    public int la (int x, int y, int z){
        if (x > y && x > z){
            return x;
        }else if (y > x && y > z){
            return y;
        }else{
            return z;
        }
    }
}

























