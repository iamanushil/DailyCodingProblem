/* 
This problem was asked by Uber.

Given an array of integers, 
return a new array such that each element at index i of the new array 
is the product of all the numbers in the original array except the one at i.

For example : 
If our input was [1, 2, 3, 4, 5], 
the expected output would be [120, 60, 40, 30, 24]. 

If our input was [3, 2, 1], 
the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
class Day_2 {
    
    public static void main(String[] args) {
        
        int[] inputArr = {1, 2, 3, 4, 5};
        int size = inputArr.length;

        // Method 1:
        // Using Division
        // It calculates the product of the array and then divide the product by that index data
        findProductArrayUsingDivision(inputArr, size);
    }

    
    // Time Complexity:
    // Space Complexity:
    private static void findProductArrayUsingDivision(int[] arr, int size) {

        int product = 1;
        int[] newArray = new int[size];

        for (int each : arr) {
            product *= each;
        }

        for (int i = 0 ; i < size; i++) {
            newArray[i] = product/arr[i];
        }

        printTheIntArray(newArray);
    }

    // A method that prints the Array Data
    private static void printTheIntArray(int[] arr) {
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }
}