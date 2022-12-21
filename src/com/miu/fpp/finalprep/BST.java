package com.miu.fpp.finalprep;

public class BST {

    private BinaryNode root;

    public boolean insert(int n) {
        if (root == null) {
           root = new BinaryNode(n);
            return true;
        }
        boolean hasInserted = false;
        BinaryNode value = root;
        while (!hasInserted) {
            if (n > value.element) {
                if (value.right == null) {
                    value.right = new BinaryNode(n);
                    hasInserted = true;
                } else {
                    value = value.right;
                }
            } else if (n < value.element) {
                if (value.left == null) {
                    value.left = new BinaryNode(n);
                    hasInserted = true;
                } else {
                    value = value.left;

                }
            } else {
                hasInserted = true;
            }
        }
        return hasInserted;
    }

    public void print() {
        if (root == null) {
            System.out.println("Node is emptyy");
        }
        print(root, PrintOrder.POST);
    }

    private void print(BinaryNode root, PrintOrder printOrder) {
        if (root != null) {
            switch (printOrder) {
                case IN:
                    print(root.left, printOrder);
                    System.out.print(root.element +", ");
                    print(root.right, printOrder);
                    break;
                case PRE:
                    System.out.print(root.element +", ");
                    print(root.left, printOrder);
                    print(root.right, printOrder);
                    break;
                case POST:
                    print(root.left, printOrder);
                    print(root.right, printOrder);
                    System.out.print(root.element +", ");
                    break;
            }
        }
    }

}

class BinaryNode {
    int element;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int e) {
        this(e, null, null);
    }

    public BinaryNode(int e, BinaryNode left, BinaryNode right) {
        this.element = e;
        this.left = left;
        this.right = right;
    }
}

enum PrintOrder {
    PRE, IN, POST
}

class BSTTester {

    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(15);
        bst.insert(12);
        bst.insert(9);
        bst.insert(56);
        bst.insert(1);
        bst.insert(16);
        bst.insert(19);
        bst.insert(22);
        bst.insert(3);
        bst.insert(100);
        bst.insert(2);
        bst.insert(25);

        bst.print();
    }
}
