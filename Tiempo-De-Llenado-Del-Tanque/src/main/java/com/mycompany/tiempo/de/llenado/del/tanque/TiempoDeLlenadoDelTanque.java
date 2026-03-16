/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiempo.de.llenado.del.tanque;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class TiempoDeLlenadoDelTanque {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese los litros por minuto: ");
        double litrosPorMinuto=sc.nextDouble();
        
        
        double volumenLitros = 50000.0;
        double horas = volumenLitros / (litrosPorMinuto * 60.0);
        
        System.out.printf("las Horas necesarias son: %.2f\n",horas);
        
        sc.close();
        
    }
}
