

public class countEmpty {
private IntTreeNode overallRoot;
	
	//pre: max >= 0 (throws IllegalArgumentException if not)
	//post: constructs a sequential tree with given number of 
	//nodes
	public void IntTree(int max) {
		if (max < 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		
		overallRoot = buildTree(1, max);
	}
	
	// post : returns a sequential tree with n as its root unless
	// 		  n is greater than max, in which case it returns an
	//		  empty tree
	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max),
								   buildTree(2 * n + 1,max));
		}
	}

	// post : prints the tree contents using a preorder traversal
	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}
	
	//post: prints in preorder the tree with given root
	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
			
			}
	
		}
	// post: prints the tree contents using an inorder traversal
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}
	
	//post: prints in inorder the tree with given root 
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	//post: prints the tree contents using a postorder traversal
	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();		
	
		}
	// post: prints in postorder the tree with given root
	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}
	
	
	//post: prints the tree contents, one per line, following an 
	//      inorder traversal and using indentation to indicate 
	// 		node depth; prints right to left so that it looks 
	//		correct when the output is rotated 
	public void printSideways() {
		printSideways(overallRoot, 0);
	}
	
	
	// post: prints in reversed preorder the tree with given
	//       root, indenting each line to the given level
	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("   ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
			
			}
	}


	public int countEmpty1()
	{
		return countEmpty1(overallRoot);
	}

	private int countEmpty1(IntTreeNode root)
	{
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
		{
			return 2 + countEmpty1(root.left) 
						+ countEmpty1(root.right);
		}
		else if(root.left == null || root.right == null)
		{
			return 1 + countEmpty1(root.left) 
						+ countEmpty1(root.right);
		}
		else
		{
			return countEmpty1(root.left) 
						+ countEmpty1(root.right);
		}
	}


	 public static void main(String[] args) {
	      IntTree t = new IntTree(6);
	      System.out.println("Tree Structure:");
	      t.printSideways();
	      System.out.println("Empty Branches:");
	      System.out.println(t.countEmpty1());
	      
	     
	    }

}









