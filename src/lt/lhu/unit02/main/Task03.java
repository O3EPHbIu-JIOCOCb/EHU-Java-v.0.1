package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int a, b, c, x;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("Пожалуйста, введите значение числа a >");
		a = sc.nextInt();
		System.out.println("А еще введите значение числа b >");
		b = sc.nextInt();
		System.out.println("Наконец, введите значение числа c >");
		c = sc.nextInt();
		x = a * a - (b - c) * (b - c) + (b * b + 1);
		System.out.println("Вы дождались, поздравляем. Значение выражения равно " + x);
	}

}
