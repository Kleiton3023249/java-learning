package lista02.exercicio02;

import java.util.Scanner;

public class dataValidaCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma data válida: ");

        System.out.print("Entre com o ano: ");
        int ano = sc.nextInt();

        System.out.print("Entre com um mes: ");
        int mes =sc.nextInt();

        System.out.print("Entre com um dia: ");
        int dia = sc.nextInt();

        System.out.printf("A data digitada foi %d/%d/%d \n", dia, mes, ano);

        dataValida dv = new dataValida();
        String dataValida = dv.validarData(ano, mes, dia);

        System.out.println(dataValida);

        sc.close();

    }
}
