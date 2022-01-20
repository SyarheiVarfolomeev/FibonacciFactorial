import java.util.Arrays;

public class ChoiceOfMethod {
    int algorithmId;
    int loopType;
    int n;

    public ChoiceOfMethod(int algorithmId, int loopType, int n) {
        this.algorithmId = algorithmId;
        this.loopType = loopType;
        this.n = n;
    }

    public String choice() {
        if (algorithmId == 1) {
            return Arrays.toString(choiceOfFibonacci());
        }else{
            return String.valueOf(choiceOfFactorial());
        }
    }

   public int[] choiceOfFibonacci() {
       switch (loopType) {
               case 1:
                   return Fibonacci.getFibonacciWhile(n);
               case 2:
                   return Fibonacci.getFibonacciDowhile(n);
                case 3:
                    return Fibonacci.getFibonacciFor(n);
       }
       return new int[0];
   }

    public long choiceOfFactorial() {
        switch (loopType) {
            case 1:
                return   Factorial.getFactorialWhile(n);
                case 2:
                    return   Factorial.getFactorialDoWhile(n);
                    case 3:
                        return Factorial.getFactorialFor(n);
        }
        return 0;
    }
}