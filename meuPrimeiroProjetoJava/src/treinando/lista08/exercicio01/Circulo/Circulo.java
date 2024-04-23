package treinando.lista08.exercicio01.Circulo;



public class Circulo {
    
    double raio;
    
        public Circulo(double raio) {
            this.raio = raio;     
        }
    
        public double calcularArea() {
     
            double area = 3.14 * (raio*raio);
            return area;   
        }
        
    }
