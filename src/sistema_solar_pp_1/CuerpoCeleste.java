package sistema_solar_pp_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ridie
 */
public abstract class CuerpoCeleste {
    private String nombre;
    double radio;
    double gravedad;
    private double distanciaAlSol; 
    private int numeroLunas;
    private String atmosfera;
    private int anillos;

    public CuerpoCeleste(String nombre, double radio, double gravedad, double distanciaAlSol, int numeroLunas, String atmosfera, int anillos) {
        this.nombre = nombre;
        this.radio = radio;
        this.gravedad = gravedad;
        this.distanciaAlSol = distanciaAlSol;
        this.numeroLunas = numeroLunas;
        this.atmosfera = atmosfera;
        this.anillos = anillos;
    }
    
    public abstract double girar();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @return the gravedad
     */
    public double getGravedad() {
        return gravedad;
    }

    /**
     * @return the distanciaAlSol
     */
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    /**
     * @return the numeroLunas
     */
    public int getNumeroLunas() {
        return numeroLunas;
    }

    /**
     * @return the atmosfera
     */
    public String getAtmosfera() {
        return atmosfera;
    }

    /**
     * @return the anillos
     */
    public int getAnillos() {
        return anillos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\nradio=" + radio + "\ngravedad=" + gravedad + "\ndistanciaAlSol=" + distanciaAlSol + "\nnumeroLunas=" + numeroLunas + "\natmosfera=" + atmosfera + "\nanillos=" + anillos ;
    }
}