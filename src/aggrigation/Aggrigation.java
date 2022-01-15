package aggrigation;
 
public class Aggrigation {

	public static void main(String[] args) {
		   Circle circle = new Circle();  
		   double result = circle.area(5);  
		   System.out.println(result);
		   
		   Rectangle rectangle = new Rectangle();  
		   result = rectangle.area(4, 7);  
		   System.out.println(result);		
	}

}
