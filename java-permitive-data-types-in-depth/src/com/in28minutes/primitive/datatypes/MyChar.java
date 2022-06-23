package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// a e i o u or A E I O U
		if (Character.toUpperCase(ch) == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		  return true;
		
		return false;
	}

	public boolean isDigit() {
		if(ch >= 48 && ch <= 57) //between 0 and 9
		  return true;
		
		return false;
	}

	public boolean isAlphabet() {
		if(ch  >= 97 && ch <= 122) //between a and z
		  return true;
		if(ch  >= 65 && ch <= 90) //between A and Z
			return true;
		
	return false;	
	}

	public boolean isConsonant() {
		// Alpabet and it is not Vowel
		if (isAlphabet() && !isVowel())
		  return true;
		
		return false;
	}

	public static void printLowercaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		
	}

	public static void printUppercaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
		
	}

}
