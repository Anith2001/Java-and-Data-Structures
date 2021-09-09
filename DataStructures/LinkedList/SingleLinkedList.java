import java.util.*;
class SingleLinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;
	void addNode(int data){
		Node newNode=new Node(data);
		if(head==null ||  tail==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	void display(){
		Node current=head;
		if(head==null){
			System.out.println("list is empty");
			return ;
		}
		System.out.println("Nodes of a single linked list");
		while(current!=null){
			System.out.println("Node: "+current.data);
			current=current.next;
		}
	}
	void insert(int pos,int t){
		Node newNode=new Node(t);
		if(pos==1){
			newNode.next=head;
			head=newNode;
		}
		else{
			int k=1;
			Node temp=head;
			Node current=head;
			while((k<pos) && (current!=null)){
				temp=current;
				current=current.next;
				k++;
			}
			temp.next=newNode;
			newNode.next=current;
		}
	}
	void delete(int pos){
		if(pos==1){
			Node temp=head;
			head=head.next;
			temp=null;
		}
		else{
			int k=1;
			Node temp=head;
			Node current=head;
			while((k<pos) && (current!=null)){
				temp=current;
				current=current.next;
				k++;
			}
			temp.next=current.next;
			current=null;
		}
	}
	void reverse(){
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SingleLinkedList sl=new SingleLinkedList();
		sl.addNode(1);
		sl.addNode(2);
		sl.addNode(3);
		sl.addNode(4);
		sl.addNode(5);
		// System.out.println("Before Insertion");
		// sl.display();
		// System.out.println("Enter the position you want to insert");
		// int pos=s.nextInt();
		// System.out.println("Enter the node to insert");
		// int t=s.nextInt();
		// sl.insert(pos,t);
		// System.out.println("After Insertion");
		// sl.display();
		sl.reverse();
		sl.display();
	}
}