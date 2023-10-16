import org.w3c.dom.Node;

public class BTPrinting extends BinaryTree{

	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(Node node) {
		if(node == null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data);
	}
	
	public void printRight() {
		postOrder(root);
	}
	public void printRight(Node node) {
		System.out.print(node.data);
		printRight(node.right);
	}

	@Override
	public void test() {
	BinaryTree binTree = new BinaryTree;
	binTree.root = Node<E> node;
	binTree.root.data = 2;
	binTree.root.left = Node node1;
	binTree.root.right = Node node2;
	binTree.root.left.data = 1;
	binTree.root.right.data = 3;
	binTree.printRight();
	binTree.postOrder();
		
		
	}
	
}
