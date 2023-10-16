/**
 * @author abigail pitcairn
 * Subtask 3: Create class aggregateBT that extends BrinaryTree class. Inside this class, implement
 * two recursive methods:
 * 1. public int countEvenNumber(): returns the number of nodes with even values
 * 2. public int findSum(): returns the summation of values in the tree
 * Override the testing method, provide a sample tree, and call the two methods above in this
 * method and print the output
 */
public class aggregateBT extends BinaryTree {

    public int countEvenNumber(){
        Node localRoot = root;
        if (localRoot == null)
            return 0;
        if (localRoot.data % 2 = 0)
            return 1;
        return countEvenNumer(localRoot.right) + countEvenNumber(localRoot.left);
    }

    public int findSum(){
        Node localRoot = root;
        if (localRoot == null)
            return 0;
        return findSum(localRoot.right.data) + findSum(localRoot.left.data);
    }
    

}