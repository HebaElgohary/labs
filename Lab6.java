/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6;

/**
 *
 * @author hp
 */



public class Lab6 {
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Circle c=new Circle();
        c.setR(2);
        c.area();
        c.circuference();
       Triangle a=new Triangle();
       a.setB(2);
       a.setH(1);
       a.area();
       a.circuference();

    }}
     
   class Circle {
    private int r;

    public void setR(int r) {
        this.r = r;
    }
    
public void area()
{
System.out.print("area is :"+(3.14*r*r));    

}
    public void circuference()
    {
        System.out.print("circuference is :"+(3.14*2*r));    

    }
  }
class Triangle {
    private int b;
    private int h;

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    
    
public void area()
{
System.out.print("area is :"+(.5*b*h));    

}
    public void circuference()
    {
        System.out.print("circuference is :"+(3*b));    

    }
  }
