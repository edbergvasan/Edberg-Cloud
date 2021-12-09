package org.prog;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Integer>  fib(int n) {

		List<Integer> li = new ArrayList<>();
		int n1 = 0;
		int n2 = 1;
		if (n>= 1) {
			li.add(n1);

		}
		if (n>= 2) {
			li.add(n2);

		}
		int n3 = 0;
		for (int i = 0; i <= 5; i++) {
			n3 = n1 + n2;
			li.add(n3);
			n1 = n2;
			n2 = n3;

		}
		return li;		

	}
	
	public static void main(String[] args) {
		List<Integer> li=fib(5);
		System.out.println(li);
	}

}
