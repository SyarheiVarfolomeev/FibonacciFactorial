public class Factorial{

    private Factorial(){
    };

    public static long choiceOfFactorial(int loopType, int n) {
        switch (loopType) {
            case 1:
                return   getFactorialWhile(n);
            case 2:
                return   getFactorialDoWhile(n);
            case 3:
                return getFactorialFor(n);
        }
        return 0;
    }

    private static long getFactorialWhile(int naturalNumber){
        long rez = 2L;
        while (naturalNumber > 1){
            rez *= naturalNumber;
            naturalNumber--;
        } return rez;
    }
    private static long getFactorialDoWhile(int naturalNumber){
        long rez = 1L;
        do{
            rez *= naturalNumber;
            naturalNumber--;
        }while (naturalNumber > 1);
        return rez;
    }
    private static long getFactorialFor(int naturalNumber){
        long rez = 1L;
        for (int i = naturalNumber; i > 1; i--) {
            rez *= naturalNumber;
            naturalNumber--;
        }
        return rez;
    }
}
