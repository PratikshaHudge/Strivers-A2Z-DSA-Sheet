/*
Problem: Left Rotate Array by One

Given an array, rotate it to the left by one position.

Example:
Input  : [1,2,3,4,5]
Output : [2,3,4,5,1]

Time Complexity  : O(n)
Space Complexity : O(1)
*/

import java.util.Scanner;

public class Left_Rotate_By_One {

    public static void leftRotate(int arr[]) {

        int first = arr[0]; // store first element

        // shift elements left
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // place first at end
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        leftRotate(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}