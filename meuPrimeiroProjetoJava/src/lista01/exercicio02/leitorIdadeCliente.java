package lista01.exercicio02;

import java.util.Scanner;

public class leitorIdadeCliente {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua idade expressa em ano, mes e dias");

    System.out.print("Digite sua idade: ");
    double ano = sc.nextDouble();

    System.out.print("Digite o mes de nascimento: ");
    double mes = sc.nextDouble();

    System.out.print("Digite o dia de nascimento: ");
    double dia = sc.nextDouble();

    leitorIdade li = new leitorIdade();
    double quantidade = li.ConverterEmDias(ano, mes, dia);

    System.out.println("O valor total é: " + quantidade);

    sc.close();
    }



}
