
package rectangulo;


public class Rectangulo {
   private double base;
    private double altura;
    
    public Rectangulo(){
        this.base = 0;
        this.altura=0;
    }
    
    public double getBase(){
        return this.base;
    }   
    public double getAltura(){
        return this.altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2*(this.altura + this.base);
      
    }
 
}
