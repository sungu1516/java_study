
public class B {

	public int number = 100;

	public B() {
		System.out.println("B�� �⺻ �������Դϴ�.");
	}

	// custom �����ڸ� ������

//	public B(int i) {
//		System.out.println("b�� Ŀ���� ������ : " + i); // �Է°��� �״�� �����ִ� ������ �Լ�
	
	public B(int n) {
		this.number = n;
		System.out.println("number���� ����Ǿ����ϴ�."); 
	}

	
	
	public B(String j) {
		System.out.println("b�� Ŀ���� ������ : " + j); // �Է°��� �״�� �����ִ� ������ �Լ�

	}
	
}