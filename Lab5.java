/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab5;

/**
 *
 * @author hp
 */
public class Lab5 {
    public static void quick_sort(int array[],int left,int right)
    {
        if(left<right)
        {
            int q=position(array,left,right);
            quick_sort (array,left,q-1);
            quick_sort(array,q+1,right);
            
        }
    }
private static int position (int array [],int left ,int right)
{
    int i =left-1;
    for(int j=left ;j<right ;j++)
    {
       i++;
       swap(array,i,j);
    }  
    

swap (array,i+1,right );
return i+1;
}

private static void swap(int [] array,int i ,int j)
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
}
 public static void main(String[] args) {
       int []array={10,100,5,30,1};
    quick_sort(array,0, array.length-1);
for (int i=0;i<array.length ;i++)
  System.out.println(array[i]);
 

    }
}
