package treinando.lista08.exercicio02;

public class TesteHashSetCPF {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("09906847417");
        hashSet.add("06895849785");
        hashSet.add("95687425658");
        hashSet.add("23654166526");
        hashSet.add("22384684948");
        hashSet.add("23548866666");
        hashSet.add("98756566232");
        hashSet.add("19918648828");
        hashSet.add("09358498720");
        hashSet.add("41765946686");
        hashSet.add("41765946686");

        System.out.println("Todo o conteudo do hashSet:\t" + hashSet);
    }


}