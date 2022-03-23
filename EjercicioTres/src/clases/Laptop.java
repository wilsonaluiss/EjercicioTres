package clases;

public class Laptop extends Computer{

    String diseño;

    public Laptop(String diseño, String marca, double precio, String OS) {
        super(marca, precio, OS);
        this.diseño = diseño;
    }
    
    void producto(){
        System.out.println("El producto elegido es una laptpop");
    }
    
    
}
