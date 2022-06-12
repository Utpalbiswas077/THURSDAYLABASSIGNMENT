package OPPs;


//Java program to create a class to
//print the area and perimeter of a
//rectangle

public class FindAreaAndPreimetar {

	    public static void main(String arg[])
	    {
	        Rectangle rect = new Rectangle(10,5);  //create an instance class
	        
	      //  Assigning the value in the length variable and breadth of
	        // Rectangle Class 
	  
	        System.out.println("Length = " + rect.length);
	        System.out.println("Breadth = " + rect.breadth);
	        System.out.println("Area = " + rect.getArea());
	        System.out.println("Perimeter = " + rect.getPerimeter());
	    
	    }
	}

	class Rectangle
	{
	    double length;
	    double breadth;
	 // Variable of data type double

	    Rectangle(double length, double breadth)
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }
// Genater Setter and Getter 
	    
	    public double getLength() {
			return length;
		}


		public void setLength(double length) {
			this.length = length;
		}


		public double getBreadth() {
			return breadth;
		}


		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		// Area Method to calculate the area of Rectangle

		double getArea()
	    {
	        return length * breadth;
	    }
		// Perimeter Method to calculate the Perimeter of
	    // Rectangle
	    double getPerimeter()
	    {
	        return 2 * (length + breadth);
	    }
	}
