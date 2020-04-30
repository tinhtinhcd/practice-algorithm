import Util.ListNode;
import Util.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        removeDuplicatesFromSortedArray();
//        maxProfit();
//        checkDuplicate();
//        plusOne();
//            maxSubArray();
//        houseRobber();
//        checkExistsWord();
//        combinationLetter();
//        matching();
//        threeSum();
//        add2Num();
//        sortColor();
//        serialize();
        majorityElement();
    }



    //    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//    Example 1:
//    Given nums = [1,1,2],
//    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//    It doesn't matter what you leave beyond the returned length.
    private static void removeDuplicatesFromSortedArray() {
        RemoveDuplicatesSortedArray rm = new RemoveDuplicatesSortedArray();
        rm.remove(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 6});
    }

//    Say you have an array prices for which the ith element is the price of a given stock on day i.
//    Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
//    Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
//
//    Example 1:
//    Input: [7,1,5,3,6,4]
//    Output: 7
//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//                 Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//
//    Example 2:
//    Input: [1,2,3,4,5]
//    Output: 4
//    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//                 Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//                 engaging multiple transactions at the same time. You must sell before buying again.
//
//    Example 3:
//    Input: [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transaction is done, i.e. max profit = 0.

    private static void maxProfit() {
        MaxProfit maxProfit = new MaxProfit();
        maxProfit.maxProfit(new int[]{3, 2, 6, 5, 0, 3});
    }

    //return true if array contain duplicate
    private static void checkDuplicate() {
        CheckDuplicate checkDuplicate = new CheckDuplicate();
        checkDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
    }

//    Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//    You may assume the integer does not contain any leading zero, except the number 0 itself.

    private static void plusOne() {
        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(new int[]{9, 9});
    }

    //Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    //Example:
    //Input: [-2,1,-3,4,-1,2,1,-5,4],
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    private static void maxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();
        maxSubArray.maxSubArray(new int[]{1, 2});
    }

    //You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
    //Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
    //Example 1:
    //Input: [1,2,3,1]
    //Output: 4
    //Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    //             Total amount you can rob = 1 + 3 = 4.
    //Example 2:
    //Input: [2,7,9,3,1]
    //Output: 12
    //Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
    //             Total amount you can rob = 2 + 9 + 1 = 12.
    private static void houseRobber() {
        HouseRobber robber = new HouseRobber();
        robber.rob(new int[]{1, 2, 3, 1});
    }


    //Given a 2D board and a word, find if the word exists in the grid.
    //The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
    //Example:
    //board =
    //[
    //  ['A','B','C','E'],
    //  ['S','F','C','S'],
    //  ['A','D','E','E']
    //]
    //Given word = "ABCCED", return true.
    //Given word = "SEE", return true.
    //Given word = "ABCB", return false.
    private static void checkExistsWord() {
        WordSearch wordSearch = new WordSearch();
        boolean rs = wordSearch.exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}},"AAB");
        System.out.printf(String.valueOf(rs));
    }


    //Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    //A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    //2{"a","b","c"},
    //3{"d","e","f"},
    //4{"g","h","i"},
    //5{"j","k","l"},
    //6{"m","n","o"},
    //7{"p","q","r","s"},
    //8{"t","u","v"},
    //9{"w","x","y", "z"}

    //Example:
    //
    //Input: "23"
    //Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    private static void combinationLetter(){
        LetterCombinations combinations = new LetterCombinations();
        System.out.printf(combinations.letterCombinations("234").toString());
    }


    private static void matching(){
        PatternMatching matching = new PatternMatching();
        System.out.printf(String.valueOf(matching.binaryPatternMatching("010", "amazing")));
    }

    //Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
    //Find all unique triplets in the array which gives the sum of zero.
    private static void threeSum(){
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{3,0,-2,-1,1,2}).stream().forEach(i ->{
            System.out.printf(i.toString());
        });
    }

    //You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    //
    //Example:
    //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //Output: 7 -> 0 -> 8
    //Explanation: 342 + 465 = 807.
    private static void add2Num(){
        ListNode l1 = new ListNode(2 , new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5 , new ListNode(6, new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode rs = addTwoNumbers.addTwoNumbers(l1, l2);

        while (rs!=null){
            System.out.printf(String.valueOf(rs.val));
            rs = rs.next;
        }
    }


    //Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
    //Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
    //Note: You are not suppose to use the library's sort function for this problem.
    //
    //Example:
    //Input: [2,0,2,1,1,0]
    //Output: [0,0,1,1,2,2]
    private static void sortColor(){
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[]{2,0,2,1,1,0});
    }

    //Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
    //Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

    private static void serialize(){

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);

        SerializeTree serializeTree = new SerializeTree();
        String srl = serializeTree.serialize(treeNode);
        System.out.printf(srl);
        serializeTree.deserialize(srl);
    }

    //Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
    //You may assume that the array is non-empty and the majority element always exist in the array.
    //
    //Example 1:
    //Input: [3,2,3]
    //Output: 3
    //
    //Example 2:
    //Input: [2,2,1,1,1,2,2]
    //Output: 2

    private static void majorityElement(){
        MajorityElement majorityElement = new MajorityElement();
        System.out.printf(String.valueOf(majorityElement.majorityElement(new int[]{1,2,3,3})));
    }

}
