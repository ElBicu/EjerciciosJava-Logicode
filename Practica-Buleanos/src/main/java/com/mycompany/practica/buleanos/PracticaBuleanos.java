/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica.buleanos;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class PracticaBuleanos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Es día de pico y placa? ");
        boolean esDiaPicoyPlaca=sc.nextBoolean();
        
        System.out.print("Mi placa coincide con el día de pico y placa? ");
        boolean placaCoincide=sc.nextBoolean();
        
        System.out.print("Mi vehiculo es electrico? ");
        boolean esVehiculoElectrico=sc.nextBoolean();
        
        boolean parte1= esDiaPicoyPlaca && placaCoincide;
        boolean parte2= !(esVehiculoElectrico);
        boolean multa =parte1 && parte2;
        
        System.out.println("Es dia de pico y placa? " + esDiaPicoyPlaca);
        System.out.println("La placa coincide? " + placaCoincide);
        System.out.println("es vehiculo electrico? " + esVehiculoElectrico);
        System.out.println("existe multa segun las condiciones? " + multa);
        
        sc.close();
        
        
        
        



        

       
        
        
        
        
        
        
        
        
        
    }
}
