package day0416;

import java.util.TreeSet;

public class A implements Comparable<A>{
	
	int count;
	String str;
	
	@Override
	public int compareTo(A o) {
		System.out.println(o.count + "�� ���ؼ� ����"); // Ŭ������ ���� ������� ��ü�� set�� �߰��� �� �����
		if (this.count < o.count) { // ������������ ������ �غ���. 
			System.out.println("test : " + this.count);
			return 1;
		}else {
			return -1;
		}
	}
	
//	@Override
//	public int compareTo(A o) {
//		// TODO Auto-generated method stub
//	
//		return str.compareTo(o.str); // ���ڿ� ����
//	}
	
}