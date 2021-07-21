package com.example.exceptions;

import java.util.Scanner;

public class Simulation {
	
	public static void main(String[] args) {	
            getInput();
	}
	
	public static void getInput(){
		Scanner in = new Scanner(System.in);
		
		// get input
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed:" + line);
		
		// testing for even number 
		if (isEven(line)) {
			try {
                throw new EvenNumberException();
            }catch (EvenNumberException e) {
                e.printStackTrace();
            }finally {
                in.close();
            }		
		}
		
		// close resources
		in.close();		
	}
	
		public static boolean isEven(String num) {
			// conversion
			int value = Integer.parseInt(num);
					return (value % 2 == 0);
	}
}
