/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacenadodatos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
import java.util.*;
public class AlmacenadoDatos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad GB: ");
        int cantidadGB=sc.nextInt();
        
        double MBtotal, KBtotal, btotal;
        
        MBtotal=(double)(cantidadGB*1024);
        
        KBtotal=MBtotal*1024;
        btotal=KBtotal*1024;
        
        //int MBtotalf=(int) MBtotal;
        //nt KBtotalf=(int) KBtotal;
        //int btotalf=(int) btotal;
        
        System.out.printf("total de MB: %.1f \n",MBtotal);
        System.out.printf("total de KB: %.1f \n" ,KBtotal);
        System.out.printf("total de Bytes: %.1f \n",btotal);
        
        sc.close(); 
    }
}
