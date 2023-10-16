/**
 * @author abigail pitcairn
 * @version 16 october 2023
 * 
 * implements public int countEvenNumber(): returns the number of nodes with even values
 * implements public int findSum(): returns the summation of values in the tree
 * overrides the testing method, provides a sample tree, and calls the two methods above 
 * and prints the output
 */
public class aggregateBT extends BinaryTree {

    /**
     * count the number of even numbers in the BinaryTree
     * @return number of even numbers
     */
    public int countEvenNumber(){
        Node localRoot = root;
        if (localRoot == null)
            return 0;
        if (localRoot.data % 2 = 0)
            return 1;
        return countEvenNumer(localRoot.right) + countEvenNumber(localRoot.left);
    }

    /**
     * sum all the data in the BinaryTree
     * @return the sum
     */
    public int findSum(){
        Node localRoot = root;
        if (localRoot == null)
            return 0;
        return findSum(localRoot.right.data) + findSum(localRoot.left.data);
    }

    /**
     * testing for countEvenNumber and findSum
     */
    @Override
    public void testing(){
        BinaryTree testTree = new BinaryTree();
        Node node = new Node;
        testTree.root = node;
        root.data = 4;
        root.left = new Node;
        root.left.data = 5;
        root.right = new Node;
        root.right.data = 6;
        System.out.println("Testing Count Even Number: ");
        System.out.println("Expected: 2    Returned: " + countEvenNumber());
        System.out.println("Testing Find Sum: ");
        System.out.println("Expected: 15    Returned: " + findSum());
    }

}