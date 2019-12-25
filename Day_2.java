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
import java.io.*;
import java.lang.*;

//
class Day_2_Alt {
    
    // Method 1
    // Time: 
    // Space: 
    public static void solve(int[] arr, int size) {
        
        int product = 1;
        int[] newArray = new int[size];

        for (int each : arr) {
            product *= each;
        }

        for (int i = 0 ; i < size; i++) {
            newArray[i] = product/arr[i];
        }
        
        printSolution(newArray, size);
    }
    
    //To print the solution 
    public static void printSolution(int[] arr, int n) {
        
        // Using string buffer to append each output in a string 
        StringBuffer sb = new StringBuffer(); 
        for (int i = 0; i < n; i++) 
            sb.append(arr[i] + " "); 
    
        // finally printing the string 
        System.out.println(sb);
    }
    
    // Driver Method
    public static void main (String[] args) throws java.lang.Exception 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int noOfTestCases = Integer.parseInt(br.readLine()); 

        
        while(noOfTestCases-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine()); 
            
            int[] arr = new int[sizeOfArray];
            
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(strs[i]); 
            }
            
            // Method 1:
            // It calculates the product of the array and then divide the product by that index data
            solve(arr, sizeOfArray); 

            // Methode 2:
            
        }  
            
    } //main end

}//class end