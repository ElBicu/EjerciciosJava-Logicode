/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentaservicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class CuentaServicios {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de agua del mes pasado: ");
        int agualast=sc.nextInt();
        
        System.out.print("Ingresa la cantidad de luz del mes pasado: ");
        int luzlast=sc.nextInt();
        
        System.out.print("Ingresa la cantidad de agua del mes actual: ");
        int aguanow=sc.nextInt();
        
        System.out.print("Ingresa la cantidad de luz del mes actual: ");
        int luznow=sc.nextInt();
        
        int agualastT=agualast*1500;
        int aguanowT=aguanow*1500;
        
        int luzlastT=luzlast*130;
        int luznowT=luznow*130;
        
        int aguaT=aguanowT-agualastT;
        int luzT=luznowT-luzlastT;
        
        int serviciosT=aguaT+luzT;
        
        System.out.println("Total de servicios a pagar:$ "+serviciosT);
        
        
        
        
        sc.close();
    }
}
