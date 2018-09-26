//Credit goes to: https://www.geeksforgeeks.org/linked-list-set-1-introduction/
public class LinkedList {

	Node head;  //head of list
	
	/* linked list node. This inner class is so main() can access it.*/
	static class Node {
		int data;
		Node next;
		Node (int d) { data = d; next = null; } //Constructor
	}
	
	/*Print contents of linked list */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) {
		/*Start with the empty list. */
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(4);
		Node second = new Node(5);
		Node third = new Node(6);
		
		/*Link first node with the second node*/
		llist.head.next = second;
		
		/*Link second node with the third node*/
		second.next = third;
		
		llist.printList();		
		
	}

}
