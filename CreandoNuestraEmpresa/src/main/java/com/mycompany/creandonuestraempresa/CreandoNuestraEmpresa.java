/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creandonuestraempresa;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class CreandoNuestraEmpresa {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese la la cantidad del amigo 1: $");
        float amigo1=sc.nextInt();
        
       System.out.print("Ingrese la la cantidad del amigo 2: $");
        float amigo2=sc.nextInt();
        
        System.out.print("Ingrese la la cantidad del amigo 3: $");
        float amigo3=sc.nextInt();
        
        float suma=amigo1+amigo2+amigo3; 
        
        float porcentaje1=(amigo1/suma)*100;
        float porcentaje2=(amigo2/suma)*100;
        float porcentaje3=(amigo3/suma)*100;
        
        System.out.printf("Parte 1: %.2f \n", porcentaje1);
        System.out.printf("Parte 2: %.2f \n", porcentaje2);
        System.out.printf("Parte 3: %.2f \n", porcentaje3);
        
        
        
        sc.close();
        
    }
}
