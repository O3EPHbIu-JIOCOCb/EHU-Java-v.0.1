package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		double a, b, c, d, X;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("������ �������� ���������");
		System.out.println("������� ������ ����� a > ");
		a = sc.nextInt();
		System.out.println("������� ������ ����� b > ");
		b = sc.nextInt();
		System.out.println("������� ������ ����� c > ");
		c = sc.nextInt();
		System.out.println("������� ������ ����� d > ");
		d = sc.nextInt();

		X = ((a / c) * (b / d)) - ((a * b - c) / c * d);
		System.out.println("��������! �������� ��������� ��������� ����� " + X);
		System.out.println("������� �� ��������, ���� ������� ����� ����� ��� ���. ����������� �� �����.");
	}

}
