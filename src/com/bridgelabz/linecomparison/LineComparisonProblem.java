package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparisonProblem {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program.");
		Scanner sc =new Scanner(System.in);
		
		double x1, x2, y1, y2 = 0;
		int lengthOfLine=0;
		
		System.out.println("Enter x1 & y1 values of First point");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        
        System.out.println("Enter x2 & y2 values of Second point");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        
        lengthOfLine=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of a Line = "+ lengthOfLine);
	}

}
