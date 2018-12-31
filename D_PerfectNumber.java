package com.one.day;

import java.util.Scanner;

public class D_PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하시오 : ");
		long num = sc.nextLong();
		long sum = 0;
		for(long i = 1; i < num; i++ ) {

			if(num%i == 0 ) {   // 입력받은 자연수의 약수를 구하는 공식 
				sum += i;       // 약수의 합을 구함

			}
		}

		if(sum == num) {              //입력받은 약수의 합이 입력받은 수와 같다면 완전수이다.
			System.out.println("입력받은 자연수는 완전수이다");
		}
		else {                        //그렇지 않다면 완전수가 아니다
			System.out.println("입력받은 자연수는 완전수가 아니다");
		}


	}
}