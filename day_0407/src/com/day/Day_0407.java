package com.day;

public class Day_0407 {

	public static void main(String[] args) {
		
		sum_v(3);

	}

	/*
	 * �Ʒ����� ���� ������ �Լ���. ���� ���� �𸣰����� static ���� �ڿ� �Լ��� �������ش�. ���� ������ �Լ��� ����ϱ� ���ؼ� ����
	 * ���� �Լ��� �̿��Ѵ�. ���� �Լ��� �۵� ������, ���� �ڵ尡 ������ �ǹ��ϴ� ���� ���� �� �����غ��� �� �� �ϴ�.
	 */

	static void add_v(int a, int b) {
		int result = a + b;
		System.out.println(result);

	}

	static int swit_1(int c) {
		int sum = 0;
		switch (c) {
		case 0:
			sum += c;
			c++;

		case 1:
			sum += c;
			c++;

		case 2:
			sum += c;
			c++;

		case 3:
			sum += c;
			c++;
			// ���� ���⼭ case 100���� �������൵ ����� ����. �ѹ� �ɸ��� break�� ���� �� ����ؼ� ����ȴ�.

		case 4:
			sum += c;
			c++;

		case 5:
			sum += c;
			c++;

		case 6:
			sum += c;
			c++;

		case 7:
			sum += c;
			c++;

		case 8:
			sum += c;
			c++;

		case 9:
			sum += c;
			c++;

		case 10:
			sum += c;
			c++;
		}

		if (sum == 45) {
			return sum;
		} else
			return sum * 10; // return �ڵ� �Ʒ��� ������� ���� ������� �ʴ´�. �� return�� ȣ���ϴ� �޼��� ��ü�� ����������.
	}

	static void sub_v(int n) {
		int tot = 0;

		switch (n) {
		case 0:
			tot -= n;
			n++;

		case 1:
			tot -= n;
			n++;

		case 2:
			tot -= n;
			n++;

		case 3:
			tot -= n;
			n++;
			// ���� ���⼭ case 100���� �������൵ ����� ����. �ѹ� �ɸ��� break�� ���� �� ����ؼ� ����ȴ�.

		case 4:
			tot -= n;
			n++;

		case 5:
			tot -= n;
			n++;

		case 6:
			tot -= n;
			n++;

		case 7:
			tot -= n;
			n++;

		case 8:
			tot -= n;
			n++;

		case 9:
			tot -= n;
			n++;

		case 10:
			tot -= n;
			n++;

		default:
			System.out.println("Total : " + tot);
			// break;
		}
	}

	/*
	 * �Ʒ��� ���� �̸��� �Լ��� ������ ������ ��. �Ű������� Ÿ���� �ٸ� ���, �̷��� ������ �̸��� �Խ��� ����� ���� �����ϴ�. ����
	 * ��ü�� �̸�(n) �� ���� ���� ��� ����.
	 */

	static void sum_v(int n) {

		int sum = 0;
		switch (n) {
		case 0:
			sum += n;
			n++;

		case 1:
			sum += n;
			n++;

		case 2:
			sum += n;
			n++;

		case 3:
			sum += n;
			n++;
			// ���� ���⼭ case 100���� �������൵ ����� ����. �ѹ� �ɸ��� break�� ���� �� ����ؼ� ����ȴ�.

		case 4:
			sum += n;
			n++;

		case 5:
			sum += n;
			n++;

		default:
			System.out.println("Total : " + sum);
			// break;
		}

	}

	static void sum_v(String n) {
		System.out.println(n);
	}

	static void gugu(int n) {
		for (int i = n; i <= n; i++) {

			System.out.println(i + "�����");
			for (int j = 1; j < 20; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i * j));
			}
			System.out.println("\n");
		}
	}

	// �޼��带 ����µ�, ���ڰ��� 9-19������ �޴´�.

	static void GuGu(int n) {

		if (n <= 9)
			n = 10;
		else if (n >= 21)
			n = 20;

		for (int i = 2; i < n; i++) {
			gugu(i);
		}
	}

	static void GU(int n) {
		if (n > 19) {
			for (int i = 2; i < 19; i++) {
				gugu(i);
			}
		}

		for (int i = 2; i < Math.max(n + 1, 10); i++) {
			gugu(i);
		}
	}

}