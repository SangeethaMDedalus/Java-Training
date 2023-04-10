package com.dal;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.io.*;

import com.dal.EmployeeController.EmployeeController;
import com.dal.model.Employee;
import com.dal.Exception.UserNotFoundException;

public class MainClass {
	static int x = 9; // Class variable
	static int z = 109; // Class variable

	public static void main(String[] args) throws IOException {
		//int x = 100; // Static variable
		/*
		 * System.out.println("---variable instatiation(Static Variable)---");
		 * System.out.println("Hi" + x);
		 * System.out.println("---variable instatiation (Class Variable)---");
		 * System.out.println(z); MainClass mc = new MainClass();
		 * System.out.println(mc.z); System.out.println("--Object instatiation---");
		 * Employee emp = new Employee(); emp.setEid(10001);
		 * emp.setName("Sangeetha MuthuKumaraswamy"); System.out.println(emp.getEid());
		 * System.out.println(emp.getName());
		 */

		/*
		 * System.out.println("---Dynamic variable---"); Employee dynamicemp = new
		 * Employee(); Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter Eid"); int id =sc.nextInt(); dynamicemp.setEid(id);
		 * System.out.println("Enter EName"); String name =sc.next();
		 * dynamicemp.setName(name); System.out.println(dynamicemp.getEid());
		 * System.out.println(dynamicemp.getName());
		 * 
		 * System.out.println(dynamicemp);
		 * 
		 */
		System.out.println("--MVC--");
		EmployeeController ec = new EmployeeController();
		System.out.println("--WELCOME--");
		// ec.addEmployee();
		// ec.viewEmployee();
		System.out.println("--Switch case/ Do While--");
		Scanner sc = new Scanner(System.in);
		String choice = null;
		try {
			String uname = null;
			String pwd = null;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username:");
			uname = br.readLine();
			System.out.println("Enter password:");
			pwd = br.readLine();
			BiPredicate<String, String> p = (txt1,txt2) -> txt1.equals(txt2);
			if (p.test(uname,"sangee") && p.test(pwd, "pass")) {
				System.out.println("Welcome " + uname);
				do {
					System.out.println("Enter your choice");
					System.out.println("1.Add Employee");
					System.out.println("2.View Employee");
					System.out.println("3.Serialisation");
					System.out.println("4.Deserialisation");
					System.out.println("5. Sort Emp by ID");
					System.out.println("6. Sort by Emp name");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						ec.addEmployee();
						break;
					}
					case 2: {
						ec.viewEmployee();
						break;
					}
					case 3: {

						FileOutputStream fos = new FileOutputStream("dedalus.txt");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(ec);
						System.out.println("Serilized to file dedalus.txt");
						oos.close();
						fos.close();
						break;
					}
					case 4: {
						try {

							FileInputStream fis = new FileInputStream("dedalus.txt");
							ObjectInputStream ois = new ObjectInputStream(fis);
							EmployeeController emp = (EmployeeController) ois.readObject();
							System.out.println(emp.getEmployeeName());
							System.out.println("DeSerilized from file dedalus.txt");
							ois.close();
							fis.close();
						} catch (FileNotFoundException fnf) {
							System.out.println("No file");
						} catch (ClassNotFoundException cnf) {
							System.out.println("No Emp class");
						}
						break;
					}
					case 5:{
						ec.sortByEid();
						break;
					}
					case 6:{
						ec.sortByEname();
						break;
					}
					default: {
						System.out.println("Enter right choice");
						break;
					}
					}
					System.out.println("Do u want to continue Y or y");
					choice = sc.next();
				} while (choice.equals("Y") || choice.equals("y"));
				System.out.println("Exited");
				System.exit(0);
			} else {
				throw new UserNotFoundException();

			}
		} catch (UserNotFoundException unf) {
			System.out.println(unf);
		}

	}

}
