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
        // Fórmula basada en la tercera ley de Kepler: T = sqrt(R^3 / k), donde k ≈ 1
        double k = 1.0; // Constante de proporcionalidad para simplificar la ecuación en nuestro sistema
        return Math.sqrt(Math.pow(distanciaAlSol, 3) / k);
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Duración del año: " + calcularAnio() + " años terrestres";
    }
    
}
