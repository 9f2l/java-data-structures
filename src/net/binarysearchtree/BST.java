package net.binarysearchtree;

public class BST {

// Create Binary Search Tree
	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

// Inserting elements into the BST
	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}

		if (val < node.data) {
			node.left = insert(node.left, val);
		}

		else if (val > node.data) {
			node.right = insert(node.right, val);
		}

		return node;
	}

// Delete a node of binary search tree
	public Node delete(Node node, int val) {
		if (node == null) {
			return null;
		}

		if (val < node.data) {
			node.left = delete(node.left, val);
		}

		else if (val > node.data) {
			node.right = delete(node.right, val);
		}

		else {
			if (node.left == null || node.right == null) {
				Node temp = null;
				temp = node.left == null ? node.right : node.left;

				if (temp == null) {
					return null;
				}

				else {
					return temp;
				}
			}

			else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right, 4);
				return node;
			}
		}

		return node;
	}

// Method associated with the deletion of a node from BST
	public Node getSuccessor(Node node) {
		if (node == null) {
			return null;
		}

		Node temp = node.right;

		while (temp.left != null) {
			temp = temp.left;
		}

		return temp;
	}

// Sorting the BST in order (ascending)
	public void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

// Printing BST nodes in an preOrder manner
	public void preorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}

// Printing BST nodes in an postOrder manner
	public void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}

// Check if a value exist in Binary Search Tree
	public boolean ifNodePresent(Node node, int val) {
		if (node == null) {
			return false;
		}

		boolean isPresent = false;

		while (node != null) {
			if (val < node.data) {
				node = node.left;
			}

			else if (val > node.data) {
				node = node.right;
			}

			else {
				isPresent = true;
				break;
			}
		}

		return isPresent;

	}

// Check the difference of odd & even level values

	public int getDifferenceEvenOddLevel(Node node) {
		if (node == null) {
			return 0;
		}

		return node.data - getDifferenceEvenOddLevel(node.left) - getDifferenceEvenOddLevel(node.right);

	}

// Get maximum value element in BST

	public int getMax(Node node) {
		if (node == null) {
			System.out.println("Tree is Empty");
			return -1;
		}

		while (node.right != null) {
			node = node.right;
		}

		return node.data;
	}

// Get minimum value element in BST
	
	public int getMin(Node node) {
		if (node == null) {
			System.out.println("Tree is Empty");
			return -1;
		}

		while (node.left != null) {
			node = node.left;
		}

		return node.data;
	}

}
