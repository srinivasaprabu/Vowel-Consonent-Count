package org.prabu.com;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Voelconsonentproblem {

	public static void main(String[] args) {
		String org = "I am a king";
		/*
		 * I- vowel 1, am- vowel 1, a- vowel 1, king- consonant 1 
		 * calculation
		 * (5*no.of.consonant)+(3*no.of.vowels)
		 * (5*1)+(3*3)=14
		 */
		String org1 = "We are human";
		String org2="Hello";
		method(org);
		method(org1);

	}

	public static void method(String org) {
		int hard = 1;
		int easy = 1;
		HashMap<String, Integer> hm = new HashMap<>();
		StringTokenizer st = new StringTokenizer(org);
		while (st.hasMoreTokens()) {
			if (countconsonentvowel(st.nextToken()) == 5) {
				hm.put("hard", hard++);
			} else {
				hm.put("easy", easy++);
			}
		}

		if (hm.get("hard") == null) {
			hard = 0;
		} else {
			hard = Integer.parseInt(hm.get("hard").toString());
		}
		if (hm.get("easy") == null) {
			easy = 0;
		} else {
			easy = Integer.parseInt(hm.get("easy").toString());
		}
		System.out.println((5 * hard) + (3 * easy));

	}

	public static boolean vowels(char ch) {
		return ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o')
				|| (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I')
				|| (ch == 'O') || (ch == 'U'));
	}

	public static int countconsonentvowel(String str) {
		int vowel = 0;
		int consonent = 0;
		int hard = 0;
		int easy = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) != ' ') && (vowels(str.charAt(i)))) {
				vowel++;
			} else if (str.charAt(i) != ' ') {
				consonent++;
			}

		}

		if (consonent > vowel || consonent == 4) {
			hard++;
		} else {
			easy++;
		}
		int res = (5 * hard) + (3 * easy);
		return res;
	}
}
