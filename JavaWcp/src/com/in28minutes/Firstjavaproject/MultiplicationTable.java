package com.in28minutes.Firstjavaproject;

public class MultiplicationTable {
	void print() {

		for(int i = 1; i<=10; i++) {
			print(5);
		}	
	}    
		void print(int table) {
			print(table, 1, 10);
			
		}
			void print(int table, int from, int to) {

				for(int i = from; i<=to; i++) {
					System.out.printf("%d * %d = %d", table, i, table * i).println();
			}
	}
}

