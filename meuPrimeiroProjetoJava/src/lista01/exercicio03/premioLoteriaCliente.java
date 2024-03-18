package lista01.exercicio03;

import java.util.Scanner;

public class premioLoteriaCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do premio: ");
        double valorPremio = sc.nextDouble();

        System.out.print("Entre com sua quantidade de acertos 6 (seno), 5 (quina), 4 (quarta) : ");
        double numerosAcertos = sc.nextDouble();

        premioLoteria valor = new premioLoteria();
        double quantia = valor.CalcularValorPremio(valorPremio, numerosAcertos);

        System.out.println("O valor que você irá receber será: " + quantia);

        sc.close();

    }
}
