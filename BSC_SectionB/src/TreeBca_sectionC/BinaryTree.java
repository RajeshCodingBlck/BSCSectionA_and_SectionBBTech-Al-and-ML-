package TreeBca_sectionC;

public class BinaryTree {

	
	public static void preOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);	
		
	}
	
	public static void inOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
	
	public static int countNodes(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int leftCount=countNodes(root.left);
		int rightCount=countNodes(root.right);
		
		int myCount= leftCount+rightCount+1;
		return myCount;
		
	}
	
	public static int sumOfNodes(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		
		int leftSum= sumOfNodes(root.left);
		int rightSum=sumOfNodes(root.right);
		
		int meraSum=leftSum+rightSum+root.data;
		return meraSum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		TreeNode root= new TreeNode(1);
		TreeNode n2= new TreeNode(2);
		TreeNode n3= new TreeNode(3);
		TreeNode n4= new TreeNode(4);
		TreeNode n5= new TreeNode(5);
		
		root.left=n2;
		root.right=n3;
		n2.left=n4;
		n2.right=n5;
//		preOrder(root);
//		System.out.println("........");
//		System.out.println(countNodes(root));
		System.out.println(sumOfNodes(root));
		
	}

}
