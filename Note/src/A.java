
public class A extends B {
	B b;
	
	public A(int n) {
		super(n);
		b = new B(); // �̸� ���� ��ü��� �Ѵ�.
		B b2 = new B();
	}
	
	public A() {
		super(); // ���� ������� �ʾƵ� B�� �⺻ �����ڴ� ȣ���� �ȴ�!
		
		System.out.println("A�� �⺻ �������Դϴ�.");
	}
}