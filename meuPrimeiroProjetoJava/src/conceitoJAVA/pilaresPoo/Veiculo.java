package conceitoJAVA.pilaresPoo;

//é preciso definir a classe mãe como abstrata para
//criar um método abstrato, se esse método não for
// definido em cada classe filha conforme herança, da erro.

//o método abstrato precisa ser chamado em cada classe filha, com suas especificações.

//pode-se dizer que o método abstrato impõe um método 
// a ser criado a cada classe filha que a herde.

public abstract class Veiculo {
    private String chassi;
    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
