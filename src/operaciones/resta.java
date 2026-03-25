
package operaciones;

import java.util.Scanner;

public class resta {
    
    
    public int restar(int a, int b){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingreas valor a: ");
        a = entrada.nextInt();
        
        System.out.println("Ingreas valor b: ");
        b = entrada.nextInt();
        
        int resta = a-b;
                
        System.out.println("El resultado de la resta es: "+resta);
        
        return resta;
        
    }
    
}
