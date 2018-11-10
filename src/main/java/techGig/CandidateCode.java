package techGig;

import java.util.Scanner;
import java.util.TreeMap;

class TreeNode implements Comparable<TreeNode> {

	int gifts, val;
	TreeNode left, right;

	public TreeNode(int v) {
		val = v;
	}

	@Override
	public int compareTo(TreeNode o) {
		return Integer.compare(gifts, o.gifts);
	}
}
public class CandidateCode {

	static void traverse(TreeNode a, TreeNode b) {

		while (a.val != b.val) {
			a.gifts++;
			if (b.val < a.val) {
				a = a.left;
			} else {
				a = a.right;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		TreeMap<Integer, TreeNode> map = new TreeMap<>();

		for (int i = 1; i <= N; i++) {
			TreeNode node = new TreeNode(i);
			map.put(node.val, node);
		}

		// making links
		for (int i = 1; i < N; i++) {
			
			TreeNode uNode, vNode;
			uNode = map.get(sc.nextInt());
			vNode = map.get(sc.nextInt());
			if (vNode.val < uNode.val && uNode.left == null) {
				uNode.left = vNode;
			} else {
				uNode.right = vNode;
				
			}

		}

		for (int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			TreeNode from = map.get(a), to = map.get(b);
			traverse(from, to);
		}

		System.out.println(map.lastEntry().getValue().gifts);
	}

}
