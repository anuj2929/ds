package graph;

class Node{
	int val;
	Node prev;
	Node next;
	Node addNode(int value){
		Node n=new Node();
		n.val=value;
		n.prev=n.next=null;
		return n;
	}
}
public class LinkedListImpl {
	public static void main(String[] args) {
		Node root=new Node();
		Node n=new Node();
		root=n.addNode(10);
		root.next=n.addNode(4);
		root.next.prev=n.next;
		
	}
	
	
}
