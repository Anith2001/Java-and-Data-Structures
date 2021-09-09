class Node{
	int data;
	Node left;
	Node right;
}
class ThirdLevel{
	static int current=1;
	static void kthLevel(Node root,int k){
		if(root==null){
			return ;
		}
		if(current++ ==k){
			System.out.println("node: "+root.data);
			return ;
		}
		 kthLevel(root.left,k);
		 kthLevel(root.right,k);
	}
	public static void main(String[] args) {
		root=b.insert(root,50);
		root=b.insert(root,30);
		root=b.insert(root,20);
		root=b.insert(root,40);
		root=b.insert(root,70);
		root=b.insert(root,60);
		root=b.insert(root,80);
	}
}