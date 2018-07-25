package com.sinansamast;

public class NodeBasedStackApp {

	public static void main(String[] args) {
		NodeBasedStack stack = new NodeBasedStack();
		stack.push("Bir");
		stack.push("�ki");
		stack.push("��");

		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			// System.out.println(stack.pop()); // will crash here
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
