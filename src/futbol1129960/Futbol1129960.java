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
public class Futbol1129960 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llenando el encuentro
        //Creando equipo 1
        Tecnico t1 = new Tecnico(3000000, "Sergio", "Galvis", "54321");
        Equipo e1 = new Equipo("Millos", t1);
        Jugador j1[] = new Jugador[5];
        for (int i = 0; i < j1.length; i++) {

            j1[i] = new Jugador((byte) (i + 2), "Sergio", "Galvis", "89563");
        }

        e1.setEquipo(j1);
        
        //Creando equipo 2
         Tecnico t2 = new Tecnico(3000000, "Ivan", "Motoa", "67493");
        Equipo e2 = new Equipo("ShandaFe", t2);
        //Jugador j2[] = new Jugador[5];
        for (int i = 0; i < j1.length; i++) {

            j1[i] = new Jugador((byte) (i + 3), "Juan", "Motoa", "83454");
        }

        e2.setEquipo(j1);
        
        Arbitro a1=new Arbitro(true, "Ismael", "Suarez", "464738");
        
        Encuentro p1=new Encuentro(e1, e2, a1, (byte)5, (byte)0);
        
        System.out.println(p1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
