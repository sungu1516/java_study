package com.day;

public class note {

	public static void main(String[] args) {
		
		
	}

	static void return_char() {
		// String �ڷ������� ���� �ϳ��ϳ��� ������ char �迭 ����� & contains �޼����� ���

		String text = "helloworld";
		char[] cs = new char[text.length()];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = text.charAt(i);
			if (text.contains("ll")) { // equals�� �ٸ��� ���ڿ����� �Ϻΰ� ���ԵǴ°��� �����.
				System.out.println("test");
			}
		}
		System.out.println(cs);
	}
	
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

		default: // ���� ���� ���ο� ������� �⺻ ���� �ڵ带 �־��� �� �ִ�. 
			System.out.println("Total : " + sum);
			// break;
		}

	}
	
}