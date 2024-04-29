package treinando.lista08.exercicio04;

public class TesteMain {

    public static void main(String[] args) {

        ConjuntoDePalavras cp = new ConjuntoDePalavras("bola", "gato", "louca");
        String input = "bola gato louca";
        System.out.println(cp.contemTodas(input));
    }
}

//Neste código, o método contemTodas(String palavras) recebe uma string
//contendo várias palavras separadas por espaços. Ele divide essa string em palavras
//individuais usando o método split(" ") e, em seguida, verifica se cada palavra está
//presente no conjunto encapsulado usando o método contains(palavra). Se todas as palavras
//estiverem presentes, o método retorna true, caso contrário, retorna false.
