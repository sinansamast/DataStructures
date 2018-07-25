package com.sinansamast;

public class NodeBasedStack {

	private Node top;

	public NodeBasedStack() {
	}

	public void push(String value) {
		if (top == null) {
			top = new Node();
			top.setValue(value);
		} else {
			Node temp = new Node();
			temp.setValue(value);
			temp.setPrevious(top);
			top = temp;
		}

	}

	public String pop() throws Exception {
		if (top == null) {
			throw new Exception("Stack is empty");
		}
		Node temp = top;
		top = temp.getPrevious();
		return temp.getValue();
	}

}
