/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab3 {
//program to enter an array and print the transpose of it
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);

        System.out.println("enter the array");
        int [][]a=new int [2][4];
for (int i=0 ;i<a.length;i++)
 for (int j=0 ;j<a[0].length;j++)
     a[i][j]=input.nextInt();
        System.out.println(Arrays.deepToString(a));
        for (int i=0 ;i<a.length;i++)
 for (int j=0 ;j<a[0].length;j++)
   a[i][j]=a[j][i];  
                        System.out.println(Arrays.deepToString(a));

    }
}
