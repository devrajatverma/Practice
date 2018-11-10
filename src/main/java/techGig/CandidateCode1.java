package techGig;/*package techGig;

import java.util.LinkedList;
import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class CandidateCode1 {
	// Root of the Binary Tree
	Node root;

	 Function to get the count of leaf nodes in a binary tree 
	int getLeafCount() {
		return getLeafCount(root);
	}

	int getLeafCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}
	
	void LevelOrder(int n) {

		LinkedList<Node> Q = new LinkedList<Node>();
		
		Q.add(root);  
		int i=1;
		while(!Q.isEmpty() && i<n) {
			Node current = Q.poll();
			
			if(current.left != null) Q.add(current.left);
			if(current.right != null) Q.add(current.right);
			i++;
		}
		
		Node target = Q.poll();
		if(n%2==0)
			target.right=null;
		else
			target.left=null;
	}

	public static void main(String[] args) {
		CandidateCode1 first = new CandidateCode1();

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int n=N;

		first.root = new Node(sc.nextInt());
		n--;
		Node traversal = first.root;
		boolean insertLeft = true;
		while (n > 0) {
			if (insertLeft) {
				traversal.left = new Node(sc.nextInt());
				insertLeft = false;
			} else {
				traversal.right = new Node(sc.nextInt());
				insertLeft = true;
			}
			n--;
		}
		
		int deleteAt = sc.nextInt();
		if(deleteAt==0) {
			System.out.println(0);
			sc.close();
			return;
		}
		else if(deleteAt>N) {
			System.out.println(first.getLeafCount());
			sc.close();
			return;
		}
		else {
			first.LevelOrder(deleteAt);
		}
		System.out.println(first.getLeafCount());
		sc.close();
	}

}
*/