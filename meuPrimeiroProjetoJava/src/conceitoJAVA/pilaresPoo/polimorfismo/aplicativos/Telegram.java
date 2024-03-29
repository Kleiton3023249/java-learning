package conceitoJAVA.pilaresPoo.polimorfismo.aplicativos;

public class Telegram  extends SistemaMessengerInstantanea {
    public void enviarMensagem() {
        verificarConexao(); //chamando método protected
        System.out.println("Enviando Mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram");
    }
}
