package DataStructure.Trees;

/*
 * Delete C1: the item to be delete has no children
 * Delete C2: the item to be delete has 1 child(either left or right)
 * Delete C3: the time to be delete has both a left and right child.
 */

public class BinaryTree {
    public static class BNode {
        int data;
        BNode left;
        BNode right;

        public BNode () {
            this.left = null;
            this.right = null;
        }

        public BNode (int data){
            this.data = data;
            left = right = null;
        }

    }

    public static BNode root;

    public static BNode insertHelper(int data, BNode tree) {
        if (tree == null) {
            BNode newNode = new BNode(data);
            return newNode;
        }
        if (tree.data > data) {
            tree.left = insertHelper(data, tree.left);
        }
        else {
            tree.right = insertHelper(data, tree.right);
        }
        return tree;

    }

    public void insertRecursion(int data) {
        root = insertHelper(data, root);
    }

    // preOrder Visit-Left-Right
    private static void preOrderHelper(BNode curr) {
        if(curr == null) { return;}
        System.out.print(curr.data + " ");
        preOrderHelper(curr.left);
        preOrderHelper(curr.right);
    }
    
    // inOrder Left-Vist-Right
    private static void inOrderHelper(BNode curr) {
        if(curr == null) { return;}
        preOrderHelper(curr.left);
        System.out.print(curr.data + " ");
        preOrderHelper(curr.right);
    }
    // postOrder Left-Right-Visit
    private static void postOrderHelper(BNode curr) {
        if(curr == null) { return;}
        postOrderHelper(curr.left);
        postOrderHelper(curr.right);
        System.out.print(curr.data + " ");
    }

    public static void preOrderTravel() {
        preOrderHelper(root);
        System.out.print(" ");
    }
    public static void inOrderTravel() {
        inOrderHelper(root);
        System.out.print(" ");
    }
    public static void postOrderTravel() {
        postOrderHelper(root);
        System.out.print(" ");
    }
    
    
    public static void delete(int item) {
        root = deleteHelper(root, item);
    }
    
    public static BNode deleteHelper(BNode tree, int data) {
        if(tree == null) return null;
        if(tree.data > data) {
            tree.left = deleteHelper(tree.left, data);
        }
        if (tree.data < data) {
            tree.right = deleteHelper(tree.right, data);
        }
        if(tree.data == data) {
            if(tree.left == null) return tree.right; // case 1 & 2
            if(tree.right == null) return tree.left; // case 1 & 2
            //Case 3
            BNode successor = tree.right;
            while (tree.left != null) {
                successor = successor.left;
            }
            tree.data = successor.data; // replace root node
            tree.right = deleteHelper(tree.right, successor.data); // delete duplicate
        }
        return tree;
    }
    
    public static int search(int data){
        BNode curr = root;
        while (curr != null){
            if(curr.data == data) return curr.data;
            else if (curr.data > data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
        return -1;
    }

    public static void main(String []args){
        BinaryTree tree = new BinaryTree();
        tree.insertRecursion(10000);
        tree.insertRecursion(10);
        tree.insertRecursion(110);
        tree.insertRecursion(100);
        tree.preOrderTravel();
        tree.inOrderTravel();
        tree.postOrderTravel();
        System.out.println("");
        tree.delete(100);
        tree.inOrderTravel();
        System.out.println(tree.search(10000));
        System.out.println(tree.search(1));
    }
}
