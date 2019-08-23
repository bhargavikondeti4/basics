package com.basics.tree;

import com.basics.tree.Tree.Node;

/**
 * https://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/
 * Take away is don't always think recursively
 * Sometimes iteration gives way simpler solutions
 * @author ashu
 *
 */
public class InorderSuccessor {

	private static Node root = new Node();
    public static void main(String args[]) {
        Tree t = new Tree();
        t.add(root, 25);
        t.add(root, 15);
        t.add(root, 35);
        t.add(root, 28);
        t.add(root, 20);
        t.add(root, 18);
        t.trav(root);
        System.out.println("**********************");
        Node i = ins(root, 20);
        System.out.println(i.data);
    }
    
	private static Node ins(Node p, int d) {
		Node q = p, succ = null;
		while (q != null) {
			if (d < q.data) {
				succ = q;
				q = q.left;
			} else if (d > q.data) {
				q = q.right;
			} else {
				if (q.right != null) {
					return min(q.right);
				}
				break;
			}
		}
		return succ;
	}

	private static Node min(Node p) {
		while (p.left != null) p = p.left;
		return p;
	}

}