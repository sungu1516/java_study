package JtoJ;

public class Array {

	public static void main(String[] args) {
		// �迭�� ������. 
		
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};

		
		// �ٸ� ������� ������ - �ʱⰪ ���� ������
		
		String[] Weeks = new String[3];
		Weeks[0] = "��";
		Weeks[1] = "ȭ";
		Weeks[2] = "��";
		
		// �迭���� �����غ���
		
		//System.out.println(weeks[3]);
		
		// for���� �̿��Ͽ� weeks�� ��� ���ϵ��� ����غ���
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}

}