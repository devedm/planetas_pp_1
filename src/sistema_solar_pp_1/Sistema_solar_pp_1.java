/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_solar_pp_1;

/**
 *
 * @author minio
 */
public class Sistema_solar_pp_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PlanetaRocoso marte = new PlanetaRocoso("Marte", 120, 227.9, 2); // Instancia de planeta Marte
        System.out.println("Un año en marte equivale a " + String.format("%.2f", marte.calcularAnio()) + " dias terrestres.");
    }
    
}
