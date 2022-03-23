package clases;

public class Computer {
    
    String marca;
    double precio;
    String OS;

    public Computer(String marca, double precio, String OS) {
        this.marca = marca;
        this.precio = precio;
        this.OS = OS;
    }
    
    void datos(){
        System.out.println("Datos electronicos");
        System.out.println("Mostrando... Marca :"+ marca +" precio : "+precio+" Sistema Operativo : "+OS );
    }
    
    void dispositivo(){
        System.out.println("Ha elegido un Buen producto :");
    }

}
