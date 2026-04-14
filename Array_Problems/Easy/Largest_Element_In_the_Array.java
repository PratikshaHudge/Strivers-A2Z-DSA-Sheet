/*
 Problem: Largest Element in an Array

 Description:
 Given an integer array, find the largest element present in the array.

 Approach:
 1. Initialize max with Integer.MIN_VALUE
 2. Traverse the array
 3. Compare each element with max
 4. Update max if current element is greater
 5. Print max

 Time Complexity: O(n)
 Space Complexity: O(1)

*/ 

/************** BEST Approach **************/


public class Largest_Element_In_the_Array {

    public static void main(String[] args) {

        // Input array
        int[] arr = {2, 5, 1, 3, 0};

        // Initialize max with minimum integer value
        int max = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Compare and update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print largest element
        System.out.println("Largest element in array: " + max);
    }
}




/*2. Sorting Approach

Sort array and take last element.

Approach
Sort array
Return last element
Arrays.sort(arr);
int max = arr[arr.length - 1];

Time Complexity: O(n log n)
Space: O(1) or O(n) (depends on sort)*/