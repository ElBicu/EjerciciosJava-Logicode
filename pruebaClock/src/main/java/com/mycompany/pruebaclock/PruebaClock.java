/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebaclock;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class PruebaClock {

    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Ingrese el canal 1: ");
    int canalA=sc.nextInt();
    
    System.out.print("Ingrese el canal 2: ");
    int canalB=sc.nextInt();
    
    
    int salto=0;
    
    
    

    if(canalA > canalB){
        
        salto = canalA - canalB;
            
    }else{
        
        salto= canalB - canalA;
        
    }
    
     int salto2= 99 - salto;
     
       if(salto < salto2){
           
           System.out.print("saltos totales: "+ salto);
           
       }else{
           
           System.out.print("saltos totales: "+ salto2);
           
       }
    sc.close();
        
    }
}
