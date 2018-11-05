package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Operacion {
    
   private Scanner ler = new Scanner(System.in);
     int suma;
    public void sumaResta(){
        short num1,num2;
        System.out.println("tecle nuemero");
       num1=ler.nextShort();
       num2=ler.nextShort();
       if (num1>=num2){
           System.out.println("resultado = "+(num1-num2));
       }
      
      
       suma=num1+num2;
       }
       
        
    }
    
    
