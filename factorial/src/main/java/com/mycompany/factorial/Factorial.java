/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial;
        
        System.out.print("Ingres el numero: ");
        factorial =sc.nextInt();
        
        factorial=1;
        for(int i=1;i<=5;i=i+1){
            
            factorial=factorial*i;
        
        }
        
        System.out.print("Numero resultante es: "+ factorial);
        
        sc.close();
    }
}
