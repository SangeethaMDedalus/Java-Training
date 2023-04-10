package java8;


interface Additionn {
	public int sum(int a, int b);
}

public class Java8FunctionalInterface {

	public static void main(String[] args) {
		//	Func_inter var=()->{}
		Additionn  sum=(a,b)->{
			return a+b;
		};
		System.out.println(sum.sum(8, 1));
	}

}