package org.prog;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesInList {
	public static void main(String[] args) {
		int[] li = new int[7];
		li[0] = 1;
		li[1] = 2;
		li[2] = 3;
		li[3] = 3;
		li[4] = 4;
		li[5] = 4;
		li[6] = 5;

		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < li.length; i++) {
			s.add(li[i]);
		}
			for (Integer dup : s) {
				System.out.println(dup);
			}
		}
}
