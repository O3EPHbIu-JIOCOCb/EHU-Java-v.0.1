package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		double a, b, c, K, S;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("������� ������ ����� a > ");
		a = sc.nextInt();
			if (a < 0) {
				System.out.println("���� ����� �������� ������������� � �������� ���������� � 4 �������");
				S = Math.pow(a, 4);
				System.out.println("���� ����� � 4 ������� ����� ����� " + S);
			
				}else { 
				
				System.out.println("���� ����� �������� ������������� � �������� ���������� � �������");
				K = Math.pow(a, 2);
				System.out.println("���� ����� � �������� ����� ����� " + K);
			
		System.out.println("������� ������ ����� b > ");
		b = sc.nextInt();
			if (b < 0) {
				System.out.println("���� ����� �������� ������������� � �������� ���������� � 4 �������");
				S = Math.pow(b, 4);
				System.out.println("���� ����� � 4 ������� ����� ����� " + S);
				
				}else { 
					
				System.out.println("���� ����� �������� ������������� � �������� ���������� � �������");
				K = Math.pow(b, 2);
				System.out.println("���� ����� � �������� ����� ����� " + K);
				
		System.out.println("������� ������ ����� c > ");
		c = sc.nextInt();
			if (c < 0) {
				System.out.println("���� ����� �������� ������������� � �������� ���������� � 4 �������");
				S = Math.pow(c, 4);
				System.out.println("���� ����� � 4 ������� ����� ����� " + S);
					
				}else { 
							
				System.out.println("���� ����� �������� ������������� � �������� ���������� � �������");
				K = Math.pow(c, 2);
				System.out.println("���� ����� � �������� ����� ����� " + K);
			
				}
			}
		}
	}
}


