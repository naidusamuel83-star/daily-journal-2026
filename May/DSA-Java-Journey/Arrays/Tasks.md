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
