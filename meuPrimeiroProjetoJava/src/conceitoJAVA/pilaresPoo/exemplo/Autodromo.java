package conceitoJAVA.pilaresPoo.exemplo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();

        //herança  de Veiculo
        Moto z400 = new Moto();
        z400.setChassi("854688");
        System.out.println(z400.getChassi());
    }

    
    
}
