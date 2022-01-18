public class Fibonacci {
    public static int[] getFibonacciWhile(int naturalNumber){
        int[] fibonacci = new int[naturalNumber];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        while ( i < naturalNumber){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;
    }
    public static int[] getFibonacciDowhile(int naturalNumber){
        int[] fibonacci = new int[naturalNumber];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }while (i < naturalNumber);
        return fibonacci;
    }
    public static int[] getFibonacciFor(int naturalNumber){
        int[] fibonacci = new int[naturalNumber];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < naturalNumber; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
