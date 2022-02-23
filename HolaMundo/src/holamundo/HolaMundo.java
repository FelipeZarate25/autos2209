/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author felipezarate
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NOTA: Ejemplo de la clase.
        System.out.println("Hola Mundo Java !!!!");

        //per1 es un ejemplar(instancia) #INDENTIDAD nombre/variable
        //NOTA: Ejemplo de la clase COMIDA.
        Persona per1 = new Persona();
        per1.setNombre("Felipe JPZ ");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("hamburguesa hawiana!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe ");
        System.out.println("Nombre per2: " + per2.getNombre());
        per2.comer("pizza hawaiana! ");

        //NOTA: Ejemplo y Tarea AUTOMOVIL.
        
        //Para el Auto Bocho
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println("Marca: " + miBocho.getMarca());
        System.out.println("Submarca: " + miBocho.getSubMarca());
        System.out.println("Modelo: " + miBocho.getModelo());
        System.out.println("Color: " + miBocho.getColor());
        
        //Para el Auto Akura
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        miAkura.setSubMarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.GRAY);
        System.out.println("Marca: " + miAkura.getMarca());
        System.out.println("Submarca: " + miAkura.getSubMarca());
        System.out.println("Modelo: " + miAkura.getModelo());
        System.out.println("Color: " + miAkura.getColor());
        
        
        //Para el Auto Mustang
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.YELLOW);
        System.out.println("Marca: " + miMustang.getMarca());
        System.out.println("Submarca: " + miMustang.getSubMarca());
        System.out.println("Modelo: " + miMustang.getModelo());
        System.out.println("Color: " + miMustang.getColor());
        
        
    }

}
