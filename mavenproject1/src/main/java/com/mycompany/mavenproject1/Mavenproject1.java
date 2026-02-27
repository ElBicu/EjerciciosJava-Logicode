/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese el monto de venta 1: $");
        int valor1=sc.nextInt();
        
        System.out.print("Ingrese el monto de venta 2: $");
        int valor2=sc.nextInt();
        
        System.out.print("Ingrese el monto de venta 3: $");
        int valor3=sc.nextInt();
        
        int totalv, bono,salario;
        
        totalv=valor1+valor2+valor3;
        
        bono=(int) (totalv*0.12);
        
        salario=bono+450000;
        
        double salariot=(double)salario; 
        
        System.out.println("El salario final es: "+ salariot);
        
        
        
        sc.close();
    }
}
