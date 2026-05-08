# Tasks.md

=============================================================================================================

# Day 1 - Arrays

=============================================================================================================

## Task 1: Array Creation, Traversal, and Maximum Element

### Java Program

```java
public class ArrayCreation {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int max = arr[0];

        System.out.println("Array Created Successfully");

        System.out.print("Array Elements are : ");

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nMaximum Element in Array is : " + max);
    }
}
```

---

## Observation

* Separate loops are not necessary for:

  * Traversal
  * Finding Maximum Element

* Both operations can be performed in a single loop.

* This improves efficiency and reduces unnecessary iterations.

=============================================================================================================

# Day 2 - Arrays

=============================================================================================================

## Task 1: Array Traversal

### Java Program

```java
public class ArrayTraversal {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Array Elements are : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

=============================================================================================================

## Task 2: Find Maximum Element

### Java Program

```java
public class MaximumElement {

    public static void main(String[] args) {

        int arr[] = {10, 50, 30, 70, 40};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element is : " + max);
    }
}
```

=============================================================================================================

## Task 3: Find Minimum Element

### Java Program

```java
public class MinimumElement {

    public static void main(String[] args) {

        int arr[] = {10, 50, 30, 70, 40};

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element is : " + min);
    }
}
```

=============================================================================================================

## Task 4: Sum of Array Elements

### Java Program

```java
public class SumOfElements {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array Elements is : " + sum);
    }
}
```

=============================================================================================================

## Task 5: Count Array Elements

### Java Program

```java
public class CountElements {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int count = arr.length;

        System.out.println("Total Elements in Array : " + count);
    }
}
```

=============================================================================================================

## Task 6: Search Element in Array

### Java Program

```java
public class SearchElement {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int search = 30;

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == search) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}
```

=============================================================================================================

## Task 7: Reverse Array

### Java Program

```java
public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed Array : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

=============================================================================================================

## Task 8: Palindrome Array

### Java Program

```java
public class PalindromeArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1};

        boolean palindrome = true;

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            if(arr[left] != arr[right]) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(palindrome) {
            System.out.println("Array is Palindrome");
        }
        else {
            System.out.println("Array is Not Palindrome");
        }
    }
}
```

=============================================================================================================

## Task 9: Check Sorted Array

### Java Program

```java
public class SortedArray {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }
}
```

=============================================================================================================

## Task 10: Second Largest Element

### Java Program

```java
public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {10, 20, 50, 40, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element : " + secondLargest);
    }
}
```

=============================================================================================================

## Task 11: Second Smallest Element

### Java Program

```java
public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = {10, 20, 50, 40, 30};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {

                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != smallest) {

                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest Element : " + secondSmallest);
    }
}
```

=============================================================================================================

# Day 3 - Arrays

=============================================================================================================

## Task 1: Move Zeroes

### Problem Statement

Move all zeroes to the end while maintaining the order of non-zero elements.

Example:

```
Input  : [0,1,0,3,12]
Output : [1,3,12,0,0]
```

---

### Java Program

```
public class MoveZeroes {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        int index = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }

        System.out.print("Array after moving zeroes : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

=============================================================================================================

## Task 2: Rotate Array

### Problem Statement

Rotate array elements by one position.

Example:

```
Input  : [1,2,3,4,5]
Output : [5,1,2,3,4]
```

---

### Java Program

```
public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.print("Rotated Array : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

=============================================================================================================

## Task 3: Remove Duplicates

### Problem Statement

Remove duplicate elements from sorted array.

Example:

```
Input  : [1,1,2,2,3]
Output : [1,2,3]
```

---

### Java Program

```
public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3};

        System.out.print("Unique Elements : ");

        for(int i = 0; i < arr.length; i++) {

            if(i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
```

=============================================================================================================

## Task 4: Two Sum Problem

### Problem Statement

Find two elements whose sum equals target value.

Example:

```
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]
```

---

### Java Program

```
public class TwoSum {

    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};

        int target = 9;

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {

                    System.out.println("Indices are : " + i + " and " + j);
                }
            }
        }
    }
}
```

=============================================================================================================

## Task 5: Kadane's Algorithm

### Problem Statement

Find maximum subarray sum.

Example:

```
Input  : [-2,1,-3,4,-1,2,1,-5,4]
Output : 6
```

Subarray:

```text id="v8f3n6"
[4,-1,2,1]
```

---

### Java Program

```
public class KadanesAlgorithm {

    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = 0;
        int maxSum = arr[0];

        for(int i = 0; i < arr.length; i++) {

            currentSum = currentSum + arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum : " + maxSum);
    }
}
```

=============================================================================================================

# Important Observation

## Patterns Used

### 1. Traversal Pattern

```
for(int i = 0; i < arr.length; i++)
```

---

### 2. Two Pointer Technique

```
int left = 0;
int right = arr.length - 1;
```

---

### 3. Nested Loop Pattern

```
for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {

    }
}
```

---

### 4. Running Sum Pattern

```
currentSum = currentSum + arr[i];
```

=============================================================================================================

# Important Learning

* Intermediate array problems improve logical thinking
* Arrays mainly focus on:

  * Traversal
  * Index manipulation
  * Pattern recognition
  * Optimization thinking

=============================================================================================================
