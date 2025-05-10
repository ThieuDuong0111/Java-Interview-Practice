package interview.leetcode.tutorial.tree;

public class BinaryTreeDemo {

	// Lớp đại diện cho một Node trong cây
	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			data = value;
			left = right = null;
		}
	}

	// Lớp đại diện cho Binary Tree
	static class BinaryTree {
		Node root;

		// Duyệt cây theo In-order (LNR) (trái → gốc → phải)
		void inorder(Node node) {
			if (node != null) {
				inorder(node.left);
				System.out.print(node.data + " ");
				inorder(node.right);
			}
		}

		// Duyệt cây theo Pre-order (NLR) (gốc → trái → phải)
		void preorder(Node node) {
			if (node != null) {
				System.out.print(node.data + " ");
				preorder(node.left);
				preorder(node.right);
			}
		}

		// Duyệt cây theo Post-order (LRN) (trái → phải → gốc)
		void postorder(Node node) {
			if (node != null) {
				postorder(node.left);
				postorder(node.right);
				System.out.print(node.data + " ");
			}
		}

		// Thêm phần tử vào cây theo cách đơn giản (không phải BST)
		Node insert(Node node, int value) {
			if (node == null) {
				return new Node(value);
			}

			if (value < node.data) {
				node.left = insert(node.left, value);
			} else {
				node.right = insert(node.right, value);
			}

			return node;
		}

		// Tính chiều cao của cây
		int height(Node node) {
			if (node == null)
				return 0;
			return 1 + Math.max(height(node.left), height(node.right));
		}

		// Đếm số lượng node trong cây
		int countNodes(Node node) {
			if (node == null)
				return 0;
			return 1 + countNodes(node.left) + countNodes(node.right);
		}
	}

	// Hàm main để chạy ví dụ
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		// Thêm các node vào cây
		//     50
		//     / \
		//  30    70
		//  / \   / \
		// 20 40 60 80
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);

		// In ra các kiểu duyệt cây
		System.out.print("In-order traversal (trái → gốc → phải): ");
		tree.inorder(tree.root);
		System.out.println();

		System.out.print("Pre-order traversal (gốc → trái → phải): ");
		tree.preorder(tree.root);
		System.out.println();

		System.out.print("Post-order traversal (trái → phải → gốc): ");
		tree.postorder(tree.root);
		System.out.println();

		// Chiều cao và số node
		System.out.println("Height of tree: " + tree.height(tree.root));
		System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
	}
}
