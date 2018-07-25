package com.sinansamast;

public class ArrayBasedStack {

	String[] stack;
	int size;
	int top = -1;

	public ArrayBasedStack(int size) {
		this.size = size;
		stack = new String[size];
	}

	public void push(String value) throws Exception {
		if (top < size - 1) {
			top++;
			stack[top] = value;
		} else {
			throw new Exception("Stack is full");
		}
	}

	public String pop() throws Exception {
		if (top > -1) {
			top--;
			return stack[top + 1];
		} else {
			throw new Exception("Stack is empty");
		}
	}

}
