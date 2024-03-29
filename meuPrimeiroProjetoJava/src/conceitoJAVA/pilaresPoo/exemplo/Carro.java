package conceitoJAVA.pilaresPoo.exemplo;

public class Carro extends Veiculo {


    //encapsulamento dos métodos confere...
    public void ligar () {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Confere câmbio em P");
    }
}
