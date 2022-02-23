/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo2;

/**
 *
 * @author felipezarate
 */
public class Personaje {
    //Atributos DECLARACION DE LA CLASE
    private String nombre;
    private float edad;

    public Personaje() {
    }

    public Personaje(String nombre, float edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
