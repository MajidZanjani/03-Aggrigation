package aggrigation;

public class Circle {
	 Operation operation; 
	 double pi = 3.14;  
	    
	 double area(int radius){  
		 operation = new Operation();  
		 return pi * operation.square(radius);  
	 }  
}
