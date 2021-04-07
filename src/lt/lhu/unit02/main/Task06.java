package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		double a, b, c, d, X;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("–ешите заданное выражение");
		System.out.println("¬ведите нужное число a > ");
		a = sc.nextInt();
		System.out.println("¬ведите нужное число b > ");
		b = sc.nextInt();
		System.out.println("¬ведите нужное число c > ");
		c = sc.nextInt();
		System.out.println("¬ведите нужное число d > ");
		d = sc.nextInt();

		X = ((a / c) * (b / d)) - ((a * b - c) / c * d);
		System.out.println("¬нимание! «начение заданного выражени€ равно " + X);
		System.out.println("—пасибо за внимание, ваше решение очень важно дл€ нас. ќставайтесь на линии.");
	}

}
