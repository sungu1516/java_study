import java.util.ArrayList;

public class Gugudan{
	
	ArrayList<Gugudan_inner> list = new ArrayList<Gugudan_inner>();

	
	public void Gugudan_method() {
		
		for (int i = 2; i < 10; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i); // 이 때 만들어지는 객체 gugu를 의존객체라고 한다.
			list.add(gugudan);
			
			

		}
//		System.out.println(list.size());
//		System.out.println(list.get(0));

	}

	public void Gugudan_method(int n) {

		for (int i = n; i < 10; i++) {

			Gugudan_inner gugudan = new Gugudan_inner(i); // 이 때 만들어지는 객체 gugu를 의존객체라고 한다.
			
			list.add(gugudan);
//			System.out.println(list);
		}
	}
	
	public void Gugudan_method(int n, int m) {

		for (int i = n; i < m + 1; i++) {

			Gugudan_inner gugu = new Gugudan_inner(i); // 이 때 만들어지는 객체 gugu를 의존객체라고 한다.
			System.out.println("******************");
		}
	}
}
