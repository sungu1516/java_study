package com.day;

import java.util.Iterator;

public class Day_0412 {

	public static void main(String[] args) {
		
		//2���迭
		
		int[][] array = new int[3][];       // array��� 2�� �迭 �ȿ� �ּҸ� ������ ������ 3�� �����.
		
		
		array[0] = new int[3];             // �̴� ���� ���� 1�� �迭�� 3�� ����� ���� �ǹ��Ѵ�. ������ �ܼ��� ���� �ٸ� 1���迭 3���� ����� �Ͱ��� �ٸ���. 
		
		array[1] = new int[3];			// 2�� �迭�� ���� 3���� �迭�� ����� ���� ������, ������ for���� ���� ���� �� �����ϰ� �迭�� ���� ������ �� �ִٴ� ���̴�. 
		array[2] = new int[3];          // ����Ÿ���̴�. 
		
		array[0][0] = 100;             // �̴� ���� �ϳ��ϳ� ����. �Ʒ��� ���� for���� ���� �����ϰ� �Է� ����. 
		array[0][1] = 200;             // ����Ÿ���̴�.
		array[0][2] = 300;
		
		array[1][0] = 100;
		array[1][1] = 200;
		array[1][2] = 300;
		
		array[2][0] = 100;
		array[2][1] = 200;
		array[2][2] = 300;
		
		
		// ���� ���� ������ for������ �����غ���
//		System.out.println(array);               // ���� ���� �迭�� 2�� �迭�� �ּ�. �迭�� �迭���� ���� 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = (j+1)*100;
//				System.out.println(array[i]);                    // �̴� �ּҸ� �����ϴ� ����. ���� ���� �迭�� 1���迭�� �ּҸ� �ǹ��Ѵ�. 
//				System.out.println(array[i][j]);                 // �̴� ������ �����ϴ� ���� 
			}			
		}
		
		
		// �迭�� stirng ���� 
		
		String[] string_text = new String[3];
		int[] text_int = new int[3];
		string_text[0] = "hello";
		System.out.println(string_text[0]);
		
		//System.out.println(text_int);
		
		String n = string_text[0];  // �� ��� new�� ���ο� ��ü�� ����� ���� �ƴϱ� ������, n�� stirng_text[0]�� �ּҸ� �״�� �������� �ȴ�.
		//String n = "hhhh"; // ������ �ٸ� value�� �־��� ��� �ٸ� �ּҸ� ���� �ȴ�. 
		
		
		
		int[] a = {100, 200};                // �ʱ�ȭ�ؼ� ù ° ���� 100����
		
		toString_test(a);             // �Ʒ����� ������ �Լ��� ���. �� ��, a�� �迭�̹Ƿ� a�� �ּҸ� �־��ִ� ���̴�.   
		System.out.println("�迭�Դϴ�. : " + a[0]);    // ����Ÿ���� �迭�� �Լ��� ���ڷ� �־��־��� ������ ���� �迭�� ���� �ٲ��. 
		toString_test(a[0]);       // ���� �ٸ��� valueŸ���� �־��ش�. �̴� �� �Լ��� ���ڷ� a[0]�� �ش��ϴ� ������ �־��ִ� ���� �ǹ��Ѵ�. 
		System.out.println("value�Դϴ�. : " + a[0]);     // ���� �迭�� ���� ������ �ʴ´�. 
		
		
		
		
		// String Ÿ�� ���� �迭�̶�� ���� �����ϸ�, ���� ������ �����غ���. 
		
		text = text_f();
		String text2 = "helloworld";
		String text3 = new String("helloworld");
		String text4 = text; //�� ��� text�� �ּҸ� �״�� text4�� �Ѱ��ش�.
		
		
		if (text_t() == text2)                         // string�� ��� ����Ÿ���� �����̱� ������, value�� ���ϴ� ���� �ƴ϶� �ּҸ� ���ϰ� �ȴ�. 
			System.out.println("�� �ּҰ� ����");
		else 
			System.out.println("�ּҰ� Ʋ��");
		
//		if (text_f() == text3);
//			System.out.println("new��ü�� �ּҰ� ����?");
//		else
//			System.out.println("new��ü�� �ּҰ� �ٸ���");
		
		
		// equal �޼����?
		// ���Ը��ؼ� Sting �ڷ����� �ּҰ� �ƴ� ���� �����ش�. ���� ���� 
		if (text2.equals(text))
			System.out.println("value�� �����ϴ�.");
		
		
		// �� �� �������� String �޼���
		char c = text2.charAt(text2.length() - 1);     //���ڿ��� Ư�� �κ��� ������ �ִ� �޼���. ���� �ϳ��̹Ƿ� char�ڷ��� ���� �� ���� 
		System.out.println(c);
		
		
	}
	
	static String text = "helloworld";         // ���� ������ ���� �� �ʱ�ȭ�Ѵ�. �̴� �Ʒ��� �޼��忡�� ������ ���� 
	
	static String text_f() {
		return "helloworld";
	}
	
	static String text_t() {
		return text;
	}
	
	// ��� : string �� ������ ������ ���� �ּҸ� �Ҵ��Ѵ�. ���� ��� helloworld �� ���� �ּҸ� �Ҵ��ϰ�, ���� ������ stirng �� ������ ��� ���� �ּҷ� �Ҵ��Ѵ�.
	// ������ new�� ���� Ŭ������ ���ο� ��ü�� ���� ��� string ������ ������ �ٸ� �ּҸ� �Ҵ�޴´�.
	
	static int toString_test(int[] n) {
		
		n[0] = 500;
		return n[0];
	}
	
	static int toString_test(int n) {
		n = 1000;
		return n;
	}

}
