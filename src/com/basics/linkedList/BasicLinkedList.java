package com.basics.linkedList;

/**
 * Simple implementation of linkedlist
 * @author ashu
 *
 */
public class BasicLinkedList {

	private static Node s = null;
	public static void main(String args[]) {
		add(s, 1);
		add(s, 2);
		add(s, 3);
		add(s, 4);
		trav();
	}
	
	private static void trav() {
		Node p = s;
		while (p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}

	private static void add(Node p, int d) {
		Node temp = new Node(d);
		if (s == null) {
			s = temp;
		} else {
			Node q = s;
			while (q.next != null) {
				q = q.next;
			}
			q.next = temp;
		}
	}

	private static class Node {
		int data;
		Node next;
		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
}