/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.pkg1;

/**
 *
 * @author alexi
 */
public class General extends Binocular{
    
    private String tipoLente;
    private int alcance;


    public General(String tipoPrisma, String nombre, double precio, String tipoLente, int alcance) {
        super(tipoPrisma, nombre, precio);
        this.tipoLente = tipoLente;
        this.alcance = alcance;
    }

    public String getTipoLente() {
        return tipoLente;
    }

    public int getAlcance() {
        return alcance;
    }
}
