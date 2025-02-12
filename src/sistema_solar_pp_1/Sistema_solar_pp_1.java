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
        
        SistemaSolar sistemaSolar = new SistemaSolar();
        System.out.println(sistemaSolar.getJupiter().getNombre() + "es un planeta rocoso");
        System.out.println(sistemaSolar.compararTamaño(sistemaSolar.getVenus(), sistemaSolar.getJupiter()));
        
        
    }
    
}
