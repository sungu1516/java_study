package JtoJ;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// List�� ���� �˾ƺ���. ���� Array�� �ٸ��� �ڷ������� ���еǸ�, �迭�� �ٸ��� ũ�Ⱑ ���������� �ʴ�. 
		// List�� �ڷ����� ���������� �ִµ�, �� �� ���� ������ ArrayList�� ���� �˾ƺ���.
		
		ArrayList pitches = new ArrayList();
		pitches.add(138);
		pitches.add(140);
		pitches.add(150);
		pitches.add(0, 133);
		
		// get�� ���� Ư�� �� ��������
		System.out.println(pitches.get(0));
		
		// size�� ���� ũ�� ���
		System.out.println(pitches.size());
		
		// contain�� ���� Ư�� ���� �ִ��� �Ǻ�
		
		System.out.println(pitches.contains(140));
	}

}