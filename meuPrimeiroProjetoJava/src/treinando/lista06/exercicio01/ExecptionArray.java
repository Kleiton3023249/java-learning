package treinando.lista06.exercicio01;

public class ExecptionArray {
    public static void main (String[] args) {

        System.out.println("Incio de main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("Inicio do metodo1");
        try {
        metodo2();
        }

        catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exceção: " + e.getMessage());
        }

        System.out.println("Fim do metodo1");
    }

    static void metodo2() throws ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do metodo2");
        int [] array = new int [10];
        for (int i = 0; i <= 15; i++) {

            if ( i >= array.length) {
                throw new ArrayIndexOutOfBoundsException( "Tentativa de acesso além dos limites do array ");
            }
            array [i] = i;
            System.out.println(i);
        }

    System.out.println("Fim do metodo2");
    }
}
