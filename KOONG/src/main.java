
public class main {

	public static void main(String[] args) {
		plus ps= new plus();
		minus mn = new minus();
		mul mu = new mul();
		div di = new div();
		
		int a = 10;
		int b = 10;

		System.out.println(ps.plus_go(a, b));
		System.out.println(mu.mul_go(a, b));
		System.out.println(di.div(a, b));
		System.out.println(mn.minus(a, b));
	
	}

}
