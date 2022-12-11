package com.miu.fpp.midtermprem;

public class PolyCheck {
    public static void main(String[] args) {

//        checkPoly("MADAM");
//        System.out.println(checkPoly("MRADQARM", 0, "MRADQARM".length() - 1));
//        System.out.println(polyCheckTwo("MADAM"));
        System.out.println(isPloyCheck("MADAMA"));
    }



    public static boolean checkPoly(String polyString, int l, int r) {
        String val;
        boolean res = false;


        if (polyString != null || !polyString.isEmpty()) {
            if (l == r) {
                if (polyString.charAt(l) == polyString.charAt(r)) {
                    res = true;
                } else {
                    res = false;
                }
            } else {
                if (polyString.charAt(l) == polyString.charAt(r)) {
                    res = checkPoly(polyString, l + 1, r - 1);
                } else {
                    res = false;
                }


            }

        }
        return res;
    }

    public static boolean isPloyCheck(String val) {

        if (val.length() <= 1) {
            return true;
        }

        if (val.charAt(0) == val.charAt(val.length() - 1)) {
            return isPloyCheck(val.substring(1, val.length()-1));
        }
        return false;
    }

}
