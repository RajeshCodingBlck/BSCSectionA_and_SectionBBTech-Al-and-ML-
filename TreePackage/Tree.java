package TreePackage;

import java.util.*;

public class Tree {

	
	public static void preOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public static void Inorder(TreeNode root) {
		
		
		if(root==null) {
			return ;
		}
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
		
	}
	
	public static void postOrder(TreeNode root) {
		
		
		if(root==null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void bfs(TreeNode root) {
		
		 LinkedList<TreeNode> q= new LinkedList<TreeNode>();
		 
		 q.addLast(root);
		 while(q.size()>0) {
			 
			 // remove your first TreeNode from Queue
			 TreeNode rm= q.removeFirst();
			 
			 
			 // work on remove TreeNode
			 System.out.print(rm.data+ " ");
			 
			 // add their childrens
			 if(rm.left !=null) {
				 q.addLast(rm.left);
			 }
			 if(rm.right !=null) {
				 q.addLast(rm.right);
			 } 
		 }
		 
	}
	public static void main(String [] args) {
		
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		
		// Link
		n1.left= n2;
		n1.right=n3;
		
		n2.left=n4;
		n3.left=n5;
		
		bfs(n1);
//		preOrder(n1);
//		System.out.println();
//		System.out.println("...............");
//		Inorder(n1);
		
		
		
	}
}
