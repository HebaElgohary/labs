
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab2 {
//program to find the largest element in an array using for loop
    public static void main(String[] args) {
        System.out.println("enter array");
        Scanner input=new Scanner(System.in);
int [][]a=new int [2][4];
for (int i=0 ;i<a.length;i++)
 for (int j=0 ;j<a[0].length;j++)
     a[i][j]=input.nextInt();
int mx=a[0][0];
for (int i=0 ;i<a.length;i++)
 for (int j=0 ;j<a[0].length;j++)
 {     
 if (mx <a[i][j])
     mx =a[i][j];
 }
        System.out.println("the max is "+mx);
 }
}


    

