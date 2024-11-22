package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countTwoSixes(new int[]{1, 2, 6, 6, 6, 5, 6, 5, 7}));
        System.out.println(countTwoSixes(new int[]{1, 2, 5, 6}));
        System.out.println(countTwoSixes(new int[]{1, 2, 6, 7}));
        System.out.println(countTwoSixes(new int[]{1, 7, 6, 1}));
    }

    // i < 4
    // i = 0, 1, 2, 3, 4
    public static int countTwoSixes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count += 1;
            }
        }

        return count;
    }

    public static boolean noTriples(String[] name) {
        for (int i = 0; i < name.length - 2; i++) {
            if (name[i].equals(name[i + 1]) && name[i].equals(name[i + 2])) {
                return false;
            }
        }
        return true;
    }

    // індекс         0  1  2  3  4  5  6
// дані масиву   [1, 2, 4 ,5, 4, 4, 4]
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) { //if(1 == 2 && 1 == 4)
                return false;
            }
        }
        return true;
    }

    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 42:
                return "answer for everything";
            case 7:
                return "prime number";
            default:
                return "just a number";
        }
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        }
//        if((aSmile && bSmile) || (!aSmile && !bSmile)){
//            return true;
//        }
        else {
            return false;
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
