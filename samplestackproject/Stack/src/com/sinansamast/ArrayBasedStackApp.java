package com.sinansamast;

public class ArrayBasedStackApp {

	public static void main(String[] args) {
		
		
		ArrayBasedStack stack = new ArrayBasedStack(10);
		try {
			//System.out.println(stack.pop());// will crash here
			stack.push("One");
			stack.push("Two");
			stack.push("Three");
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			//System.out.println(stack.pop());// will crash here
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
