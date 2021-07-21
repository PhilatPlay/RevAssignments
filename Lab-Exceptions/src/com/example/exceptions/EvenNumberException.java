package com.example.exceptions;

public class EvenNumberException extends Exception {
	@override
	public String getMessage() {
		return "You cannot input an even number; input odd numbers only.";	
	}
}
