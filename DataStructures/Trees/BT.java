import java.util.*;
class BT{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	static Node root;

	static void insert(Node node,int key){
		if(node==null){
			root=new Node(key);
			return ;
		}
		Queue<Node>q=new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			node=q.remove();
			if(node.left==null){
				node.left=new Node(key);
				break;
			}
			else{
				q.add(node.left);
			}
			if(node.right==null){
				node.right=new Node(key);
				break;
			}
			else{
				q.add(node.right);
			}
		}
	}
	static void inorder(Node node){
		if(node==null){
			return ;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}

	static int getMaximum(Node node){
		if(node==null){
			return Integer.MIN_VALUE;
		}
		int curr_node_value=node.data;
		int left=getMaximum(node.left);
		int right=getMaximum(node.right);
		return Math.max(Math.max(left,right),curr_node_value);
	}

	static int getMinimum(Node node){
		if(node==null){
			return Integer.MAX_VALUE;
		}
		int curr_node_value=node.data;
		int left=getMinimum(node.left);
		int right=getMinimum(node.right);
		return Math.min(Math.min(left,right),curr_node_value);
	}

	static int sumOfElementsInBTree(Node root) {
        if (root == null){
            return 0;
        }
		else{
			return(root.data + sumOfElementsInBTree(root.left) + sumOfElementsInBTree(root.right));
		}
    }

	public static void main(String[] args) {
		root=new Node(10);
		insert(root, 11);
		insert(root, 7);
		insert(root, 9);
		insert(root, 15);
		insert(root, 8);
		insert(root, 12);

		inorder(root);
		System.out.println();
		System.out.println("Minumum value in binary tree: "+getMinimum(root));
		System.out.println("Maximum value in binary tree: "+getMaximum(root));
		System.out.println("sum of elements in binary tree: "+sumOfElementsInBTree(root));
	}
}