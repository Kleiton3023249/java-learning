package lista02.exercicio01;

import java.util.Scanner;

public class diaDaSemanaCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que dia é hoje? Entre com a data de hoje: ");
        System.out.print("Digite a data do dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite a data do mes: ");
        int mes = sc. nextInt();

        System.out.println("Agora vamos fazer diferente...");
        System.out.print("Digite os dois primeiros numero do ano: ");
        int seculo = sc.nextInt();

        System.out.print("Digite os dois ultimos numero: ");
        int ano = sc.nextInt();

        System.out.printf("A data digitada foi %d/%d/%d%d \n", dia, mes, seculo, ano);

        diaDaSemana ds = new diaDaSemana();
        int diaDaSemana02 = ds.informarDiaDaSemana(mes, dia, ano, seculo);

        System.out.printf(" exibir: %d ", diaDaSemana02);

        

        switch (diaDaSemana02) {
            case 0 : System.out.println("Dominguinho, descansa que amanhã já é dia luta");
                break;
            case 1 : System.out.println("Segunda amore, bora pra guerra");
                break;
            case 2 : System.out.println("Terça-feira, você já sabe que o dia vai ser ruim, faz o mínimo pra manter o carisma");
                break;
            case 3 : System.out.println("Quarta-feira, zerou carisma, mas pensa que já ta na metade");
                break;
            case 4 : System.out.println("Quinta dlcinha, só mais um diaaa!");
                break;
            case 5 : System.out.println("Sextooouu, vai dormir, vai se recuperar dessa semana");
                break;
            case 6: System.out.println("Sábadinhooo dia de pecar, se joga dá sua vida em algum rolê");
                break;
            default: System.out.println("Algo de errado não deu certo");
            break;
        }

        sc.close();

    }
    
}


// falta nesse código fazer uma parte onde ele troca os números do mês