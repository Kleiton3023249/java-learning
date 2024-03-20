package lista01.exercicio05;

import java.util.Scanner;

// Faça um programa que leia um número inteiro positivo de três dígitos (de 100 até 999).
// Gere outro número formado pelos dígitos invertidos do número lido.
// OBS: Não devem ser utilizados comandos e/ou funções que ainda não foram abordadas, tais
// como: laços de decisão, laços de repetição, etc

public class numeroLidoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com três digitos a formar um número inteiro entre 100 e 999");
        System.out.print("Entre com o primeiro dígito: ");
        String x = sc.nextLine();

        System.out.print("Entre com o segundo dígito: ");
        String y = sc.nextLine();

        System.out.print("Entre com o terceiro dígito: ");
        String z = sc.nextLine();

        System.out.println("O numero digitado é: " + (x + y + z));

        numeroLido nl = new numeroLido();
        String novoNumero = nl.trocarOrdem(x, y, z);

        System.out.println("O Novo número gerado é : " + novoNumero);

        sc.close();

    }
    
}
