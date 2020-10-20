package practica_poo_v2;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Practica_poo_v2 {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir){
            System.out.println("------MENU------");
            System.out.println("1. Clanchas");
            System.out.println("2. Perritos");
            System.out.println("----------------");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:

                break;
                case 2:

                break;
                default: seguir = false;
                    System.out.println("Saliendo...");
            }
        }
    }
    
}
