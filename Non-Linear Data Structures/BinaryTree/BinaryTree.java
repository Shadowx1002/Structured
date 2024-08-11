package BinaryTree;

//Node class 
class Node {
 int key;
 Node left, right;

 public Node(int item) {
     key = item;
     left = right = null;
 }
}

//manipulate the binary tree
class BinaryTree {
 Node root;

 // Constructor
 BinaryTree() {
     root = null;
 }

 // in-order traversal of the binary tree
 void inorder(Node node) {
     if (node == null) {
         return;
     }

     // Recur on the left subtree
     inorder(node.left);

     // Visit the root
     System.out.print(node.key + " ");

     // Recur on the right subtree
     inorder(node.right);
 }

 // pre-order traversal of the binary tree
 void preorder(Node node) {
     if (node == null) {
         return;
     }

     // Visit the root
     System.out.print(node.key + " ");

     // Recur on the left subtree
     preorder(node.left);

     // Recur on the right subtree
     preorder(node.right);
 }

 // post-order traversal of the binary tree
 void postorder(Node node) {
     if (node == null) {
         return;
     }

     // Recur on the left subtree
     postorder(node.left);

     // Recur on the right subtree
     postorder(node.right);

     // Visit the root
     System.out.print(node.key + " ");
 }

 // Method to insert a node in the binary tree
 void insert(int key) {
     root = insertRec(root, key);
 }

 // A recursive function to insert a new key in the binary tree
 Node insertRec(Node root, int key) {
     // If the tree is empty, return a new node
     if (root == null) {
         root = new Node(key);
         return root;
     }

     // Otherwise, recur down the tree
     if (key < root.key) {
         root.left = insertRec(root.left, key);
     } else if (key > root.key) {
         root.right = insertRec(root.right, key);
     }

     // Return the unchanged root pointer
     return root;
 }

 // perform inorder traversal
 void inorder() {
     inorder(root);
 }

 // perform preorder traversal
 void preorder() {
     preorder(root);
 }

 // perform postorder traversal
 void postorder() {
     postorder(root);
 }

 // demonstrate the BinaryTree class
 public static void main(String[] args) {
     BinaryTree tree = new BinaryTree();

     /* binary tree
               50
             /    \
           30      70
          /  \    /  \
        20   40  60   80 */
     
     System.out.println("Insert 50 , 30 , 20 , 40 , 70 , 60 , 80");
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     // Print in-order traversal
     System.out.println("Inorder traversal:");
     tree.inorder();

     // Print pre-order traversal
     System.out.println("\nPreorder traversal:");
     tree.preorder();

     // Print post-order traversal
     System.out.println("\nPostorder traversal:");
     tree.postorder();
 }
}

