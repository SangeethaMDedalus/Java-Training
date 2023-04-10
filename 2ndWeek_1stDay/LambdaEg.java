package java8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaEg {
	public static void main(String[] args) {
		/* --using Java7 method call - without thread-- */
		/*Task task = new Task();
		task.connect();*/
		
		/* --using Java7 interface-- */
		//Runnable r = new MyTaskThread();
		//Thread t = new Thread(r);
		//t.start();
		
		/* --using Java7 anonymous Class-- */
		/*Runnable r = new Runnable() {
			@Override
			public void run() {				
				Task task = new Task();
				task.connect();
			}			
		};
		Thread t1 = new Thread(r);
		t1.start();*/
		
		
		/* --Using Java 8 with runnable interface-- */
		/*Runnable r = ()->  {			
			Task task = new Task();
			task.connect();			
		};
		Thread t1 = new Thread(r);
		t1.start();*/
		
		/*Using Java 8 direct thread class - Lambda expression*/
		/*Thread t1 = new Thread(()->{
				Task task = new Task();
				task.connect();});
		t1.start();*/
		
		/*Using Java 8 -  connect and start in same line*/
		//new Thread(()->{new Task().connect();}).start();
		
		/*Method reference - instead of lambda expression*/
		//new Thread(new Task():: connect).start();
		
		/* POJO */		
		 User u1 = new User(11,"Nilima","nilima@gmail.com"); User u2 = new
		  User(12,"Praveen","prav@gmail.com"); User u3 = new
		  User(13,"Aarika","arika@gmail.com");
		  
		 List<User> li = new ArrayList<User>(); 
		 li.add(u1); 
		 li.add(u2); 
		 li.add(u3);
		 System.out.println("User List :" + li);
		 /* Normal - while loop*/ 
		 Iterator<User> i = li.iterator(); 
		  while (i.hasNext()) {
		  System.out.println(i.next());
		  }
		
		  /*Lambda expression*/ 
		  li.forEach(lis->System.out.println(lis));
		  
		  /*Method reference*/
		  li.forEach(System.out::println);
		
	}

}
