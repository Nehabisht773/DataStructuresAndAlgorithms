package com.Oracle;

public class DiameterOfBinaryTree {
	Node root;
	public static void main(String [] args) {
		DiameterOfBinaryTree tree=  new DiameterOfBinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(5);
		tree.root.right=new Node(10);
		tree.root.left.left=new Node(12);
		tree.root.left.right=new Node(18);
		tree.root.left.left.left=new Node(18);
		System.out.println("The Diameter of the tree is " + tree.diameter());
	}
	
		
		int diameter(Node root) {
			if (root==null)
				return 0;
			int rh=height(root.left);
			int lh=height(root.right);
			int ld= diameter(root.left);
			int rd=diameter(root.right);
			return Math.max(lh+rh+1, Math.max(ld, rd));
		}
	
		int diameter() {
			return diameter(root);
		}
		
		static int height(Node node) {
			if(node==null)
				return 0;
		return(1+Math.max(height(node.left),height(node.right)));
		 
		}
}

class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		right=left=null;
	}
	}
