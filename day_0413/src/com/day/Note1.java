package com.day;

public class Note1 {

	public static void main(String[] args) {
		make_tri();

	}

	static int test_1(int c) {
		System.out.println(c);
		// for �� ������� �ʰ� �ݺ��� Ż���ϱ� - ����Լ� ���
		if (c == 0) // Ż���� ���� if�� �־��ش�.
			return 0;
		else {
			return test_1(--c);
		}
	}

	static void test_2(int c) {
		System.out.println(c);
		// for���� ������� �ʰ� �ݺ� �������� - ����Լ� ���2
		if (c == 0) // Ż���� ���� if�� �־��ش�.
			return;
		else
			test_2(--c);
	}

	static void test_eternal() {
		// ����Լ��� ����
		System.out.println("test");
		test_eternal();
	}

	static void make_tri() {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) { // i�� ���� ���� for���� ���ư��� Ƚ���� �޶�����.

				if (i >= j) {
					System.out.print('*');
				}

			}
			System.out.println();
		}
	}
}