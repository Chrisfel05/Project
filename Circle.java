import java.util.Scanner;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		Scanner Input = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS: ");
		radius = Input.nextInt();
		double c = Math.PI;
		double circumference = 2 * c * radius;
		double Round_circumference = (double) Math.round(circumference *100)/100;
		double area = c * radius* radius;
		double Round_area = (double) Math.round(area * 100)/100;
		System.out.println("The area of the circle given a radius of"+radius+ "is"+Round_area+ "and the circumference is"+Round_circumference);

	}

}
