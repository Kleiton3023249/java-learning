package lista01.exercicio02;

public class leitorIdade {

    double ConverterEmDias (double ano, double mes, double dias) {
       double anoEmDia = ano*365;
       double mesEmdia = mes*30;
       double diasTotal = anoEmDia + mesEmdia + dias;
       return diasTotal;
}
}
