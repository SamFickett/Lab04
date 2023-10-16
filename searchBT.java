

// Abdul Addan Subtask 2
public class searchBT extends BinaryTree {

    // Method to check if there is an item greater than the provided item in the tree
    public boolean containsGreater(int item) {
        return containsGreater(root, item);
    }

    private boolean containsGreater(Node node, int item) {
        // Base case
        if (node == null) {
            return false;
        }

        // Check if the current node's data is greater than the item
        if (node.data > item) {
            return true;
        }

        // Recursively check the left and right subtrees
        return containsGreater(node.left, item) || containsGreater(node.right, item);
    }

    // Method to find the level of a given item in the tree
    public int getLevel(int item) {
        return getLevel(root, item, 1);
    }

    private int getLevel(Node node, int item, int level) {
        // Base case
        if (node == null) {
            return -1;
        }

        // If the item is found, return the level
        if (node.data == item) {
            return level;
        }

        // If the item is present in the left subtree, return its level
        int leftLevel = getLevel(node.left, item, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }

        // If the item is present in the right subtree, return its level
        return getLevel(node.right, item, level + 1);
    }
}
