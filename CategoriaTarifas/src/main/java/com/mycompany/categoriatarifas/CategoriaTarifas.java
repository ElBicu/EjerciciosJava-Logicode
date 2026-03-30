/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.categoriatarifas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class CategoriaTarifas {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    
    System.out.print("Ingresa el total de tu compra: $");
    double compra=sc.nextDouble();
    
    
    if(compra>=200000){
        
        System.out.print("Envio es de $0");
        
    }else if(compra>=100000){
    
        System.out.print("Envio es de $5000");
        
    }else{
        
            System.out.print("Envio es de $1200");
 
    }

  }
}  
  
