package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int a, b, c, x;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("����������, ������� �������� ����� a >");
		a = sc.nextInt();
		System.out.println("� ��� ������� �������� ����� b >");
		b = sc.nextInt();
		System.out.println("�������, ������� �������� ����� c >");
		c = sc.nextInt();
		x = a * a - (b - c) * (b - c) + (b * b + 1);
		System.out.println("�� ���������, �����������. �������� ��������� ����� " + x);
	}

}
