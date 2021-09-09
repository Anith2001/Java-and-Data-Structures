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
	void preorder(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	void postorder(Node root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
class TreeTraversal{
	public static void main(String args[]){
		BST b=new BST();
		Node root=null;
		root=b.insert(root,50);
		root=b.insert(root,30);
		root=b.insert(root,20);
		root=b.insert(root,40);
		root=b.insert(root,70);
		root=b.insert(root,60);
		root=b.insert(root,80);
		System.out.println("preorder traversal");
		b.preorder(root);
		System.out.println();
		System.out.println("inorder traversal");
		b.inorder(root);
		System.out.println();
		System.out.println("postorder traversal");
		b.postorder(root);
	}
}