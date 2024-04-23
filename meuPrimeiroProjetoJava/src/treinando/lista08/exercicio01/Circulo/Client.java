package treinando.lista08.exercicio01.Circulo;

public class Client {
    
    public static void main(String[] args) {
           
        ArrayList<Circulo> c = new ArrayList<>();
        
        Circulo c1 = new Circulo(1);
        c.add(c1);
        
        Circulo c2 = new Circulo(10);
        c.add(c2);
        
        for (Circulo circulo : c) {
        System.out.printf("O Círculo de raio %.2f, tem área %.2f%n", circulo.raio, circulo.calcularArea());
       }
            
   }
         
}
   
