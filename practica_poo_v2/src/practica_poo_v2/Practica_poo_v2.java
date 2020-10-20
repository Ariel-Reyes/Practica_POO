package practica_poo_v2;


import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 * @author Ana
 * @since 2020
 * 
 */
public class Practica_poo_v2 {

    static Scanner leer = new Scanner(System.in);

    static String name, raza, altura;
    static ArrayList <String> nombres = new ArrayList<>();
    static ArrayList <String> razas = new ArrayList<>();
    static ArrayList <String> alturas = new ArrayList<>();
    

    static ArrayList arr = new ArrayList();
    static ArrayList arr_dos = new ArrayList();


    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("------MENU------");
            System.out.println("1. Clanchas");
            System.out.println("2. Perritos");
            System.out.println("----------------");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    char resp = 's';
                    while (resp == 's' || resp == 'S') {
                        System.out.println("1) solo el color y tama;o ");
                        System.out.println("2) Agregar todos los detalles");
                        System.out.println("3) Elminar una chancla que tiene todos los detalles");
                        System.out.println("4) Eliminar chancla sin muchos detalles");
                        System.out.println("5) Modificar marca");
                        System.out.println("Ingrese que opcion desea usar: ");
                        int elija = leer.nextInt();
                        switch (elija) {
                            case 1:
                                System.out.println("Ingrese la marca: ");
                                String marca = leer.next();
                                System.out.println("Color generado automaticamente: ");
                                Color d = Color.red;
                                chanclas j = marca_color(marca, d);
                                JOptionPane.showMessageDialog(null, j);
                                arr.add(j);

                                break;

                            case 2:
                                System.out.println("Ingrese la marca: ");
                                marca = leer.next();
                                d = Color.BLUE;
                                System.out.println("Ingrese el tama;o de la chancleta: ");
                                int size = leer.nextInt();
                                System.out.println("Ingrese el estilo de chancleta: ");
                                String estilo = leer.next();
                                chanclas i = todo(marca, d, size, estilo);
                                JOptionPane.showMessageDialog(null, i);
                                arr_dos.add(i);
                                break;

                            case 3:
                                String acu_m = "";
                                for (int m = 0; m < arr_dos.size(); m++) {
                                    acu_m = m + ")" + " " + acu_m + arr_dos.get(m) + "\n";
                                }

                                int oop = Integer.parseInt(JOptionPane.showInputDialog(null, acu_m + "\n" + "Ingrese una opcion: "));
                                arr_dos.remove(oop);
                                JOptionPane.showMessageDialog(null, "La chancla ha sido eliminada exitosamente :) ");

                                break;

                            case 4:
                                acu_m = "";
                                for (int m = 0; m < arr.size(); m++) {
                                    acu_m = m + ")" + " " + acu_m + arr.get(m) + "\n";
                                }

                                oop = Integer.parseInt(JOptionPane.showInputDialog(null, acu_m + "\n" + "Ingrese una opcion: "));
                                arr.remove(oop);
                                JOptionPane.showMessageDialog(null, "La chancla ha sido eliminada exitosamente :) ");

                                break;
                            case 5:
                                int cual = Integer.parseInt(JOptionPane.showInputDialog("Desea modificar: " + "\n" + "1) todos los detalles " + "\n" + "2) no todos los detalles" + "\n" + "Seleccione cual"));

                                switch (cual) {
                                    case 1:
                                        int ele = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cual indice desea modificar: "));
                                        if (arr_dos.get(ele) instanceof chanclas) {

                                            marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                                            ((chanclas) arr_dos.get(ele)).setMarca(marca);
                                        }
                                        break;
                                    case 2:
                                        ele = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cual indice desea modificar: "));
                                        if (arr.get(ele) instanceof chanclas) {
                                            marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                                            ((chanclas) arr.get(ele)).setMarca(marca);
                                        }

                                        break;
                                }

                                break;
                        }

                        resp = JOptionPane.showInputDialog("Desea continuar s=si / n=no: ").charAt(0);
                    }                   
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
    

    public static chanclas marca_color(String marca, Color color) {

        chanclas H = new chanclas(marca, color);
        return H;
    }

    public static chanclas todo(String marca, Color color, int size, String estilo) {
        chanclas H = new chanclas(marca, color, size, estilo);
        return H;
    }


}
