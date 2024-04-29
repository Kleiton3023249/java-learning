package treinando.aula06;

public class Divbyzero extends ArithmeticException {
    
    public Divbyzero () {
        super("Tenativa de divisão por zero");
    }

    public Divbyzero (String msg) {
        super("Testando Testando");
    }

    public String toString() {
        return "Divisão por zero";
    }
}
