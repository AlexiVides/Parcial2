/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2.pkg1;

/**
 *
 * @author alexi
 */
public class Parcial21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //binocular de la categoría "Marinos"
        Marinos binocularMarinos = new Marinos("BK-7", "Binocular Marinos 1", 150.0, 5, "Corrugado");

        //binocular de la categoría "Aves"
        Aves binocularAves = new Aves("BAK-4", "Binocular Aves 1", 200.0, "Circular", "Cromado");

        //binocular de la categoría "General"
        General binocularGeneral = new General("BK-7", "Binocular General 1", 100.0, "Plástico", 50);

        System.out.println("Binocular Marinos:");
        imprimirInfoBinocular(binocularMarinos);

        System.out.println("\nBinocular Aves:");
        imprimirInfoBinocular(binocularAves);

        System.out.println("\nBinocular General:");
        imprimirInfoBinocular(binocularGeneral);
    }

    // Método para imprimir información del binocular
    public static void imprimirInfoBinocular(Binocular binocular) {
        System.out.println("Nombre: " + binocular.getNombre());
        System.out.println("Tipo de Prisma: " + binocular.getTipoPrisma());
        System.out.println("Precio: $" + binocular.getPrecio());

        if (binocular instanceof Marinos) {
            Marinos marinos = (Marinos) binocular;
            System.out.println("Resistencia IPX: " + marinos.getResistenciaIPX());
            System.out.println("Textura: " + marinos.getTextura());
        } else if (binocular instanceof Aves) {
            Aves aves = (Aves) binocular;
            System.out.println("Enfoque: " + aves.getEnfoque());
            System.out.println("Tipo de Recubrimiento: " + aves.getTipoRecubrimiento());
        } else if (binocular instanceof General) {
            General general = (General) binocular;
            System.out.println("Tipo de Lente: " + general.getTipoLente());
            System.out.println("Alcance: " + general.getAlcance() + " metros");
        }

        System.out.println();
    }
    
}
