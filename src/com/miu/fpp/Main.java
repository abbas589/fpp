package com.miu.fpp;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("MACBAOKPRO".substring(5,"MACBAOKPRO".length()-1));

        System.out.println(findPower(2,3));

    }

    public static int findPower(int x, int y){
        if(y == 0){
            return 1;
        }
        return x * findPower(x,y-1);
    }
}
