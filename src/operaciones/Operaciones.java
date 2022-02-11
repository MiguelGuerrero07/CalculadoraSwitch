/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operaciones= 4;
                
        int num1, num2, resultado;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oprima un boton para realizar una operacion : "
                + "1.- Suma , 2.- Resta, 3.- Multiplación , 4.- Divison");
        
        operaciones = scanner.nextInt();
        switch(operaciones){
            
            
            case 1:
                
                System.out.println("Ingrese el primer valor");
                num1= scanner.nextInt();
                System.out.println("Ingrese el segundo valor");
                num2= scanner.nextInt();
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
                        
                
                case 2:
                    
                System.out.println("Ingrese el primer valor");
                num1= scanner.nextInt();
                System.out.println("Ingrese el segundo valor");
                num2= scanner.nextInt();
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            

            
            case 3:
                
                System.out.println("Ingrese el primer valor");
                num1= scanner.nextInt();
                System.out.println("Ingrese el segundo valor");
                num2= scanner.nextInt();
                resultado = num1 * num2;
                System.out.println("La multiplicacion es: " + resultado);
                break;
                    
                            
                
            case 4:
                
                System.out.println("Ingrese el primer valor");
                num1= scanner.nextInt();
                System.out.println("Ingrese el segundo valor");
                num2= scanner.nextInt();
                resultado = num1 / num2;
                System.out.println("La divison es: " + resultado);
                break;
        
        }
        
    }
    
}
