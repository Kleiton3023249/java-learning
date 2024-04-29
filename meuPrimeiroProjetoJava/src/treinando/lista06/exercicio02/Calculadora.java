package treinando.lista06.exercicio02;

public class Calculadora {
    public void verificarNumero (int x) throws ArithmeticException {
        if (x - Math.floor(x) != 0 ) {
            throw new ArithmeticException (" Opa… Acho que você se enganou! Digite novamente… ");
        } else System.out.println("Arrasou");
    }
}
