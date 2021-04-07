package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		double a, b, h, y;
		
		Scanner sc;
		sc = new Scanner(System.in);
			
		System.out.println("Введите число А > ");
		a = sc.nextInt();
		System.out.println("Введите число Б > ");
		b = sc.nextInt();
		h = 0.1;
	
			System.out.println("---------------------------------");
			System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y" );
			System.out.println("---------------------------------");
			
			for(double x=a; x<=b; x = x+h) {
				y = 2*Math.tan(x/2)+ 1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
			}
	}

}
