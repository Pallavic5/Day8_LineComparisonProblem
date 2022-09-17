package com.bridgelabz.linecomparison;

import java.util.Scanner;

class Cordinates {
	
	Scanner sc = new Scanner(System.in);
	static double x1, x2, y1, y2, x3, x4, y3, y4;
	static int line1, line2;
	
			public void point1() {
				System.out.println("Enter x1 & y1 values of first point");
				x1 = sc.nextDouble();
				y1 = sc.nextDouble();
			}

			public void point2() {
				System.out.println("Enter x2 & y2 values of second point");
				x2 = sc.nextDouble();
				y2 = sc.nextDouble();
			}

			public void distanceBetweenPoint1Point2() {
				
				line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
				System.out.println("Distance between two points = " + line1);
			}

			// Computation for point3 & point4
			public void point3() {
				System.out.println("Enter x3 & y3 values of third point");
				x3 = sc.nextDouble();
				y3 = sc.nextDouble();
			}

			public void point4() {
				System.out.println("Enter x2 & y2 values of second point");
				x4 = sc.nextDouble();
				y4 = sc.nextDouble();
			}

			public void distanceBetweenPoint3Point4() {
				line2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
				System.out.println("Distance between two points = " + line2);
			}

			public void CompareLinesUsingEqualToMethod() {
				String str1 = Double.toString(line1);
				String str2 = Double.toString(line2);

				if (str1.equals(str2) == true)
					System.out.println("Both lines are equal");
				else
					System.out.println("Not both lines are equal");
			}		
}

	public class LineComparisonProblem {
		public static void main(String[] args) {
			
			Cordinates coordinate = new Cordinates();
			coordinate.point1();
			coordinate.point2();
			coordinate.distanceBetweenPoint1Point2();
			coordinate.point3();
			coordinate.point4();
			coordinate.distanceBetweenPoint3Point4();
			coordinate.CompareLinesUsingEqualToMethod();
		}
	}

	

