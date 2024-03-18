public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Kleiton";
        String segundoNome = "Ferreira";
        String nomeCompleto = escreverCompleto(primeiroNome,segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String escreverCompleto (String primeiroNome, String segundoNome) { 
        return primeiroNome.concat(" ").concat(segundoNome);    
    }
}
