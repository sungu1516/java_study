package com.day;

import java.util.ArrayList;

public class Note {

	public static void main(String[] args) {
		add_2darr_to_list();
	}

	static void add_2darr_to_list() {
		// ����Ʈ�� 2���迭 �־��

		ArrayList<int[][]> list2 = new ArrayList<int[][]>();

		// 2���迭 �����

		int[] array = { 7, 8, 9 };
		int[][] array_int = { { 1, 2, 3 }, { 4, 5, 6 }, array };

//		System.out.println(array_int.length);

		list2.add(array_int);
		list2.add(array_int);

		// ����Ʈ ���� �迭 ���(���Ҵ�����)

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.get(i).length; j++) {
				for (int k = 0; k < list2.get(i)[j].length; k++) {
//					System.out.println(list2.get(i)[j][k]);
				}
			}
			
			
		} 	

		// ���ο� 3�� �迭�� �����, �� �迭 �ȿ� �� ���� �־��.

		int[][][] arr3 = new int[list2.size()][][];
		

		for (int i = 0; i < list2.size(); i++) {
			//System.out.println(i);
			arr3[i] = new int[list2.get(i).length][]; // 2���迭�� ũ����� ���ʴ�� ���� (�ּ� �Ҵ�)
			
			for (int j = 0; j < list2.get(i).length; j++) {
				//System.out.println(j);
				arr3[i][j] = new int[list2.get(i)[j].length]; // 1���迭�� ũ�� ����
				
				for (int j2 = 0; j2 < list2.get(i)[j].length; j2++) {
					arr3[i][j][j2] = list2.get(i)[j][j2];
					System.out.println(arr3[i][j][j2]);
					
					
					
					
				}
				
			}
		}

	}

	static void add_arr_to_list() {
		ArrayList<int[]> array_list = new ArrayList<int[]>(); // ũ�� ������ �ʿ䰡 ����.

		// �پ��� �迭�� ����. 1���� 2�� ��� ����.
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];

		int[][] arr3 = new int[3][]; // 3���� ���� ������ֱ�. arr3�̶�� 2���迭 ��ü�� �ּ� �Ҵ�
		System.out.println(arr3);
		System.out.println(arr3[0]); // ������ 3���� �� �������� ���� �ּ� �Ҵ��� �ȵ�.

		// ���� ������ ���� �迭�� ����Ʈ �ȿ� �־��.

		// �켱 1�� �迭 �ȿ� ���Ҹ� �ְ�, ����Ʈ �ȿ� ����

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i;
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}

		array_list.add(arr1);
		array_list.add(arr2);

		// 2���迭�� �־��. ���� ���Ҹ� �ְ� 2���迭�� �ϼ��� �� ����Ʈ �ȿ� ����. �� ��, �ش� ����Ʈ���� 1�� �迭�� �� �� �����Ƿ�
		// ����.

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = new int[5]; // arr3�̶�� 2���迭 �ȿ� 3���� �����迭�� ����, �� �迭�� ũ�⸦ ���ʴ�� ����(�� 5���� ���Ұ� �� �� �ִ�.)
			// System.out.println(arr3[i]); // 3���� �迭�� �ּҰ��� ��µ�. ���� �ڵ带 ���� �ּҰ� �Ҵ�Ǿ����� �� ��
			// �ִ�.
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = j; // for ������ ���� 1���迭 �ȿ� ���Ҹ� �־��ش�.
				// System.out.println(arr3[i][j]);
			}
		}

		for (int i = 0; i < arr3.length; i++) { // ����Ʈ�� 1���迭�ۿ� ���� ���ϹǷ� for�� �̿��� ���ʴ�� �־��ش�.
			array_list.add(arr3[i]);
		}

		// ���� ����Ʈ ���� ��� �迭 �ȿ� ���Ұ��� ��. �̸� ��� ����غ���.

		for (int i = 0; i < array_list.size(); i++) {
			for (int j = 0; j < array_list.get(i).length; j++) {
				System.out.println(array_list.get(i)[j]);
			}
		}
	}
}