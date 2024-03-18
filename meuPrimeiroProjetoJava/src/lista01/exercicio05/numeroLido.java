package lista01.exercicio05;

// Faça um programa que leia um número inteiro positivo de três dígitos (de 100 até 999).
// Gere outro número formado pelos dígitos invertidos do número lido.
// OBS: Não devem ser utilizados comandos e/ou funções que ainda não foram abordadas, tais
// como: laços de decisão, laços de repetição, etc

public class numeroLido {
    String x;
    String y;
    String z;

    String trocarOrdem (String x,String y, String z) {
        String novoNumero = z + y + x;
        return novoNumero;
    }
}
