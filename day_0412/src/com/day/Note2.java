package com.day;

public class Note2 {

	static String string_text3(String[] n) {
		n[0] = "Change";
		return "";
	}

	static String string_text3(String n) {
		n = "Change";
		return "";
	}

	static void char_text(char[] n) {
		n[0] = 'a';
	}
 
	static void make_char() {
		char[][] cs_2 = new char[2][];
		cs_2[0] = new char[2];
		cs_2[1] = new char[2];

		char_text(cs_2[0]);
		cs_2[0][1] = 'b';
		System.out.println(cs_2[0]); // �� �̷��� �ص� ����� �Ǵ°�?
	}

	static void char_text(char n) {
		n = 'a';
	}

	static void is_test(boolean b) {
		b = true;
	}

	static void is_test(boolean[] b) {
		b[0] = true;
	}

	public static void main(String[] args) {

//		boolean[] is_arr = new boolean[2];
//		is_test(is_arr[0]);
//		System.out.println(is_arr[0]);
//		is_test(is_arr);
//		System.out.println(is_arr[0]);

//		boolean[][] is_arr2 = new boolean[2][];
//		is_arr2[0] = new boolean[2];
//		
//		System.out.println(is_arr2[0][0]);
//		is_test(is_arr2[0]);
//		System.out.println(is_arr2[0][0]);

		int[][] array_int = new int[2][];
		array_int[0] = new int[2];
		array_int[1] = new int[2];
		array_int[0] = array_int[1];
		System.out.println(array_int[0]);
		System.out.println(array_int[1]);
		array_int[0][0] = 300;
		System.out.println(array_int[0][0]);
		System.out.println(array_int[1][0]);

		int[] s = new int[1];
		s = array_int[0];
		System.out.println(array_int[0]);
		System.out.println(s);

		array_int[0][1] = 100;
		// s[0] = 800;
		System.out.println(s[0]);

		// split �޼��� �����

		String texts = "hello world test count";
		String[] array_string = texts.split("\s");
		char[][] c_text = new char[array_string.length][];

		// char �ϳ��ϳ� �־��ֱ�
		for (int i = 0; i < array_string.length; i++) {
			c_text[i] = new char[array_string[i].length()]; // �� 1���迭�� ũ��(�ܾ� ����)�� �������ش�.
			for (int j = 0; j < array_string[i].length(); j++) {
				c_text[i][j] = array_string[i].charAt(j);
			}
		}

		// �ܾ� ��� - 2���� ���
		for (int i = 0; i < c_text.length; i++) {
			System.out.println(c_text[i]);
		}
		
		for (int i = 0; i < c_text.length; i++) {
			for (int j = 0; j < array_string[i].length(); j++) {
				System.out.print(c_text[i][j]);
			}
			System.out.println("");
		}
		
			
		
		
	}
}