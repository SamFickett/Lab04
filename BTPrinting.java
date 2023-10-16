import org.w3c.dom.Node;

public class BTPrinting extends BinaryTree<Integer>{

	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(Node<E> node) {
		if(node == null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data);
	}
	
	public void printRight() {
		postOrder(root);
	}
	public void printRight(Node<E> node) {
		System.out.print(node.data);
		printRight(node.right);
	}
	
}
