package treinando.lista08.exercicio04;

public class ConjuntoDePalavras {

    private HashSet<String> conjunto = new HashSet<>();
    private String[] palavra;

    public ConjuntoDePalavras(String... palavra) {
        this.palavra = palavra;
        for (String s : palavra) {
            conjunto.add(s);
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.split(" ");

        for (String palavra : palavrasArray) {
            if (!conjunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }
}
