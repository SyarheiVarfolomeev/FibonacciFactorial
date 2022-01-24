public class Fibonacci {

    private Fibonacci(){
    };

    public static int[] choiceOfFibonacci(int loopType, int n) {
        switch (loopType) {
            case 1:
                return getFibonacciWhile(n);
            case 2:
                return getFibonacciDowhile(n);
            case 3:
                return getFibonacciFor(n);
        }
        return new int[0];
    }

    private static int[] getFibonacciWhile(int naturalNumber){
        int[] fibonacci = getIntArray(naturalNumber);
        int i = 2;
        while ( i < naturalNumber){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;
    }
    private static int[] getFibonacciDowhile(int naturalNumber){
        int[] fibonacci = getIntArray(naturalNumber);
        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }while (i < naturalNumber);
        return fibonacci;
    }
    private static int[] getFibonacciFor(int naturalNumber){
        int[] fibonacci = getIntArray(naturalNumber);
        for (int i = 2; i < naturalNumber; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
    private static int[] getIntArray(int naturalNumber){
        int[] Array = new int[naturalNumber];
        Array[0] = 0;
        Array[1] = 1;
        return Array;
    }
}
