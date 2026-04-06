/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles1;

/**
 *
 * @author Usuario
 */
public class Bucles1 {

    public static void main(String[] args) {
    
        int cantidad_multiplos=0;
        for (int i=1;1<=20;i++){
            if(i%3==0){
                cantidad_multiplos=cantidad_multiplos+1;
                
                System.out.print(i);
                
            }
            
        }
        
        System.out.println("Cantidad de multiplos en el rango"+ cantidad_multiplos);
       
    }

}

