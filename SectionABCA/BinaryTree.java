package SectionABCA;

import java.util.*;

public class BinaryTree {

	
	public static void bfs(TreeNode root) {
		
//		Stack<TreeNode> q= new Stack();
		
//		Queue<TreeNode> q2= new Queue();
		
		LinkedList<TreeNode> q= new LinkedList();
		
		q.add(root);
		while(q.size()>0) {
			
			int levelSize=q.size();
			for(int i=0; i<levelSize;i++) {
				// remove the first Node from Queue
				TreeNode rm= q.removeFirst();
				//work  on Remove Node
				if(i== 0) {
					System.out.print(rm.data+" ");
				}
				// add their children
				if(rm.left!=null) {
					q.add(rm.left);	
				}
				if(rm.right !=null) {
					q.add(rm.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void preOrder(TreeNode root) {
		
		 if(root==null) {
			 return;
		 }
		System.out.print(root.data+" ");
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
	public static void postOrder(TreeNode root) {
		
		 if(root==null) {
			 return;
		 }
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public static int countNodes(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		     
		int leftCount=countNodes(root.left);
		int rightCount= countNodes(root.right);
		int meraCount=leftCount+ rightCount+1;
		return meraCount;
		
	}
	
	public static int sumOfTree(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int leftSum= sumOfTree(root.left);
		int rightSum= sumOfTree(root.right);
		int meraSum= leftSum+rightSum+ root.data;
		return meraSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		TreeNode root=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		
		root.left=n2;
		root.right=n3;
		n2.right=n5;
		n2.left=n4;
		n3.left=n6;
//		bfs(root);
//		preOrder(root);
		System.out.println(sumOfTree(root));
		
	}

}
