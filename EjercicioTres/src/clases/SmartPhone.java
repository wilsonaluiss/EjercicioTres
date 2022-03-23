package clases;

public class SmartPhone extends Computer {

    String operador;

    public SmartPhone(String operador, String marca, double precio, String OS) {
        super(marca, precio, OS);
        this.operador = operador;
    }
    
    void tecnologia(){
        System.out.println("Tecnologia de punta");
    }
    
    
}
