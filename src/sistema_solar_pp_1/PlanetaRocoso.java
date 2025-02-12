/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_solar_pp_1;

/**
 *
 * @author minio
 */
public class PlanetaRocoso extends CuerpoCeleste implements Planeta{

    public PlanetaRocoso(String nombre, double radio, double gravedad, double distanciaAlSol, int numeroLunas, String atmosfera, int anillos) {
        super(nombre, radio, gravedad, distanciaAlSol, numeroLunas, atmosfera, anillos);
    }

    @Override
    public double calcularAnio() {
        // Fórmula basada en la tercera ley de Kepler: T = sqrt(R^3 / k), donde k ≈ 1
        double k = 1.0; // Constante de proporcionalidad para simplificar la ecuación en nuestro sistema
        return Math.sqrt(Math.pow(getDistanciaAlSol(), 3) / k);
    }

    @Override
    public double girar() {
        return Math.sqrt(getRadio() * getGravedad());
    }

    @Override
    public String planetaASCII() {
        return """
                ~+
                                
                     *       +
               '                  |
           ()    .-.,="``"=.    - o -
                 '=/_       \\     |
              *   |  '=._    |
                   \\     `=./`,        '
                .   '=.__.=' `='      *
       +                         +
            O      *        '       .
        """;
    }   
}
