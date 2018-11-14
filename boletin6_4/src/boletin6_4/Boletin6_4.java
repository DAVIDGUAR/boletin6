package boletin6_4;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin6_4 
{

  
    public static void main(String[] args) 
    
    {
      
        Persona persona1 = new Persona(75,"daniel");
        Persona persona2 = new Persona(99,"juan");
        
        
        if(persona1.getPeso() > persona2.getPeso())
        
        {
            System.out.println(persona1.getNombre() + " el mas pesado es " + persona2.getNombre());
            System.out.println("La diferencia de kg es de " + (persona1.getPeso() - persona2.getPeso()));
        }
        
        else
        
        
        {
            System.out.println(persona2.getNombre() + " el mas pesado es " + persona1.getNombre());
            System.out.println("La diferencia de kg es de " + (persona2.getPeso() - persona1.getPeso()));
        }
    
    }
}
