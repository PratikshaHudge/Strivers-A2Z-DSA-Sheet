/*
Problem: Left Rotate Array by K Places

Given an array and integer k, rotate the array left by k positions.

Example:
Input  : [1,2,3,4,5,6,7], k = 3
Output : [4,5,6,7,1,2,3]

Time Complexity  : O(n)
Space Complexity : O(k)
*/

import java.util.Scanner;

public class Left_Rotate_By_K {

    public static void leftRotate(int arr[], int k) {

        int n = arr.length;
        k = k % n; // handle large k

        // store first k elements
        int temp[] = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shift remaining left
        for(int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // place temp at end
        int j = 0;
        for(int i = n - k; i < n; i++) {
            arr[i] = temp[j++];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        leftRotate(arr, k);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}