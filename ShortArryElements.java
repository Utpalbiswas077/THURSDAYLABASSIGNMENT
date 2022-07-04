package Opp.Arry;

public class ShortArryElements {
	 public static void main(String[] args) {        
         
	        //Initialize array     
	        int a[]={5, 2, 8, 7, 1};     
	        int temp = 0;    
	            
	        //Displaying elements of original array    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }    
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < a.length; i++) {     
	            for (int j = i+1; j < a.length; j++) {     
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
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }    
	    }    
	}    

