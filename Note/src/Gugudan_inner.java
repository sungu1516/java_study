import java.util.ArrayList;

public class Gugudan_inner {

	String[] array_string = new String[9];
	
	public Gugudan_inner(int n) {
		for (int i = 1; i < 10; i++) {
//			System.out.println(n + "*" + i);  
			String s = String.format("%d * %d = %d \n", n, i, n * i);
			array_string[i-1] = s;
			//System.out.println(s);
		}
	}
} 
