package java8;

interface Addition{
	public int add(int a,int b);
}
public class Java7Normal implements Addition{
	
	@Override
	public int add(int a, int b) {
	
		return a+b;
	}
	public static void main(String[] args) {
		Java7Normal f = new Java7Normal();
		
		System.out.println(f.add(4, 5));

	}

	
}