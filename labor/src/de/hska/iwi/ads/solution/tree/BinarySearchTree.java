package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {

	public V get(Object o) {
		if (root == null) {
			return null;
		} else {
			return getRecursive(root, o);
		}
	}

	private V getRecursive(Node node, Object o) {
		if (node == null) {
			return null;
		}

		K key = (K) o;
		int cmp = key.compareTo(node.entry.getKey());

		if (cmp < 0) {
			return getRecursive(node.left, key);
		} else if (cmp > 0) {
			return getRecursive(node.right, key);
		} else {
			return node.entry.getValue();
		}
	}

	public V put(K key, V value) {
		if (root == null) {
			root = new Node(key, value);
			size++;
			return null;
		} else {
			return putRecursive(root, key, value);
		}
	}

	private V putRecursive(Node node, K key, V value) {
		int cmp = key.compareTo(node.entry.getKey());
		if (cmp < 0) { // go Left
			if (node.left == null) {
				node.left = new Node(key, value);
				size++;
				return null;
			} else {
				return putRecursive(node.left, key, value);
			}
		}

		else if (cmp > 0) { // go Right
			if (node.right == null) {
				node.right = new Node(key, value);
				size++;
				return null;
			} else {
				return putRecursive(node.right, key, value);
			}
		}

		else { // gleiche Wert
			
			return node.entry.setValue(value);
		}
	}

}
