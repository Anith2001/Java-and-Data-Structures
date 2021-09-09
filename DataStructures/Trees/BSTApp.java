import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
}
class BST{
	Node createNewNode(int key){
		Node node = new Node();
		node.data=key;
		node.left=null;
		node.right=null;
		return node;
	}
	Node insert(Node node,int key){
		if(node==null){
			return createNewNode(key);
		}
		if(key<node.data){
			node.left=insert(node.left,key);
		}
		else if(key>node.data){
			node.right=insert(node.right,key);
		}
		return node;
	}
	void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	void levelorder(Node root){
		if(root==null){
			return ;
		}
		Queue<Node>queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node node=queue.remove();
			System.out.print(node.data+" ");
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
	}
}
class BSTApp{
	public static void main(String[] args) {
		BST b=new BST();
		Node root=null;

		root=b.insert(root,50);
		root=b.insert(root,30);
		root=b.insert(root,20);
		root=b.insert(root,40);
		root=b.insert(root,70);
		root=b.insert(root,60);
		root=b.insert(root,80);
		//b.inorder(root);
		b.levelorder(root);
	}
}