/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.pkg1;

/**
 *
 * @author alexi
 */
public class Aves extends Binocular{
    
    private String enfoque;
    private String tipoRecubrimiento;

    public Aves(String tipoPrisma, String nombre, double precio, String enfoque, String tipoRecubrimiento) {
        super(tipoPrisma, nombre, precio);
        this.enfoque = enfoque;
        this.tipoRecubrimiento = tipoRecubrimiento;
    }

    public String getEnfoque() {
        return enfoque;
    }

    public String getTipoRecubrimiento() {
        return tipoRecubrimiento;
    }
}
