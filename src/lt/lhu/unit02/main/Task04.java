package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int a, b, c, d, e, S;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("������� ������ ����� > ");
		a = sc.nextInt();
		System.out.println("������� ������ ����� > ");
		b = sc.nextInt();
		System.out.println("������� ������ ����� > ");
		c = sc.nextInt();
		System.out.println("������� ������ ����� > ");
		d = sc.nextInt();
		System.out.println("������� ������ ����� > ");
		e = sc.nextInt();
		S = a + b + c + d + e;
		System.out.println("�����������, ������. ����� ��������� a+b+c+d+e ����� " + S);

	}

}
