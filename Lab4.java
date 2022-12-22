 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab4 {

    public static void main(String[] args) {
        int n,r ,ncr,fact=1,numerator,denominator,i=1,sub;
        
       Scanner s=new Scanner(System.in);
        System.out.println("enter value of n:");
        n=s.nextInt();
        System.out.println("enter value of r:");
        r =s.nextInt();
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        numerator=fact;                   //n!
        sub=n-r;
        fact=1;
        i=1;
        while(i<=sub)
        {
            fact=fact*i;
            i++;
        }
        denominator =fact;
        fact=1;
        i=1;
        while(i<=r)
        {
            fact=fact*i;
            i++;
        }
        denominator=(fact*denominator);
        ncr=numerator/denominator;
        System.out.println("\nncr ="+ncr)
                ;
        
        }
    }

