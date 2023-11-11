/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.pkg1;

/**
 *
 * @author alexi
 */
public class Binocular {
    
    private String tipoPrisma;
    private String nombre;
    private double precio;


    public Binocular(String tipoPrisma, String nombre, double precio) {
        this.tipoPrisma = tipoPrisma;
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getTipoPrisma() {
        return tipoPrisma;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
