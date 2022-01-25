import java.util.Arrays;
import java.util.Objects;

public class ChoiceOfMethod {
    int algorithmId;
    int loopType;
    int n;

    public ChoiceOfMethod(int algorithmId, int loopType, int n) {
        validateInputDateAlgorithmId(algorithmId);
        this.algorithmId = algorithmId;
        validateInputDateLoopType(loopType);
        this.loopType = loopType;
        this.n = n;
    }

    public String choice() {
        switch (algorithmId) {
            case 1:
                return   Arrays.toString(Fibonacci.choiceOfFibonacci(loopType, n));
            case 2:
                return   String.valueOf(Factorial.choiceOfFactorial(loopType, n));
        }
        return null;
    }

    public int getAlgorithmId() {
        return algorithmId;
    }

    public int getLoopType() {
        return loopType;
    }

    public int getN() {
        return n;
    }

    private void validateInputDateAlgorithmId(int algorithmId) {
        if ( algorithmId < 1 || algorithmId > 2) {
            throw new InsufficientFundsException("Неверное первое число выбора (надо либо 1, либо 2)");
        }
    }

    private void validateInputDateLoopType( int loopType) {
        if ( loopType < 1 || loopType > 3) {
            throw new InsufficientFundsException("Неверное второе число выбора (надо либо 1, либо 2, либо 3)");
        }
    }

    @Override
    public String toString() {
        return "ChoiceOfMethod{" +
                "algorithmId=" + algorithmId +
                ", loopType=" + loopType +
                ", n=" + n +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChoiceOfMethod that = (ChoiceOfMethod) o;
        return algorithmId == that.algorithmId && loopType == that.loopType && n == that.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithmId, loopType, n);
    }
}