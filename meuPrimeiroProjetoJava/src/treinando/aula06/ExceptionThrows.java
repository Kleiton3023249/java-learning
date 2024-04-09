package treinando.aula06;

public class ExceptionThrows {

    public int div (int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }
}
