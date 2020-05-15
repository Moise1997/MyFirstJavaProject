public class Calculator {

    public int adunare(int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }
    public int adunare(int primulNumar, int alDoileaNumar, int alTreileaNumar){
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }
    public float adunare(float primulNumar, int alDoileaNumar){
        float rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public int scadere (int income, int bills) {
        int result = income - bills;
        return result;
    }
    public float scadere (int income, float bills) {
        float result = income - bills;
        return result;
    }
    public int scadere (int income, int bills, int costs) {
        int result = income - bills - costs;
        return result;
    }


    public int inmultire (int mere, int pere){
        int fructe = mere * pere;
        return fructe;
    }
    public int inmultire (int mere, int pere, int ananasi){
        int fructe = mere * pere * ananasi;
        return fructe;
    }
    public int inmultire (int mere, int pere, byte nuci){
        int fructe = mere * pere * nuci;
        return fructe;
    }

    public int impartire (int paini, int oameni){
        int result = paini / oameni;
        return result;
    }
    public float impartire (int paini, int barbati, int copii){
        float result = paini / barbati / copii;
        return result;
    }
    public float impartire (float paini, int oameni){
        float result = paini / oameni;
        return result;
    }
}
