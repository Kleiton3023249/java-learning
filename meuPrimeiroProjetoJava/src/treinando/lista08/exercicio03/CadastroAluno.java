package treinando.lista08.exercicio03;

import java.util.ArrayList;

public class CadastroAluno {

    public ArrayList<Aluno> minhaLista;

    public void iniciarLista() {
        minhaLista = new ArrayList<>();
    }


    public void adicionarAluno(Aluno aluno) {
        minhaLista.add(aluno);
    }

    public void ordenarAluno() {
        Collections.sort(minhaLista);
    }

    public void imprimirAluno() {
        for ( Aluno aluno : minhaLista) {
            System.out.println("Matrícula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        }
    }

}