package practica_poo_v2;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class Practica_poo_v2 {
    static Scanner leer = new Scanner(System.in);
    static String name, raza, altura;
    static ArrayList <String> nombres = new ArrayList<>();
    static ArrayList <String> razas = new ArrayList<>();
    static ArrayList <String> alturas = new ArrayList<>();
    
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
                    System.out.println("---------- PERROS -----------");
                    //ADD
                    System.out.println("1. Nombre y raza");
                    System.out.println("2. Nombre y altura");
                    System.out.println("3. Nombre, raza, altura");
                    //LISTAR
                    System.out.println("4. Listar nombres");
                    System.out.println("5. Listas razas");
                    System.out.println("6. Listar alturas");
                    //MODIFICAR
                    System.out.println("7. Modificar nombres");
                    System.out.println("8. Modificar razas");
                    System.out.println("9. Modificar alturas");
                    System.out.println("----------------------------");
                    System.out.print("Ingrese una opcion: ");
                    int op = leer.nextInt();
                    switch(op){
                        case 1:    
                            name = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");
                            raza = JOptionPane.showInputDialog("Ingrese la raza del perro: ");
                            nombres.add(name);
                            razas.add(raza);
                        break;
                        case 2:
                            name = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");
                            raza = JOptionPane.showInputDialog("Ingrese la altura del perro: ");
                            nombres.add(name);
                            if(numeros(altura) == false){
                                JOptionPane.showMessageDialog(null, "Ingrese una altura entera positiva");
                                altura = JOptionPane.showInputDialog("Ingrese la altura del perro: ");
                            }else{
                                alturas.add(altura);
                            }
                        break;
                        case 3:
                            name = JOptionPane.showInputDialog("Ingrese el nombre del perro: ");
                            raza = JOptionPane.showInputDialog("Ingrese la raza del perro: ");
                            altura = JOptionPane.showInputDialog("Ingrese la altura del perro: ");
                            nombres.add(name);
                            razas.add(raza);
                            nombres.add(name);
                            if(numeros(altura) == false){
                                JOptionPane.showMessageDialog(null, "Ingrese una altura entera positiva");
                                altura = JOptionPane.showInputDialog("Ingrese la altura del perro: ");
                            }else{
                                alturas.add(altura);
                            }
                        break;
                        case 4:
                            String msm ="";
                            for (int i = 0; i < nombres.size(); i++) {
                                msm =  i+")"+" "+ nombres.get(i) + "\n" ;    
                            }
                            JOptionPane.showMessageDialog(null,"NOMBRES: "+ msm);       
                        break; 
                        case 5:
                            String msm1 ="";
                            for (int i = 0; i < razas.size(); i++) {
                                msm1 =  i+")"+" "+ razas.get(i) + "\n" ;           
                            }
                            JOptionPane.showMessageDialog(null,"RAZAS:: "+ msm1); 
                        break;
                        case 6:
                            String msm2 ="";
                            for (int i = 0; i < alturas.size(); i++) {
                                msm2 =  i+")"+" "+ alturas.get(i) + "\n" ;              
                            }
                            JOptionPane.showMessageDialog(null,"ALTURAS:: "+ msm2); 
                        break;
                        default:   JOptionPane.showMessageDialog(null, "Intente nuevamente elegir una opcion del menu");
                    }                  
                break;
                default: seguir = false;
                    System.out.println("Saliendo...");
            }
        }
    }
    
    static boolean numeros (String altura){
        boolean flag = true;
        for (int i = 0; i < altura.length(); i++) {
            char caracter = altura.charAt(0);
            int ascii = (int) caracter;
            if (ascii < 48 || ascii > 57){
                flag = false;
            }else{
                flag= true;
            }
        }
        return flag;
    }
    
    static perritos NombreRaza (String name, String raza, int altura){
        perritos r = new perritos(name, raza);
        return r;
    }
    
}
