package com.day;

import java.util.Iterator;

public class Day_0409 {

	public static void main(String[] args) {

//		int[] arr2 = new int[100];
//
//		for (int i = arr2.length-1; i > -1; i--) {
//			arr2[i] = i+1;
//		}
//
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
//		
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}

		for (int i = 0; i < 1000; i++) {
			int r = (int) (Math.random() * 44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;

		}
		
		// 6�� �̾Ƽ� �迭�� ���� 
		int[] lotto_6 = new int[6];
		
		for (int i = 0; i < lotto_6.length; i++) {
			lotto_6[i] = lotto[i];
		}
		
		// ������������ �����ϱ�
		
		for (int i = 0; i < lotto_6.length; i++) {
			for (int j = i + 1; j < lotto_6.length; j++) {
				if(lotto_6[i] > lotto_6[j]) {
					int temp = lotto_6[i];
					lotto_6[i] = lotto_6[j];
					lotto_6[j] = temp;
				}
			}
		}
		for (int i = 0; i < lotto_6.length; i++) {
			System.out.println(lotto_6[i]);
		}
	}
	
	
	

	static void asc_ex() {

		// �迭�� Ȱ���Ͽ� �������� ���� �غ��� + ���� for��

		int a = 3;
		int b = 6;
		int c = 2;
		int d = 11;
		int e = 1;

		int[] array_int = { a, b, c, d, e };

		for (int i = 0; i < array_int.length; i++) {
			for (int j = 1 + i; j < array_int.length; j++) {
				if (array_int[i] >= array_int[j]) {

					int temp = array_int[i];
					array_int[i] = array_int[j];
					array_int[j] = temp;
					System.out.println("����"); // �̷��� �� ������ ���� a�� ������ ���� ������ ��� �񱳰� �ǰ�, �ᱹ �� �տ� ���� ���� ���� ���� �ȴ�. ���������� i =
												// 1�� �Ǹ� �ι�° �ڸ��� �ι�°�� ���� ���� ���� ��.
				}
			}
		}
		
		
		
		for (int i = 0; i < array_int.length; i++) { // ���ĵ� ����� ����غ���.
			System.out.println(array_int[i]);
		}
		
	}

}