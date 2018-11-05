package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Numero {
    
    Scanner ler = new Scanner(System.in);
    
    public void numeroPositivo(){
        
        System.out.println("tecle numero : ");
        int numeroPositivo = ler.nextInt();
        if (numeroPositivo<0){
            System.out.println("error negativo");
            
        }
        else{
            System.out.println("positivo");
        }
    }
    
    
}
