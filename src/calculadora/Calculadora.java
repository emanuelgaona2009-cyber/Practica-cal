/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Compu8
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int resultado;
        suma objetoSuma = new suma();
        resta objetoResta = new resta();
        
        System.out.println("Ingresa la letra correspondiente para cada operación: ");
        System.out.println("    s -> Suma");
        System.out.println("    r -> Resta");
        System.out.println("    c -> Cerrar");
        
        
        
        while (true){
        String letra = entrada.next();
        String operacion = letra.toLowerCase();
        char ul = operacion.charAt(0);
        if (ul == 'c'){
        break;
        }
        switch (ul) {
            case 's':
                objetoSuma.sumar();
                break;
            case 'r':
                objetoResta.restar();
                break;
            default:
                System.out.println("Ingresa una letra correcta");
            
        }
        
        }
    }
    
}
