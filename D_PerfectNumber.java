package com.one.day;

import java.util.Scanner;

public class D_PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��Ͻÿ� : ");
		long num = sc.nextLong();
		long sum = 0;
		for(long i = 1; i < num; i++ ) {

			if(num%i == 0 ) {   // �Է¹��� �ڿ����� ����� ���ϴ� ���� 
				sum += i;       // ����� ���� ����

			}
		}

		if(sum == num) {              //�Է¹��� ����� ���� �Է¹��� ���� ���ٸ� �������̴�.
			System.out.println("�Է¹��� �ڿ����� �������̴�");
		}
		else {                        //�׷��� �ʴٸ� �������� �ƴϴ�
			System.out.println("�Է¹��� �ڿ����� �������� �ƴϴ�");
		}


	}
}