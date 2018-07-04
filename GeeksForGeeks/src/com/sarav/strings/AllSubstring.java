package com.sarav.strings;

import java.util.ArrayList;
import java.util.List;

public class AllSubstring {

	public static void main(String[] args) {
		String s = "abcd";
		AllSubString(s);
	}

	public static void AllSubString(String s) {
		List<String> subStringList = new ArrayList<String>();
		for (int i = 0; i <= s.length(); i++) {
			String subs = "";
			if (s.length() != 1) {
				if (i != s.length()) {
					subs = s.substring(0, i + 1);
					subStringList.add(subs);
				} else {
					s = s.substring(1, s.length());
					i = 0;
					subs = s.substring(0, i + 1);
					subStringList.add(subs);
				}

				System.out.println(subs);
			} else {
				break;
			}
		}

	}

}
