package conceitoJAVA.pilaresPoo.heranca;

public class ServicoMessanger {
    public static void main(String[] args) {

        System.out.println("MSN:");

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();


        System.out.println("Facebook:");

        Facebook fb = new Facebook();
        fb.enviarMensagem();
        fb.receberMensagem();

        System.out.println("Telegram:");

        Telegram tl = new Telegram();
        tl.enviarMensagem();
        tl.receberMensagem();

    }
}
