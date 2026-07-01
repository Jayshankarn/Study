import java.util.ArrayList;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // Node to be deleted found
            if (root.left == null && root.right == null) {
                return null; // Leaf node
            } else if (root.left == null) {
                return root.right; // Only right child
            } else if (root.right == null) {
                return root.left; // Only left child
            } else {
                // Node with two children
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }
  public static void printRootToLeaf( num2){

  }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root, 3)); // true
        System.out.println(search(root, 6)); // false
        if (search(root, 3)) {
            System.out.println("Value 3 found in the BST.");
        } else {
            System.out.println("Value 3 not found in the BST.");
        }
        System.out.print("Values in range 2-5: ");
        printInRange(root, 2, 5);
        System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        System.out.print("Root-to-Leaf Paths: ");
        printRootToLeafPaths(root, path);
    }
    
}
