package treinando.aula06;

public class ThrowsCliente {
    public static void main (String[] args) {

        ExceptionThrows et = new ExceptionThrows();

        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
            JOptionPane.showMessageDialog(null, x + "/" + y + " =" + x/y);
        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato inválido, Detalhes do erro:" + e.getMessage());
        }

        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Operação inválida, Detalhes do erro:" + e.getMessage());
        }

        finally {
            JOptionPane.showMessageDialog(null, "Execução concluida");
        }
    }
}
