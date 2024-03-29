package conceitoJAVA.pilaresPoo.polimorfismo.aplicativos;

public class Facebook extends SistemaMessengerInstantanea {
    public void enviarMensagem() {
        verificarConexao(); //chamando método protected
        System.out.println("Enviando Mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook");
    }
}


