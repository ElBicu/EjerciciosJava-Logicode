/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unempleadoysusalario;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class UnEmpleadoYSuSalario {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Ingresa el salario minimo vijente: $");
     double salarioMin=sc.nextDouble();
     
     double salarioBru=salarioMin*3.5;
     double prestamo=salarioBru*0.10;
     double retencion=salarioBru*0.03;
     double salarioNet=salarioBru - (prestamo + retencion); 
     
     int salarioBruT=(int)salarioBru;
     int prestamoT=(int)prestamo;
     int retencionT=(int)retencion;
     int salarioNetT=(int)salarioNet;
           
     System.out.printf("Su salario bruto es: $ %.0f \n", salarioBru);
     System.out.printf("El total del prestamo es: $ %.0f \n", prestamo);
     System.out.printf("la retencion total es: $ %.0f \n", retencion);
     System.out.printf("el salario neto es: $ %.0f \n", salarioNet);
     
     
     
     
     
     sc.close();
        
        
    }
}
