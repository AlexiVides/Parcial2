/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.pkg1;

/**
 *
 * @author alexi
 */
public class Marinos extends  Binocular {
    
    private int resistenciaIPX;
    private String textura;

    public Marinos(String tipoPrisma, String nombre, double precio, int resistenciaIPX, String textura) {
        super(tipoPrisma, nombre, precio);
        this.resistenciaIPX = resistenciaIPX;
        this.textura = textura;
    }

    public int getResistenciaIPX() {
        return resistenciaIPX;
    }

    public String getTextura() {
        return textura;
    }
}
