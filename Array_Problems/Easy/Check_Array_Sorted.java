/*
Problem Statement:
Given an integer array nums, return true if the array was originally sorted 
in non-decreasing order, then rotated some number of positions.

Otherwise, return false.

Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: originally sorted [1,2,3,4,5] rotated

Example 2:
Input: nums = [2,1,3,4]
Output: false

Example 3:
Input: nums = [1,2,3]
Output: true
*/

class Solution {
    public boolean check(int[] nums) {
        
        int count = 0; // counts number of decreasing points

        // check how many times order breaks
        for(int i = 1; i < nums.length; i++) {
            
            // if current element is smaller than previous
            // then order is broken
            if(nums[i] < nums[i-1]) {
                count++;
            }
        }

        // check last and first element (rotation case)
        // example: [3,4,5,1,2] → 2 < 3
        if(nums[nums.length - 1] > nums[0]) {
            count++;
        }

        // array is sorted rotated only if break happens at most once
        return count <= 1;
    }
}