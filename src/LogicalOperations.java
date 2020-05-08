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


    public int la(int x) {
        int la = x;
        switch (x) {
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


    public String isNumberEven(int x) {
        int remainder = x % 2;
        if (remainder == 0) {
            return "True";
        } else {
            return "False";
        }
    }


    public String isEligibleToVote(int x) {
        if (x > 18) {
            return "True";
        } else {
            return "False";
        }
    }


    public int la(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }


    public void printNumbers(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }

    public void countToMinusHundred(int nr1, int nr2) {
        for (int a = nr1; a >= nr2; a--)
            System.out.println(a);
    }

    public void countingStars(int a, int b) {
        for (int stars = a; stars < b; stars++)
            System.out.println(stars);
    }

    public void biggerNumber(int x, int y) {
        if (x < y) {
            for (int big = x; big < y; big++)
                System.out.println(big);
        } else {
            System.out.println("party time");
        }
    }

    public void evenNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sum(int sum) {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float average(float sum2) {
        for (float i = 1; i <= 100; i++) {
            sum2 += i;
        }
        float average = sum2 / 100;
        return average;
    }

    public void tipar(int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}



























