/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantesenunsalon;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class EstudiantesEnUnSalon {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingre el toal de hombres: ");
        double hombres=sc.nextDouble();
        
        System.out.print("Ingre el toal de mujeres: ");
        double mujeres=sc.nextDouble();
        
        double salonT=hombres+mujeres;
        
        double porcH=(hombres/salonT)*100;
        double porcM=(mujeres/salonT)*100;
        
        System.out.printf("Porcentaje total de hombres %.1f \n", porcH);
        System.out.printf("Porcentaje total de mujeres %.1f \n", porcM);
        
        
                
    }
}
