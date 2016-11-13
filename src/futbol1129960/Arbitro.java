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
public class Arbitro extends Persona
{
    private boolean oficial;
    private double sueldo;
    public Arbitro(boolean oficial, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.oficial = oficial;
        if(oficial==true){
            sueldo=500.000;}
        else{
            sueldo=300.000;
        }
    }
    
  
    
    
    
}
