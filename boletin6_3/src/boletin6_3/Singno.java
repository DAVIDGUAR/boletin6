package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Singno {
    Scanner ler = new Scanner(System.in);
    
    public void operacion(){
        
   double num1;
    System.out.println("tecle numero");
    num1=ler.nextDouble();
    
    if (num1>0){
        System.out.println("+ = positivo");
    } 
        else if (num1<0){
                System.out.println("- = negativo");
                }
    
        else 
            System.out.println("0 = cero");
    }
       
}
