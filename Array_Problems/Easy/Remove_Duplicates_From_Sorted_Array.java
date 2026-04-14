import java.util.Scanner;

/*
Problem: Remove Duplicates from Sorted Array

Given a sorted integer array, remove duplicates in-place such that
each element appears only once and return the number of unique elements.

Do not use extra space. Modify the original array.

Example:
Input  : [1,1,2,2,3,3]
Output : 3
Array  : [1,2,3]

Time Complexity  : O(n)
Space Complexity : O(1)
*/

public class Remove_Duplicates_From_Sorted_Array {

    // function to remove duplicates
    public static int removeDuplicates(int arr[]) {

        int i = 0; // pointer for unique elements

        // traverse array
        for (int j = 1; j < arr.length; j++) {

            // if new unique element found
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // return count of unique elements
        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);

        System.out.println("After Removing Duplicates:");

        // print only unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}