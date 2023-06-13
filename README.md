
<h1 align="center"> Zero_Sum_Elements_Program </h1>

>### Tech stack used: OOPs, Java

*  ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

This program takes an array of positive and negative numbers (excluding 0) as input and returns the elements from the array whose sum is 0. If no such elements exist, it displays the message "No Elements found".

>### Example
* For an input array [-4, 1, 3, -2, -1], one of the possible results would be [3, -2, -1] since their sum is 0.

>### Usage
 * To run the program, follow these steps:

    Ensure you have a Java development environment set up on your machine.
    Compile the Java source file ZeroSumElements.java using the Java compiler.
    Run the compiled program using the Java Virtual Machine (JVM).
    The program will output the subarray whose sum is zero, or the "No Elements found" message if applicable.
    Code Explanation
    The program uses the following approach to find the subarray with a sum of zero:

    Iterate over the input array and maintain a running sum (currSum) as we traverse the elements.
    Use a HashMap (sumMap) to store the cumulative sums and their corresponding indices.
    If the current sum becomes zero during iteration, return the subarray from the start to the current index.
    If the current sum is found in the sumMap, it means there is a subarray with a sum of zero. Return the subarray from the index after the previous occurrence to the current index.
    If no subarray with a sum of zero is found, return an empty array.
    Test Cases
    The program has been tested with various test cases, including:

    Input array with both positive and negative numbers resulting in a subarray with a sum of zero.
    Input array with no elements resulting in the "No Elements found" message.
    Input array with positive numbers only, resulting in the "No Elements found" message.
    Input array with negative numbers only, resulting in the "No Elements found" message.
    Time and Space Complexity
    The time complexity of the program is O(n) since it iterates over the array once.

* The space complexity is O(n) as well, as the program uses a HashMap to store the cumulative sums and their corresponding indices.

