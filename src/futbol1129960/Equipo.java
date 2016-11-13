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

/*
Por vagos, yo hago futbol 5 y ustedes futbol 11
*/
public class Equipo 
{
    private String nombreequipo;
    private Jugador equipo []=new Jugador[5];
    private Tecnico tecnico;

    public Equipo(String nombreequipo, Tecnico tecnico) {
        this.nombreequipo = nombreequipo;
        this.tecnico = tecnico;
    }

    public void setEquipo(Jugador[] equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return (nombreequipo+" "+tecnico);
                
                
                
                }
    
    
    
    
}
