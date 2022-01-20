package definitivolau;
import java.util.Scanner;
/**
 * Este programa pide que se introduzca un número de municipios y sus
 * temperaturas, el programa mostrará la temperatura mayor y la menor.
 *
 * @author laura
 */
public class DefinitivoLau {
    /**
     * Método main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Da la bienvenida al programa
        System.out.println("Bienvenidos a mi programa");
        float temperatura[];
        float tempMayor;
        float tempMenor;
        int municipios;
        Scanner read = new Scanner(System.in);
        System.out.print("¿Cuantos municipios deseas introducir? ");
        municipios = read.nextInt();
        if (municipios > 0) {
            temperatura = new float[municipios];
            tempMayor = temperatura[0];
            tempMenor = temperatura[0];
            for (int i = 0; i < municipios; i++) {
                System.out.print("Introduce la temperatura ambiente: ");
                temperatura[i] = read.nextFloat();
                if (temperatura[i] > tempMayor) {
                    tempMayor = temperatura[i];
                } else if (temperatura[i] < tempMenor) {
                    tempMenor = temperatura[i];
                }
            }
            for (int i = 0; i < municipios; i++) {
                System.out.print(temperatura[i] + " ");
            }
            System.out.println();
            System.out.println("La temperatura mayor es " + tempMayor);
            System.out.println("La temperatura menor es " + tempMenor);
        } else {
            System.out.println("No se ha introducido un valor válido");
        }
    }

}
