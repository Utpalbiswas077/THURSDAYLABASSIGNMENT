package Opp.Arry;

import java.util.Scanner;

public class ReverseArry {
	
	public static void main(String[] args) 
	{  
        //Initialize array 
		 Scanner sc = new Scanner(System.in);// creat scanner class 
		 
			System.out.print(" Please Enter Number of elements in an array : ");
			int Size = sc.nextInt();
	
			int  a[] = new int[Size]; 
	        int temp = 0; 
	        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
			for (int i = 0; i < Size; i++) // loop for arry a 
			{
				a[i] = sc.nextInt(); // getting in put for elements of arry a
			}   
	            
	        System.out.println();
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order 
      for(int i=5-1;i>=0;i--)
      {
    	   System.out.print(a[i] + " "); 
        }  
    }  
}  


