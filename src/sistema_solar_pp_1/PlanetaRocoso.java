/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_solar_pp_1;

/**
 *
 * @author minio
 */
public class PlanetaRocoso extends CuerpoCeleste{

    public PlanetaRocoso(String nombre, double tamaño, double distanciaAlSol, int numeroLunas) {
        super(nombre, tamaño, distanciaAlSol, numeroLunas);
    }
    
    @Override
    public double calcularAnio() {
        // Aproximación basada en la tercera ley de Kepler: T^2 = R^3 (R en AU, T en años terrestres)
        return Math.sqrt(Math.pow(distanciaAlSol, 3));
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Duración del año: " + String.format("%.2f", calcularAnio()) + " años terrestres";
    }
    
}
