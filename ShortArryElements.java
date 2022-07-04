package Opp.Arry;

import java.util.Scanner;

public class ShortArryElements {
	 public static void main(String[] args) {        
         
	        //Initialize array     
	       // int a[]={5, 2, 8, 7, 1}; 
		 
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
	            
	        //Displaying elements of original array    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < Size; i++) {     
	            System.out.print(a[i] + " ");    
	        }    
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < Size; i++) {     
	            for (int j = i+1; j < Size; j++) {     
	               if(a[i] > a[j]) {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i <Size; i++) {     
	            System.out.print(a[i] + " ");    
	        }    
	    }    
	}    


