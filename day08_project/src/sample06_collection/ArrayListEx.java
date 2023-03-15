package sample06_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {

			System.out.print("이름을 입력하세요 >> ");
			String s = sc.next();
			al.add(s);
		}

		for (int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			System.out.print(name + " ");
		}

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		int longestIndex = 0;

		for (int i = 1; i < al.size(); i++) {

			if (al.get(longestIndex).length() < al.get(i).length()) {
				longestIndex = i;
			}

		}
		System.out.println("\n가장 긴 이름은 : " + al.get(longestIndex));

	}

}
