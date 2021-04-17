package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day_0414 {

	public static void main(String[] args) {
		String str = "Lee;Sun;Gu";

		String[] str_arr = str.split(";");

		char[][] char_arr = new char[str_arr.length][];

		// �־��

		for (int i = 0; i < str_arr.length; i++) {
			char_arr[i] = new char[str_arr[i].length()];
			for (int j = 0; j < str_arr[i].length(); j++) {
				char_arr[i][j] = str_arr[i].charAt(j);
			}
			System.out.println(char_arr[i]);
		}

	}

	static void string_to_char() {
		String text = "hello;world;Sunguleeeee";
		String[] tp = text.split(";");
		char[][] ca = new char[tp.length][];

		for (int i = 0; i < tp.length; i++) {
			ca[i] = new char[tp[i].length()];
			for (int j = 0; j < tp[i].length(); j++) {
				ca[i][j] = tp[i].charAt(j);
			}

		}
		for (int i = 0; i < ca.length; i++) {
			System.out.println(ca[i]);
		}
	}

	static void List_time() {
		ArrayList<Integer> list = new ArrayList<Integer>(); // �ּҰ� �Ҵ�
		LinkedList<Integer> list_i = new LinkedList<Integer>();
		// �� �� ���� Ŭ������ ��� �̵��� ���� ������ List(=interface)�� ���� �� �ִ�.

		ArrayList<int[]> arr_list = new ArrayList<int[]>();

		int[] arr_int = new int[10];
		for (int i = 0; i < arr_int.length; i++) {
			arr_int[i] = i;
		}

		arr_list.add(arr_int);

		int[] arr_int1 = new int[10];
		for (int i = 0; i < arr_int1.length; i++) {
			arr_int1[i] = i;
		}

		arr_list.add(arr_int1);

		for (int i = 0; i < arr_list.size(); i++) {
			System.out.println("�迭�� �ּ� ��� : " + arr_list.get(i));
			for (int j = 0; j < arr_list.get(i).length; j++) {
				System.out.println("�ش� �迭 ���� ���� ���" + arr_list.get(i)[j]);
			}

		}

		// �� Ŭ������ ���̸� ����.
		// ���������, �� Ŭ������ �۵������ �ٸ���. ���� �� ������ �־� listed�� �� ȿ����
//		timeCurrent(list); // �Ʒ����� ������ �޼����� ���ڷ� �ּҰ��� ����.
//		System.out.println(list.size());
//		timeCurrent(list_i);
//		System.out.println(list.size());
	}

	static void timeCurrent(List<Integer> l) { // �� ������ ���� list �� �ּҰ� ���޵�. �̸� �����Ͽ� ���� �ִ´�.
		// ���� �� ������ �ð��� �����Ѵ�
		double startTime = System.currentTimeMillis(); // for�� ���۽ð� ���
		for (int i = 0; i < 10000; i++) {
			l.add(i);
		}
		for (int i = 0; i < 10000; i++) {
			l.remove(0);
		}
		double endTime = System.currentTimeMillis(); // for�� �� �ð� ���
		System.out.println(endTime - startTime);
	}

	static void constructor() {
		// ���� ���� AŬ������ Ȱ���Ͽ� ��ü ����

		A a = new A(5);
		A a_1 = new A("Sungu"); // ������ interface�� ����
		B b = new B();

		String n = new String("hello"); // "hello" �� �־��� ���� �����ڵ� �����ϴ� ��
		String n_2 = new String(); // �̴� ���� ���ڿ��� �־��� ���� �����ڿ� �ٸ���. ��, Ŭ���� ������ ���� �����ڸ� ���� �� �ִ�.

	}
}