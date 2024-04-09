package treinando.lista06.exercicio03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(null);
            System.out.printl("entre com um valor: ");
            double saida = sc.nextDouble;
            Conta c = new Conta();
            c.sacar(saida);
        }
        catch (SaldoException e) {
            System.out.println(" errou " + e.getMessage());
        }
        finally {
            System.out.println("Arrasou!!!");
        }

        sc.close();
    }
}
