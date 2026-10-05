/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2e3.jv;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class T2e3Jv {

    public static void main(String[] args) {
       
        String producto_1,producto_2,producto_3;
        double precio_1, precio_2, precio_3;
        double subtotal, precio_IVA,precio_total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("dime el primer producto");
        producto_1=sc.nextLine();
        System.out.println("dime su precio");
        precio_1=sc.nextDouble();
        sc.nextLine();
          
        System.out.println("dime el segundo producto");
        producto_2=sc.nextLine();
         System.out.println("dime su precio");
          precio_2=sc.nextDouble();
          sc.nextLine();
        
          System.out.println("dime el tercer producto");
        producto_3=sc.nextLine();
         System.out.println("dime su precio");
          precio_3=sc.nextDouble();
          sc.nextLine();
          
          subtotal= precio_1+precio_2+precio_3;
          precio_IVA= subtotal* 0.21;
          precio_total=subtotal+precio_IVA;
          
          
        System.out.println("TOTAL");
        System.out.println(producto_1+":"+String.format("%.2f", precio_1)+"$");
        System.out.println(producto_2+":"+String.format("%.2f", precio_2)+"$");
        System.out.println(producto_3+":"+String.format("%.2f", precio_3)+"$");
        System.out.println("-");
        System.out.println("subtotal:"+subtotal+"$");
        System.out.println("precio_IVA:"+precio_IVA+"$");
        System.out.println("precio_total:"+precio_total+"$");
    }
}
