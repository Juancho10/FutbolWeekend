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
public class Encuentro 
{
   private Equipo equipo1;
   private Equipo equipo2;
   private Arbitro arbitro;
   private byte goles1;  //Goles equipo 1
   private byte goles2;     //Goles equipo 2

    public Encuentro(Equipo equipo1, Equipo equipo2, Arbitro arbitro, byte goles1, byte goles2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.arbitro = arbitro;
        this.goles1 = goles1;
        this.goles2 = goles2;
    }

    @Override
    public String toString() {
        return equipo1+" "+equipo2;
                }
   
    
   
   
}
