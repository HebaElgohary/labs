/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab {
    // program to enter a number and then print the character which has the same ascii value
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a =input.nextInt();
        System.out.println("please enter num to find its asci");
        if(a>=0 && a<=127)
        {
            char c =(char)a;
            System.out.println("the character is "+c);
            
        }
    }
}
