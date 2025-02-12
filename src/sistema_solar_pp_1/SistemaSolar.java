/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_solar_pp_1;

/**
 *
 * @author danhz
 */
public class SistemaSolar {
    
    private String nombre;
    PlanetaRocoso[] arrayRocosos;
    PlanetaGaseoso[] arrayGaseosos;

    public SistemaSolar() {
        this.nombre = "Sistema Solar";
        this.arrayRocosos = new PlanetaRocoso[4];
        this.arrayGaseosos = new PlanetaGaseoso[4];
        this.arrayRocosos[0] = new PlanetaRocoso("Venus", 6051.8, 8.87, 0.72, 0, "CO₂, nitrógeno", 0);
        this.arrayRocosos[1] = new PlanetaRocoso("Tierra", 6371, 9.81, 1, 1, "Nitrógeno, oxígeno", 0);
        this.arrayRocosos[2] = new PlanetaRocoso("Marte", 3389.5, 3.71, 1.52, 2, "CO₂, nitrógeno, argón", 0);
        this.arrayRocosos[3] = new PlanetaRocoso("Mercurio", 2439.7, 0.39, 0.39, 0, "Oxígeno, sodio, hidrógeno", 0);
        
        this.arrayGaseosos[0] = new PlanetaGaseoso("Jupiter", 69911, 24.79, 5.20, 95, "Hidrógeno, helio", 1);
        this.arrayGaseosos[0] = new PlanetaGaseoso("Saturno", 58232, 10.44, 9.58, 146, "Hidrógeno, helio", 1);
        this.arrayGaseosos[0] = new PlanetaGaseoso("Urano", 25362, 8.69, 19.22, 27, "Hidrógeno, helio, metano", 1);
        this.arrayGaseosos[0] = new PlanetaGaseoso("Neptuno", 24622, 11.15, 30.05, 14, "Hidrógeno, helio, metano", 1);
    }
    
    public String compararTamaño( CuerpoCeleste planeta1, CuerpoCeleste planeta2){
        if (planeta1.getRadio() > planeta2.getRadio()) {
            return planeta1.getNombre() + " es más grande que " + planeta2.getNombre();
        } else if (planeta1.getRadio() < planeta2.getRadio()) {
            return planeta2.getNombre() + " es más grande que " + planeta1.getNombre();
        } else {
            return "Ambos planetas tienen el mismo tamaño";
        }
    }
    
    public PlanetaRocoso getVenus(){
        return this.arrayRocosos[0];
    }
    
    public PlanetaRocoso getTierra(){
        return this.arrayRocosos[1];
    }
    
    public PlanetaRocoso getMarte(){
        return this.arrayRocosos[2];
    }
    
    public PlanetaRocoso getMercurio(){
        return this.arrayRocosos[3];
    }
    
    public PlanetaGaseoso getJupiter(){
        return this.arrayGaseosos[0];
    }
    
    public PlanetaGaseoso getSaturno(){
        return this.arrayGaseosos[1];
    }
    
    public PlanetaGaseoso getUrano(){
        return this.arrayGaseosos[2];
    }
    
    public PlanetaGaseoso getNeptuno(){
        return this.arrayGaseosos[3];
    }
    
    
}
