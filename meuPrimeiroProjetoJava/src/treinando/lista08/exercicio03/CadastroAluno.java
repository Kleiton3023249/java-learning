package treinando.lista08.exercicio03;

import java.util.ArrayList;

public class CadastroAluno extends Aluno{

    private ArrayList<Intenger> lista = new ArrayList<>();

    public void implementar(Aluno aluno) {
        lista.add(aluno);
    }

    public void organizar(){
        for (Aluno aluno: lista ) {
            if (list.get(aluno) > list.get(aluno + 1)) {
                Aluno temp = aluno + 1;
                aluno + 1 = aluno;
                aluno = temp;
            }
        }
    }





}
