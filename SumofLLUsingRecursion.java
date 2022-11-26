package recursion;

public class SumofLLUsingRecursion {
	
	static int sum = 0;
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node head = null;
		
		head = add(head, 7);
		head = add(head, 10);
		head = add(head, 13);
		head = add(head, 5);
		
		System.out.println("sum: "+sum(head));
	}
	
	private static Node add(Node head, int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;
		
		head = newNode;
		return head;
	}
	
	private static int sum(Node head) {
		if(head == null)
			return 0;
		
		sum(head.next);
		
		sum = sum + head.data;
		
		return sum;		
	}

}
