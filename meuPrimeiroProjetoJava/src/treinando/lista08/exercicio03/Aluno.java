package treinando.lista08.exercicio03;


public class Aluno implements Comparable<Aluno>{


    public long matricula = 0;
    public String nome;
    public String curso;

    @Override
    public int compareTo(Aluno outroAluno) {
        return Long.compare(this.matricula, outroAluno.matricula);
    }

    public Aluno(long m, String n, String c) {
        this.matricula = m;
        nome = n;
        curso = c;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}

