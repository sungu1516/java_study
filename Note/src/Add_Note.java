
public class Add_Note {

	public static void main(String[] args) {
		Gugudan gugu = new Gugudan(); // ��ü gugu�� Gugudan Ŭ���� �ȿ� �ִ� ��� �޼���� ������ ����� �� ����. ������.
		gugu.Gugudan_method(8);
//		System.out.println(gugu.list);
//		System.out.println(gugu.list.get(0).array_string[0]);
		
		for (int i = 0; i < gugu.list.size(); i++) {
			System.out.println(gugu.list.size());
			for (int j = 0; j < gugu.list.get(i).array_string.length; j++) {
				System.out.println(gugu.list.get(i).array_string[j]);
			}
			System.out.println("***************");
		}
		
		
		//gugu.Gugudan_method(3, 7);
	}	

}