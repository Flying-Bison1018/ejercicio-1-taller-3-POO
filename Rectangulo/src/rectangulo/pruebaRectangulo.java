
package rectangulo;


public class pruebaRectangulo {

  
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.setAltura(15);
        r.setBase(6);
        
        System.out.println("El area es:"+r.calcularArea());
        System.out.println("El perimetro es:"+r.calcularPerimetro());
    }
    
}
