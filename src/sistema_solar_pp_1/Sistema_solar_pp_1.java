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
        // Marte
        System.out.print("\n=============================\n");
        PlanetaRocoso marte = new PlanetaRocoso("Marte", 3389.5, 3.73, 1.5, 0, "dióxido de carbono", 0);
        System.out.print(marte.toString());
        System.out.print(marte.calcularAnio());
        System.out.print(marte.girar());
        
        // Saturno
        System.out.print("\n=============================\n");
        PlanetaGaseoso saturno = new PlanetaGaseoso("Saturno", 58323, 10.44, 9.58, 82, "hidrogeno y helio", 10);
        System.out.print(saturno.toString());
        System.out.print(saturno.calcularAnio());
        System.out.print(saturno.girar());
        
    }
    
}
