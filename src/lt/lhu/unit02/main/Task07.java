package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		double a, b, c, K, S;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Введите нужное число a > ");
		a = sc.nextInt();
			if (a < 0) {
				System.out.println("Ваше число является отрицательным и подлежит возведению в 4 степень");
				S = Math.pow(a, 4);
				System.out.println("Ваше число в 4 степени будет равно " + S);
			
				}else { 
				
				System.out.println("Ваше число является положительным и подлежит возведению в квадрат");
				K = Math.pow(a, 2);
				System.out.println("Ваше число в квадрате будет равно " + K);
			
		System.out.println("Введите нужное число b > ");
		b = sc.nextInt();
			if (b < 0) {
				System.out.println("Ваше число является отрицательным и подлежит возведению в 4 степень");
				S = Math.pow(b, 4);
				System.out.println("Ваше число в 4 степени будет равно " + S);
				
				}else { 
					
				System.out.println("Ваше число является положительным и подлежит возведению в квадрат");
				K = Math.pow(b, 2);
				System.out.println("Ваше число в квадрате будет равно " + K);
				
		System.out.println("Введите нужное число c > ");
		c = sc.nextInt();
			if (c < 0) {
				System.out.println("Ваше число является отрицательным и подлежит возведению в 4 степень");
				S = Math.pow(c, 4);
				System.out.println("Ваше число в 4 степени будет равно " + S);
					
				}else { 
							
				System.out.println("Ваше число является положительным и подлежит возведению в квадрат");
				K = Math.pow(c, 2);
				System.out.println("Ваше число в квадрате будет равно " + K);
			
				}
			}
		}
	}
}


