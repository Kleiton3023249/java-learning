package lista01.exercicio01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterFahrenheitCliente{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double F = sc.nextDouble();
    
        ConverterFahrenheit converter = new ConverterFahrenheit();
        double celsius = converter.converterFahrenheitParaCelsius(F);
        DecimalFormat dc = new DecimalFormat("#.##");
        String numeroFormatado = dc.format(celsius);
    
        System.out.println("A temperatura em Celsius é: " + numeroFormatado + "ºC");
    
        sc.close();
        
    }
}