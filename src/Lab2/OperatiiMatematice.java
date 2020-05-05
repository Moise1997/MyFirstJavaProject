package Lab2;

public class OperatiiMatematice {
    public static void main(String[] args) {

        System.out.println("Rezultatul adunarii este: " + adunare (10,12));
        System.out.println("Afiseaza rezultatul scaderii: " + scadere(1400,700));
        System.out.println("Afiseaza rezultatul inmultirii: " + inmultire(15,20));
        System.out.println("Afiseaza rezultatul impartirii: " + impartire(200,10));
    }

    public static int adunare(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public static int scadere (int income, int bills) {
        int result = income - bills;
        return result;
    }

    public static int inmultire (int mere, int pere){
        int result = mere * pere;
        return result;
    }

    public static int impartire (int paini, int oameni){
        int result = paini / oameni;
        return result;
    }





}
