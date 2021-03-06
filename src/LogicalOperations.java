import java.util.ArrayList;
import java.util.List;

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
        return sum2 / counter;
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
        double average = sum / count;
        System.out.println("The average number is:" + average);
    }

    public void numereDivizibile(int firstNumber, int lastNumber) {
        float count = 0F;
        float sum = 0F;
        while (firstNumber <= lastNumber) {
            if (firstNumber % 7 == 0) {
                count++;
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

    // Teme array

    public int [] getArray() {              //ex2
        int[] array = new int[100];
        array[0] = 1;
        array[1] = 2;
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
        return array;
    }

    public int [] evenNumbersArray (int from, int to){          //ex3
        int [] array = new int [((to-from) /2 ) +1];
        int index = 0;
        for(int i = from; i < to; i++){
            if (i%2 ==0){
                array[index] = i;
                index ++;
                System.out.println(i);
            }

        }
        return array;
    }

    public float averageArray (int [] array){               //ex4
        float sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array [i];
        }
        return sum / array.length;
    }

    public boolean stringArrays (String [] array, String ceva) {      //ex5
        for (String s : array) {
            if (ceva.equals(s)) {
                return true;
            }
        }
        return false;
    }


    public int checkNumber (int [] array, int number){          //ex6
        int da = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                da = i;
            }
        }
        return da;
    }

    public void pattern(){                      //ex7
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }
    }

    public int[] removeNrFromArray(int[] myArray, int nr) {         //ex8
        int[] secondArray = new int[myArray.length];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
    }

    public int getSecondSmallestNrInArray(int[] myArray) {          //ex9
        int arrLen = myArray.length;
        int iMin = myArray[0];
        int i;
        for (i = 0; i < arrLen; i++) {
            if (myArray[i] < iMin)
                iMin = myArray[i];
        }
        int iMin2 = 2147483647;
        for (i = 0; i < arrLen; i++) {
            if (myArray[i] < iMin2 && myArray[i] != iMin)
                iMin2 = myArray[i];
        }
        return iMin2;
    }

    public int[] copyArray(int[] firstArray, int[] emptyArray) {            //ex10
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
        return emptyArray;
    }

    //Teme List

    public void displayList(List<Integer> list){            //ex1
        for (int x : list){
            System.out.println(x);
        }
    }

    public void addToList(List<Integer> myList, int x) {            //ex2
        myList.add (x);
    }

    public void listShow (List<Integer> list, int x){           //ex3   (nu functioneaza)
        for (int i = x; i == x; i++){
            System.out.println(x);
        }
    }

    public void backwardsList (List<Integer> list){         //ex4
        for (int i = list.size() - 1 ; i > 0 ; i--){
            System.out.println(i);
        }
    }

    public void stringList (List<String> list, int x, String y){        //ex5
        list.add(x,y);
    }

    public void someList (List<Integer> list, int x, int y){        //ex6
        list.add(x,y);
    }

    public void listPositions (List<Integer> list){             //ex7
        System.out.println("Pe pozitia 1 este valoarea: " + list.get(0));
        System.out.println("Pe pozitia 2 este valoarea: " + list.get(1));
        System.out.println("Pe pozitia 3 este valoarea: " + list.get(2));
        System.out.println("Pe pozitia 4 este valoarea: " + list.get(3));
        System.out.println("Pe ultima pozitie este valoarea: " + list.get(list.size()-1));
    }

    public int biggestListNumber (List<Integer> list){          //ex8 (nu functioneaza)
        return Integer.MAX_VALUE;
    }



}





































