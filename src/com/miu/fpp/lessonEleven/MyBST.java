package com.miu.fpp.lessonEleven;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
    /**
     * The tree root.
     */
    private BinaryNode root;
    private int size = 0;

    public MyBST() {
        root = null;
    }

    /**
     * Prints the values in the nodes of the tree
     * in sorted order. Inorder Traversal
     */
    public void printTree() {
        if (root == null)
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    public void preOrder() {
        if (root == null)
            System.out.println("Empty tree");
        else
            preOrder(root);
    }

    public void postOrder() {
        if (root == null)
            System.out.println("Empty tree");
        else
            postOrder(root);
    }

    // Inorder Traversal to print the nodes in Ascending order
    private void printTree(BinaryNode t) {
        if (t != null) {

            printTree(t.left);
            System.out.print(t.element + ",");
            printTree(t.right);
        }
    }

    // PReorder Traversal to print the nodes in Ascending order
    private void preOrder(BinaryNode t) {
        if (t != null) {

            System.out.print(t.element + ",");
            printTree(t.left);
            printTree(t.right);
        }
    }

    // POSTorder Traversal to print the nodes in Ascending order
    private void postOrder(BinaryNode t) {
        if (t != null) {

            printTree(t.left);
            printTree(t.right);
            System.out.print(t.element + ",");
        }
    }

    //Assume the data in the Node is an Integer.

    public void insert(Integer x) {
        if (root == null) {
            root = new BinaryNode(x);
            size++;
            return;
        } else {
            BinaryNode n = root;
            boolean inserted = false;

            while (!inserted)//true
            {
                if (x.compareTo(n.element) < 0) {
                    //space found on the left
                    if (n.left == null) {
                        n.left = new BinaryNode(x, null, null);
                        inserted = true;
                        size++;
                    }
                    //keep looking for a place to insert (a null)
                    else {
                        n = n.left;
                    }
                } else if (x.compareTo(n.element) > 0) {
                    //space found on the right
                    if (n.right == null) {
                        n.right = new BinaryNode(x, null, null);
                        inserted = true;
                        size++;
                    }
                    //keep looking for a place to insert (a null)
                    else {
                        n = n.right;
                    }

                }
                // if a node already exists
                else {
                    inserted = true;
                }

            }

        }
    }

    private class BinaryNode {

        private Integer element;// The data in the node
        private BinaryNode left;      // Left child
        private BinaryNode right;     // Right child
        // Constructors

        BinaryNode(Integer theElement) {
            this(theElement, null, null);
        }

        BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

    }

    public boolean contains(Integer key) {
        if (key == null || root == null) {
            return false;
        }
        boolean containsVal = false;
        BinaryNode current = root;
        if (current.element.equals(key)) {
            containsVal = true;
        }
        while (!containsVal) {
            if (key.compareTo(current.element) > 0) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    break;
                }
            } else if (key.compareTo(current.element) < 0) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    break;
                }
            } else {
                containsVal = true;
            }
        }

        return containsVal;

    }

    public Integer getRoot() {
        return root.element;
    }

    public int size() {
        return size;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer leafNodes() {
        return leafNodes(root);
    }

    private int leafNodes(BinaryNode t) {

        if (t == null) {
            return 0;
        }
        if(t.left == null && t.right == null){
            return 1;
        }
        return leafNodes(t.left) + leafNodes(t.right);
    }

    public Integer findMin() {
        return findMin(root);
    }

    private Integer findMin(BinaryNode root) {

        if (root == null) {
            return null;
        }

        if (root.left != null) {
            return findMin(root.left);
        } else {
            return root.element;
        }

//        while (!foundMin){
//            if(current.left!=null){
//                current = current.left;
//            } else {
//                min = current.element;
//                foundMin = true;
////                break;
//            }
//        }
//        return min;
    }


    public Integer findMax() {
        return findMax(root);
    }

    private Integer findMax(BinaryNode root) {

        if (root == null) {
            return null;
        }

        if (root.right != null) {
            return findMax(root.right);
        } else {
            return root.element;
        }

//        while (!foundMin){
//            if(current.left!=null){
//                current = current.left;
//            } else {
//                min = current.element;
//                foundMin = true;
////                break;
//            }
//        }
//        return min;
    }


    public static void main(String[] args) {

        MyBST mybst = new MyBST();
        MyBST mybstB = new MyBST();

        int[] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};

        for (int j = 0; j < a.length; j++) {
            mybst.insert(a[j]);
        }
        int[] b = {1,3,5,7,2};

        for (int j = 0; j < b.length; j++) {
            mybstB.insert(b[j]);
        }

        mybst.insert(12);
        mybst.printTree();
        System.out.println("found value===>>> " + mybst.contains(100));
        System.out.println("leaf nodes: " + mybst.leafNodes());
        System.out.println("Min is: " + mybst.findMin());
        System.out.println("isEmpty is: " + mybst.isEmpty());
        System.out.println("size is: " + mybst.size());
        System.out.println("Leaf Node is: " + mybstB.leafNodes());

        TreeSet<Integer> ts = new TreeSet<Integer>();

        for (int j = 0; j < a.length; j++) {
            ts.add(a[j]);
            System.out.println("\nAfter inserting " + j + "th item " + a[j]);
            Iterator<Integer> it = ts.iterator();
            Integer nextItem = null;
            while (it.hasNext()) {
                nextItem = it.next();
                System.out.print(nextItem + " ");
            }
            System.out.println();
        }

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(8, "Hello");
        map.put(10, "World!");
        map.put(11, "Welcome");
        map.remove(8);
        String str = map.get(11) + ", " + map.get(10);
        System.out.println(str);

    }
}
