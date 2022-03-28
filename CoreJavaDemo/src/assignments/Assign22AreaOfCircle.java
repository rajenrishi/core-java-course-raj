/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 22
//Write a program to calculate the area of a Circle.
//Circle diameter and measurement metric (‘ft’, ‘inch’, ‘cm’; only these three are allowed) 
//will be passed to initialize the object.
//Write an instance method to calculate the area of the circle.
//Only inches will be used for area calculation, write a static method to 
//convert the diameter into inches before calculating the area.

class CalAreaCircle {
	
	double cirDia;
	String meaMetric;
	
	CalAreaCircle(double cirDia, String meaMetric) {
		
		this.cirDia = cirDia;
		this.meaMetric = meaMetric;
	}

	public static double convertToInches(double cirDia, String meaMetric) {
		
		double diaInInch = 0;

		if(meaMetric.equals("ft")) {
			
			diaInInch = cirDia * 12;
		
		} else if(meaMetric.equals("cm")) {
			
			diaInInch = cirDia * 0.39;
			
		}
		
		return diaInInch;
	}
	
	public double cirCalArea() {
		
		double cirArea;
		
		double diaInInch = CalAreaCircle.convertToInches(this.cirDia, this.meaMetric);
		
		double radius = diaInInch / 2;
		
		cirArea = 3.14 * radius * radius;
		
		return cirArea;
	}
}

public class Assign22AreaOfCircle {

	public static void main(String[] args) {
		
		double areaOfCircle = 0;

		CalAreaCircle cirAreaObj = new CalAreaCircle(1.0, "ft");
		areaOfCircle = cirAreaObj.cirCalArea();
		System.out.println("Area of circle is: " + areaOfCircle);
	}
}
