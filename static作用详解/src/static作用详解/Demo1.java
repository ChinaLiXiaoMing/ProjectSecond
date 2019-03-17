package static×÷ÓÃÏê½â;

public class Demo1 {
	 
	
	public void bbb() {
		new Function().aaa();
		
	}
	
	public static void hhh(Function f) {
	
		int e	=new Function().c;
		//Function.aaa();
		int a = Function.a;
		int c = f.c;
		int a2 = f.a;
		//f.aaa();
		System.out.println(e);
		System.out.println(Function.aaa());
		System.out.println(a);
		System.out.println(c);
		System.out.println(a2);
		System.out.println(f.aaa());
	}
	public static void main(String[] arg0) {
		Function function = new Function();
		hhh(function);
	}
}
