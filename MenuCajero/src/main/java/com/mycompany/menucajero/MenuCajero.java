/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menucajero;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class MenuCajero {

    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("1. Retiro | 2. Consignar | 3. Saldo");
    System.out.println("Ingresa una opción valida");
    int opcion=sc.nextInt();
    
    
    int saldo=1000000000;
    
    switch(opcion){
        
        case 1:
            
            System.out.print("Cuando retiras bro?: $");
            int retirar=sc.nextInt();
            
            int totalRetiro= saldo - retirar;
            
            if((retirar<=saldo) && (retirar>0) && (retirar %10000 == 0)){
                
                System.out.println("Saldo total: $" + totalRetiro);
            }else{
                System.out.print("error de retiro");
                
            }
            break;
            
        case 2:
            
            System.out.println("Ingresa la cuenta a la que deseas consignar");
            int cuenta=sc.nextInt();
            
            System.out.println("valor a consignar");
            int ingreso=sc.nextInt();
            
            
            
            int totalConsig= ingreso + saldo;
            
            if(())
            
            break;
            
        case 3:
            
            break;
        default:
            
            break;
        
        
    }
    
    sc.close();
    }
}
