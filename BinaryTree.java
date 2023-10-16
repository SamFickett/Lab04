import org.w3c.dom.Node;

public class BinaryTree<Integer> {
	int data = 0;
	protected Node root;
	
	public void testPostOrder() {
		root = postOrder();
	}
	
	public void testPrintRight() {
		root = printRight();
	}
	
	public void testGreater(int item) {
		root = containsGreater(item);
	}
	
	public void testGetLevel(int item) {
		root = getLevel(item);
	}
	
	public void testEvenNumber() {
		root = countEvenNumber();
	}
	
	public void testFindSum() {
		root = findSum();
	}
}
