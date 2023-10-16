/**
 * 
 */

/**
 * @author abduladdan
 *
 */
public class searchBT extends BinaryTree {

	public searchBT(int item) {
		super();

	}

	public boolean containsGreater(int item) {
		return this.containsGreaterRecursive(this, item);

	}

	public boolean containsGreaterRecursive(BinaryTree node, int item) {
		if (node == null)
			return false;
		else {
			return true;
		}

	}

	public int getLevel(int item) {
		return this.getLevelRecursive(this, item);

	}

	private int getLevelRecursive(BinaryTree node, int item) {
		if (node == null)
			return -1;
		
  } {	if (node.data == null)
			return level;

		{

		}
	}
}
