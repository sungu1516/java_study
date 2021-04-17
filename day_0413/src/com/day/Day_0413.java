package com.day;

import java.util.ArrayList;
import java.util.Iterator;

public class Day_0413 {

	public static void main(String[] args) {
		
		add_char_to_string();
		
	}

	static void list_remove() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 1 - 10���� ����
		for (int i = 1; i < 101; i++) {
			list.add(i);
		}

		// ���� ����

		for (int i = 0; i < 100; i++) { // i = 100�� �Ǿ��� �� ���ߵ���
			list.remove(0);
		}

		// ��� Ȯ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("size : " + list.size());

		ArrayList<String> string_list = new ArrayList<String>();
		string_list.add("Java");
		string_list.add("Python");
		string_list.add("C");

		for (int i = 0; i < string_list.size(); i++) {
			System.out.println(string_list.get(i));
		}
	}

	static void list_basic() {
		// ����Ʈ - ������ ���� �迭�� ������ ����!! flexible�ϴ�.

		ArrayList<Integer> list = new ArrayList<Integer>(); // ũ�Ⱑ ���������� �ʴ�.
		list.add(100); // �߰� �� ������ �����Ӵ�.
		list.add(200);
		list.add(300);

		System.out.println(list.size()); // ����Ʈ�� ũ�� ���

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	static void gugu_array() {
		// 2�� �迭 ����ؼ� ������ ����

		// �켱 �ʿ��� ���ڵ��� �� 2�� �迭�� ������ش�.
		int[][] num9 = new int[2][];

		num9[0] = new int[8];
		num9[1] = new int[9];

		for (int i = 0; i < num9[0].length; i++) {
			num9[0][i] = i + 2;
		}
		for (int i = 0; i < num9[1].length; i++) {
			num9[1][i] = i + 1;
		}

		// ���� ���� for���� Ȱ���Ͽ� 2���迭 ���� �� 1���迭�� ���� ������ ���� �����Ѵ�.
		for (int i = 0; i < num9[0].length; i++) {
			for (int j = 0; j < num9[1].length; j++) {
				System.out.printf("%d * %d = %d \n", num9[0][i], num9[1][j], (num9[0][i]) * (num9[1][j]));
			}
		}
	}

	static void parser() {

		// ���ڿ��� ���� ���ڸ� �����Ͽ� ����ϱ� + parser�� ���!! (�߿�)

		String text = "hello=1;world=2;test=3;counts=4";
		String[] n_text = text.split(";");

		for (int i = 0; i < n_text.length; i++) {
			// ���ڷ� parsing �ϴ� ���

			int n = Integer.parseInt(n_text[i].charAt(n_text[i].length() - 1) + ""); // parser�� ���� ���ڿ��� int �ڷ������� �����. ��
																						// ��, char to int�� �ȵǹǷ� ���� + ""��
																						// ���ش�
			int ni = Integer.parseInt(n_text[i].charAt(n_text[i].indexOf("=") + 1) + ""); // indexOf : Ư�� ���ڿ����� ������ ���ڿ�
																							// or char ���� �ε����� ��ȯ

			System.out.println(ni);

		}
		//

		String mi = "-1";
		int n_mi = Integer.parseInt(mi);
		System.out.println(n_mi + 1);
	}

	static void lotto_suffle_sort() {
		// lotto ����

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 1000; i++) {
			int r = (int) (Math.random() * 44 + 1);
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}

		// ���õ� ��� �� ������ 6���� ����

		int[] lotto6 = new int[6];

		for (int i = 0; i < lotto6.length; i++) {
			lotto6[i] = lotto[i];
		}

		// ���õ� �� �����غ���

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto6.length; j++) {
				if (lotto6[i] > lotto6[j]) {
					int temp = lotto6[i];
					lotto6[i] = lotto6[j];
					lotto6[j] = temp;
				}
			}
		}

		for (int i = 0; i < lotto6.length; i++) {
			System.out.println(lotto6[i]);
		}
	}

	static void add_char_to_string() {
		String text = "�ȳ��ϼ���, �̼����Դϴ�.";

		// �� ���ڿ��� ���ڸ� char �迭�� �ѱ��� �ѱ��� ������ �� �� ���ڵ��� �ٽ� �����ͼ� string���� ������

		text = text.replace(" ", ""); // �ʿ���� �� ���ڿ��� �������ش�.
		text = text.replace(",", "");
		text = text.replace(".", "");

		char[] ca = text.toCharArray(); // toCharArray : ���ڿ��� ���� �ϳ��ϳ��� char �迭�ȿ� �־��ش�.
		String str = ""; // ���ڿ� �����

		// �� ���ڿ��� char �迭�� ��� �ϳ��ϳ� �ٿ��ֱ�
		for (int i = 0; i < ca.length; i++) {
			str += ca[i];
		}

		System.out.println(str);
	}

	static void count_char_2() {
		String text = "��Ű����� �߸����̰� ���� ������ ���� ������ ��������� ������ �������� �ϴ� ������Ʈ��, ������ �����Ͽ� ������ �����ϰ� ������ų �� �ֽ��ϴ�."
				+ "��Ű����� �߸����̰� ���� ������ ���� ������ ��������� ������ �������� �ϴ� ������Ʈ��" + "������ �����Ͽ� ������ �����ϰ� ������ų �� �ֽ��ϴ�."
				+ "��Ű����� �ټ� ���� �⺻ ��Ģ�� ���� ��˴ϴ�. " + "��� ������ ũ������Ƽ�� Ŀ���� ������ǥ��-�������Ǻ������ 3.0�� ���� ����� �� ������"
				+ "����, ������ ������ �����Ӱ� ����� ������ ��뵵 �����մϴ�.";

		// �� ���ڿ����� �ߺ��� �ִ� ������ ������ ����� - array �̿�

		text = text.replace(" ", ""); // �ʿ���� �� ���ڿ� �� Ư������ ����
		text = text.replace(",", "");
		text = text.replace(".", "");

		char[] ca2 = text.toCharArray(); // toCharArray : ���ڿ��� ���� �ϳ��ϳ��� char �迭�ȿ� �־��ش�
		for (int i = 0; i < ca2.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < ca2.length; j++) {
				if (ca2[i] == ca2[j]) {

					if (ca2[j] == ' ') {
						continue; // �ڿ��� ���� ������ ������ count���� �ʰ� ��������
					}

					count++;
					ca2[j] = ' '; // ���� �ߺ��Ǵ� ��� ���ڸ� �������� �ٲ����μ�, �Ŀ� �ߺ����� ���� �ʰ� ��.
				}

			}
			if (ca2[i] != ' ')
				System.out.printf("%s : %d�� �ߺ� \n", ca2[i], count);
		}
	}

	static void count_char_1() {
		String text = "��Ű����� �߸����̰� ���� ������ ���� ������ ��������� ������ �������� �ϴ� ������Ʈ��, ������ �����Ͽ� ������ �����ϰ� ������ų �� �ֽ��ϴ�."
				+ "��Ű����� �߸����̰� ���� ������ ���� ������ ��������� ������ �������� �ϴ� ������Ʈ��" + "������ �����Ͽ� ������ �����ϰ� ������ų �� �ֽ��ϴ�."
				+ "��Ű����� �ټ� ���� �⺻ ��Ģ�� ���� ��˴ϴ�. " + "��� ������ ũ������Ƽ�� Ŀ���� ������ǥ��-�������Ǻ������ 3.0�� ���� ����� �� ������"
				+ "����, ������ ������ �����Ӱ� ����� ������ ��뵵 �����մϴ�.";

		// �� �ؽ�Ʈ�� '��' �� '��' ��� ���ڰ� ��� �ֳ�?

		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '��') {
				System.out.println("�� �߰�");
				count++;
			}

			else if (text.charAt(i) == '��') {
				System.out.println("�� �߰�");
				count++;
			}
		}
		System.out.println(count);
	}

	static void count_lotto() {
		// �ζ� ��ȣ �� �ߺ������� ���� �ľ��ϱ�

		// �ζ� ��ȣ�� ����ִ� �迭 �����(�ߺ��� �����ϰ�)
		int[] lotto = new int[47];
		lotto[0] = 1;
		lotto[46] = 45;

		for (int i = 1; i < lotto.length - 1; i++) {
			lotto[i] = i;
		}

		// �ζ� ��ȣ ���
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

		// ���� for������ �ߺ� ���� ����
		int count = 0; // ī��Ʈ�� ���� ���� ������ֱ�
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("������ �� ����");
					count++; // ������ ������ count + 1
				}
			}

		}
		System.out.println(count); // ���� count ���
	}
}