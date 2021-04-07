package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		int x;
		double fx;
			
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Введите число икс > ");
		x = sc.nextInt();
		
		if (x <=-3) {
			fx = 9;
		}else {
		if (x >3) {
			fx = 1 / Math.pow(x, 2) + 1;
	System.out.println("Значение функции F(x) равно " + fx);
			}
		}
	}
}
