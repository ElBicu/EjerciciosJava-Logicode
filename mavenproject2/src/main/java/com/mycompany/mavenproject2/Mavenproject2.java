/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    
    
    boolean esDenoche;
    
    System.out.print("Es de noche? ");
    esDenoche=sc.nextBoolean();
    
    String Temapp= (esDenoche) ? "Modo obscura": "Modo claro";
    
    
    System.out.print(Temapp);
    
    
    sc.close();
        
    }
}
