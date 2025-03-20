
public class Homework {
	/* Write program on Area of Rectangle
	 * Area of Square= side*side
	 * Area of Triangle= 2*b*h (0.5)
	 * Area of Radius = (we can use the float and pi= 3.14)/then take the value of Radius
	 * Area of Cylinder =  (πr2h) copy the value of height B
	 * Area of Cube = 9,11,21,29,41,49
	 */
	//Area of Perimeter = "+2"(a+b);
	

	public static void main(String args[]) {
		int A= 30;
		int B = 25;
		float Pi = 3.14F;
		int R = 14;
		int height = B;
		
		 System.out.println("area of rectangle is = " +A+B); //Output:- 3025
		 System.out.println("area of Square is = "+A*A);  // Output:- 900
		 System.out.println("area of Triangle is = "+A*B/2); // Output :- 375
		 System.out.println("area of Radius is =  "+ Pi*R*R); // Output :- 615.44006
		 System.out.println("area of Cylinder is ="+Pi*B*B);  // Output :- 1962.5
		 System.out.println("Perimeter of Rectangle = "+2*(A+B));  // Output :- 110
		 System.out.println("9's cube is" + 9*9*9);  // Output :- 729 
	}
	
	
}
