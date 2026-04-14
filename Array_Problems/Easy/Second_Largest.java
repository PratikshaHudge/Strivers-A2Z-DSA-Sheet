/*
 Problem: Second Largest Element in Array

 Example:
 Input:  [2,5,8,6,4]
 Output: 6

 Approach:
 1. Take two variables max and secondMax
 2. Initialize both with Integer.MIN_VALUE
 3. Traverse array
 4. If element > max → update secondMax and max
 5. Else if element > secondMax and element != max → update secondMax
 6. Print secondMax

 Time Complexity: O(n)
 Space Complexity: O(1) 
 
*/

public class Second_Largest {

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 6, 4};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondMax);
    }
}


// arr[i] != max → avoid duplicate max (ex: 8,8,5)