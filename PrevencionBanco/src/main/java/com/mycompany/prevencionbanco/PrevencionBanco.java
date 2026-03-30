/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prevencionbanco;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class PrevencionBanco {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Ingrese el monto a transferir: $");
    double monto=sc.nextDouble();
    
  
    boolean claveDinamica;
    
    if(monto<2000000){
        
       System.out.print("La tranferencia se realizó sin problemas");
        
    }else{
        
        System.out.print("La clave esta ok?");
        claveDinamica=sc.nextBoolean();
        if(claveDinamica){
            
            System.out.print("transferencia ok");
        }else{
            System.out.print("Bloqueado manco");
        }
       
        
        
    }

    }
}

