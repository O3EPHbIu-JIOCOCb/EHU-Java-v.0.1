package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		double a, b, c, x;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("������� ������ ����� a > ");
		a = sc.nextInt();
		System.out.println("������� ������ ����� b > ");
		b = sc.nextInt();
		System.out.println("������� ������ ����� c > ");
		c = sc.nextInt();
		
		x = ( b + Math.sqrt(b*b+4*a*c)) / (2 * a) - (Math.pow(a, 3)* c) + b;
		System.out.println("���� ��������� ������ �������. �������� ��������� ��������� ����� " + x);
	}

}
