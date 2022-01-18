public class Factorial{
    public static long getFactorialWhile(int naturalNumber){
        long rez = 2L;
        while (naturalNumber > 1){
            rez *= naturalNumber;
            naturalNumber--;
        } return rez;
    }
    public static long getFactorialDoWhile(int naturalNumber){
        long rez = 1L;
        do{
            rez *= naturalNumber;
            naturalNumber--;
        }while (naturalNumber > 1);
        return rez;
    }
    public static long getFactorialFor(int naturalNumber){
        long rez = 1L;
        for (int i = naturalNumber; i > 1; i--) {
            rez *= naturalNumber;
            naturalNumber--;
        }
        return rez;
    }
}
