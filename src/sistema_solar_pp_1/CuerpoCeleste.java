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
    protected String nombre;
    protected double tamaño;
    protected double distanciaAlSol; 
    protected int numeroLunas;

    public CuerpoCeleste(String nombre, double tamaño, double distanciaAlSol, int numeroLunas) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.distanciaAlSol = distanciaAlSol;
        this.numeroLunas = numeroLunas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public int getNumeroLunas() {
        return numeroLunas;
    }
    
    public abstract double calcularAnio();

    @Override
    public String toString() {
        return nombre + " | Tamaño: " + tamaño + " km | Distancia al Sol: " + distanciaAlSol + " millones km | Lunas: " + numeroLunas;
    }
}
