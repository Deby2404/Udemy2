package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('a');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowercaseAlphabets();
		MyChar.printUppercaseAlphabets();
		
	}

}
