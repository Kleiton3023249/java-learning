package treinando.lista08.exercicio05;

public class TesteMapaAluno {

    public static void main(String[] args) {

        //REAPROVEITO CLASSE ALUNO JÁ CRIADA;

        Aluno aluno1 = new Aluno(1234L, "Kleiton", "Filosofia");
        Aluno aluno2 = new Aluno(5689L, "Lucas", "Matemática");
        Aluno aluno3 = new Aluno(6789L, "Silva", "Português");
        Aluno aluno4 = new Aluno(6945L,"José", "História");
        Aluno aluno5 = new Aluno(9874L, "Anderson", "Vagabundo");

        HashMap<Long, Aluno> mapa = new HashMap<>();
        mapa.put(aluno1.getMatricula(), aluno1);
        mapa.put(aluno2.getMatricula(), aluno2);
        mapa.put(aluno3.getMatricula(), aluno3);
        mapa.put(aluno4.getMatricula(), aluno4);
        mapa.put(aluno5.getMatricula(), aluno5);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da mátricula do Aluno: ");
        long matricula = sc.nextLong();

        Aluno alunoEncontrado = mapa.get(matricula);
        if(alunoEncontrado == null) {
            System.out.println("Aluno não encontrado!");
        }
        else {
            System.out.println("Dados do aluno:");
            System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
            System.out.println("Nome: " + alunoEncontrado.getNome());
            System.out.println("Curso: " + alunoEncontrado.getCurso());
        }

    sc.close();

    }
}

