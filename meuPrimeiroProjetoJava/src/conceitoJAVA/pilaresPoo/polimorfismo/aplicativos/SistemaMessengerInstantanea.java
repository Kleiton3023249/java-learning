package conceitoJAVA.pilaresPoo.polimorfismo.aplicativos;

public abstract class SistemaMessengerInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // apenas lido pelas classes filhas e dentro do mesmo pacote:
    protected void verificarConexao() {
        System.out.println("Verificar conexão");
    }
}
