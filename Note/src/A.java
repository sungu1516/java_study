
public class A extends B {
	B b;
	
	public A(int n) {
		super(n);
		b = new B(); // 이를 의존 객체라고 한다.
		B b2 = new B();
	}
	
	public A() {
		super(); // 굳이 선언되지 않아도 B의 기본 생성자는 호출이 된다!
		
		System.out.println("A의 기본 생성자입니다.");
	}
}
