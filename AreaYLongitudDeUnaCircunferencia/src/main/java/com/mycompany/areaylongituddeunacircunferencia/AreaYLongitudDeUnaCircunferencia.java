/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaylongituddeunacircunferencia;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class AreaYLongitudDeUnaCircunferencia {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        double area=sc.nextDouble();
        
        double Pi=3.1416;
        double areaT=Pi*Math.pow(area,2);
        
        double longitudT= 2*area*Pi;
        
        System.out.printf("Area total es: %.2f \n", areaT);
        System.out.printf("longitud total es: %.2f \n", longitudT);
        
        
        
        
        
    }
}
