package Opp.Arry;

public class ReverseArry {
	
	public static void main(String[] args) 
	{  
        //Initialize array  
		
        int a[] = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < 5; i++) {  
            System.out.println(a[i] + " ");  
        }  
            
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order 
      for(int i=5-1;i>=0;i--)
      {
    	   System.out.println(a[i] + " "); 
        }  
    }  
}  


