/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("****Menu****\n 1-> lunes\n 2-> marte\n 3-> miercoles|n 4-> jueves\n 5-> viernes\n 6-> sabado \n 7-> domingo\n ELIXE UNHA");
        
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch(op){
            case 1: System.out.println("lunes");
            break;
            case 2: System.out.println("martes");
            break;
            case 3: System.out.println("miercoles");
            break;
            case 4: System.out.println("jueves");
            break;
            case 5:System.out.println("viernes");
            break;
            case 6: System.out.println("sabado");
            break;
            case 7: System.out.println("domingo");
            break;
            default:System.out.println("opcion non valida");
        }
        }
    }
    
