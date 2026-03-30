/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.climainteligente;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class ClimaInteligente {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
    
    System.out.print("Ingrese la temperatura: ");
    double temperatura=sc.nextDouble();
    
    if(temperatura>28.5){
        
        System.out.print("Encida el aire manco");
        
    }else{
        
        System.out.print("Abriendo las persinas pa ventilar");
        
    }
    
    
    sc.close();
    }
}
