/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol1129960;

/**
 *
 * @author SergioIván
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private String id;

    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido+" "+id; //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
