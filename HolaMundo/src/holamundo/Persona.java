package holamundo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felipezarate
 */
public class Persona {
    //Atributos DECLARACION DE LA CLASE
    private String nombre;
    private int edad;
    
    //Metodos (Metodo constructor)
    public Persona() {
    }
    //Metodo contructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos de uso general

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(String platillo){
        System.out.println(this.nombre + "esta comiendo " + platillo);
    }
    
}
