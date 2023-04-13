package com.dal.array;
import com.dal.model.Employee;
import static java.lang.Math.*;

public class ArrayClass {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}

		for (int i : arr) {
			System.out.println(i);
		}

		Employee e1 = new Employee();
		e1.setName("Malar");
		Employee e2 = new Employee();
		e2.setName("Bala");

		Employee[] empArr = new Employee[2];

		empArr[0] = e1;
		empArr[1] = e2;

		for (Employee i : empArr) {
			System.out.println(i);
		}

		System.out.println(PI);
	}
}
