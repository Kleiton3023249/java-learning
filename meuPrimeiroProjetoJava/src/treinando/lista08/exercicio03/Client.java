package treinando.lista08.exercicio03;

public class Client {
    public static void main(String[] args) {

        CadastroAluno ca = new CadastroAluno();
        ca.iniciarLista();

        Aluno aluno = new Aluno(8254L, "Kleiton Ferreira", "Filosofia");
        ca.adicionarAluno(aluno);

        Aluno aluno1 = new Aluno(5487L, "Lucas Pascoal", "Matemática");
        ca.adicionarAluno(aluno1);

        ca.ordenarAluno();
        ca.imprimirAluno();

    }
}