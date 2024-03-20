package lista02.exercicio01;

// O dia da semana para uma data qualquer pode ser calculado pela seguinte fórmula:
// DIA DA SEMANA = RESTO ((TRUNCA(2,6 * M – 0,1) + D + A + QUOCIENTE(A, 4) +
// QUOCIENTE(S, 4) – 2 * S), 7)
// Onde:
// M – representa o número do mês. Janeiro e fevereiro são os meses 11 e 12 do ano
// precedente, março é o mês 1 e dezembro é o mês 10;
// D – representa o dia do mês;
// A – representa o número formado pelos dois últimos algarismos do ano;
// S – representa o número formado pelos dois primeiros algarismos do ano.
// Os dias da semana são numerados de zero a seis (domingo corresponde a 0, segunda a
// 1, e assim por diante).
// Fazer um programa na Linguagem Java que: determine o dia da semana correspondente
// a data lida, segundo o método especificado, onde: RESTO, TRUNCA e QUOCIENTE são
// funções a serem programadas. Ao final o programa deverá escrever a data lida e o dia
// da semana calculado.


public class diaDaSemana {
    int mes;
    int dia;
    int ano;
    int seculo;

    int informarDiaDaSemana (int mes, int dia, int ano, int seculo) {
        double trunca = Math.floor(2.6 * mes - 0.1);
        int truncado = (int) trunca;
        int quociente01 = ano / 4;
        int quociente02 = seculo / 4;
        double diaDaSemana = Math.floor((truncado + dia + ano + quociente01 + quociente02 - (2*seculo))%7);
        int diaDaSemana02 = (int) diaDaSemana;
        return diaDaSemana02;
    }

    
}
