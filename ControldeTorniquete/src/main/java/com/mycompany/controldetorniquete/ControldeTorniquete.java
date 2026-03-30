/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controldetorniquete;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class ControldeTorniquete {

    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    
    System.out.print("Ingrese el salado de su cuenta: ");
    double saldo=sc.nextDouble();
    
    if(saldo<3210){
        
        System.out.println("recarga la civica manco");
        
    }
    
    System.out.println("Verificación terminada");
    
    sc.close();
    
    
    
        
        
    }
}
