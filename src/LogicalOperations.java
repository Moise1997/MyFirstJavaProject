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

    // Tema loop for

    public void printNumbers(int number) {      //ex1
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }

    public void countToMinusHundred(int nr1, int nr2) {         //ex2
        for (int a = nr1; a >= nr2; a--)
            System.out.println(a);
    }

    public void countingStars(int a, int b) {           //ex3
        for (int stars = a; stars < b; stars++)
            System.out.println(stars);
    }

    public void biggerNumber(int x, int y) {            //ex4
        if (x < y) {
            for (int big = x; big < y; big++)
                System.out.println(big);
        } else {
            for (int small = y; small < x; small++)
            System.out.println(small);
        }
    }

    public void evenNumbers() {                     //ex5
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void oddNumbers() {                  //ex6
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sum() {                   //ex7
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float average(float a) {              //ex8
        float sum2 = 0;
        float counter = 0;
        for (float i = a; i <= 100; i++) {
            sum2 += i;
            counter++;
        }
        return sum2/counter;
    }

    public void tipar(int number) {                 //ex9
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // Tema loop while

    public void counting(int numb) {        //ex1
        while (numb <= 100) {
            System.out.println(numb);
            numb++;
        }

    }

    public void countingBackwards(int numb) {       //ex2

        while (numb >= -100) {
            System.out.println(numb);
            numb--;
        }

    }

    public void countingApples(int a, int b) {              //ex3
        while (a < b) {
            System.out.println(a);
            a++;
        }

    }

    public void bigger(int x, int y) {     //ex4
        if (x <= y) {
            while (x <= y) {
                System.out.println(x++);
            }
        } else {
            while (y <= x) {
                System.out.println(y++);
            }
        }
    }

    public void evenNumbersShow() {         //ex5
        int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void oddNumbersShow() {           //ex6
        int i = 1;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void sumAndAverage() {              //ex7
        int i = 111;
        int i2 = 8899;
        double sum = 0;
        int count = 0;
        while (i <= i2) {
            sum += i;
            i++;
            count++;
        }
        System.out.println(count);
        double average = sum/count;
        System.out.println("The average number is:" + average);
    }

    public void numereDivizibile(int firstNumber, int lastNumber) {
        float count = 0F;
        float sum = 0F;
        while (firstNumber <= lastNumber) {
            if (firstNumber % 7 == 0) {
                count ++;
                sum += firstNumber;
            }
            firstNumber++;
        }
        float average = sum / count;
        System.out.println(average);
    }

    public void fibonnaciNumbers() {                //ex9
        int c, a = 1, b = 1;
        c = 0;
        System.out.print("1 1 ");
        while (c <= 11000) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(" ");
    }

    public void wozaCozaLoza() {
        int i = 1;

        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }

    }
    }

































