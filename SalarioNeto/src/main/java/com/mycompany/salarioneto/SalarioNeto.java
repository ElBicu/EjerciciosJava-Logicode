/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarioneto;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class SalarioNeto {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese el total de horas trabajadas: ");
            double horasTrabajadas=sc.nextInt();
            
            double salarioBruto=horasTrabajadas*1200;
            
            double retencion=salarioBruto*0.05;
            
            double totalSalario=salarioBruto-retencion;
            
            int salarioT=(int)totalSalario;
            
            System.out.print("total del salario con retencion: $"+salarioT);
            
            
            
            
        
        
        sc.close();
    }
}
