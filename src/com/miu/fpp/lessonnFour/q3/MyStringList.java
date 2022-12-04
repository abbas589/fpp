package com.miu.fpp.lessonnFour.q3;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyStringList {
    private final int INITIAL_LENGTH = 2;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s) {
        //implement
        if (size > strArray.length - 1) {
            resize();
        }
        strArray[size] = s;
        size++;
    }

    public String get(int i) {
        //implement
        if (i <= size) {
            return strArray[i];
        }
        return null;
    }

    public boolean find(String s) {
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (strArray[i].equals(s)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public void insert(String s, int pos) {
        //implement
        if (pos > 0 && pos < size) {
            strArray[pos] = s;
            if (strArray[pos] != null) {
                size++;
            }
        }


    }

    public boolean remove(String s) {
        //implement
        boolean removed = false;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(s)) {
//                strArray[i] = strArray[i + 1];
                if (size - i >= 0) {
                    System.arraycopy(strArray, i + 1, strArray, i, size - i);
                }
                removed = true;
                size--;
                resize();
                break;
            }
        }
        return removed;
    }


    private void resize() {
        //implement
        System.out.println("Resizing...");
        String[] newStrArray = new String[strArray.length * 2];
        System.arraycopy(strArray, 0, newStrArray, 0, strArray.length);
        strArray = newStrArray;
    }

    public String toString() {
        //implement

//        String[] cleanedUpArray = new String[size];
//        int j = 0;
//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i] != null) {
//                cleanedUpArray[j] = strArray[i];
//                j++;
//            }
//        }

        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < size; i++) {
            stringJoiner.add(strArray[i]);
        }
        return stringJoiner.toString();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
//        MyStringList l = new MyStringList();
//        l.add("Bob");
//        l.add("Steve");
//        l.add("Susan");
//        l.add("Mark");
//        l.add("Dave");
//        System.out.println("The list of size " + l.size() + " is " + l);
//        l.remove("Mark");
//        l.remove("Bob");
//        System.out.println("The list of size " + l.size() + " is " + l);
//        l.insert("Richard", 3);
//        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
//        l.insert("Tonya", 0);
//        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);


        MyStringList l = new MyStringList();
        l.add("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Steve");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Susan");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
    }

}
