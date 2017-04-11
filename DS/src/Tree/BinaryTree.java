package Tree;

class Node{
	int value;
	Node left,right;
	Node(int d){
		value=d;
		left=right=null;
	}
	int calHeight(Node node){
		if(node==null){
			return 0;
		}else{
			int lheight=calHeight(node.left);
			int rheight=calHeight(node.right);
			if(lheight>rheight){
				return (lheight+1);
			}else{
				return (rheight+1);
			}
		}
	}
}
public class BinaryTree {
	Node root;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println(tree.root.calHeight(tree.root));
	}
}
