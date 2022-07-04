package Opp.Arry;

import java.util.Scanner;

public class EvenOddSeparate {

	public static void main(String args[]) {

		int a[]={1,2,5,6,3,8,12}; 
		 System.out.println("Elements of original array: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");
	            }
	        
	        System.out.println();
		System.out.println("Odd Numbers:");  
		// loop for check odd number
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0) //check odd number
		{  
		System.out.print(a[i]+" ");  
		}  
		} 
		System.out.println();
		System.out.println("Even Numbers:");
		// Loop for check even number
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0) // check even
		{  
		System.out.print(a[i]+" ");  
		}  
		}  
		}
	}  
	

