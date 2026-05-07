# Notes.md

=============================================================================================================

# Day 1 - Arrays

=============================================================================================================

## What I Learned

* What is an Array
* Array Operations
* Traversal
* Accessing Elements
* Updating Elements
* Insert/Delete Concept
* Time Complexity Basics

---

## Key Concepts

* Arrays
* Index
* Traversal
* Access Element
* Update Element
* Time Complexity
* O(1)
* O(n)
* O(n²)

---

## Important Understanding

* Arrays store same type of elements in continuous memory locations
* Array index starts from 0
* Arrays provide fast access using indexing
* Insert/Delete operations are slower because shifting is required

---

## Time Complexities Learned

### O(1) → Constant Time

```
T(n) = c
```

Example:

```
System.out.println(arr[2]);
```

---

### O(n) → Linear Time

```
T(n) = an + b
```

Example:

```
for(int i = 0; i < n; i++) {
    System.out.println(arr[i]);
}
```

---

### O(n²) → Quadratic Time

```
T(n) = an² + bn + c
```

Example:

```
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.println(arr[i] + " " + arr[j]);
    }
}
```

---

## Problems Solved

1. Array Creation
2. Array Traversal
3. Maximum Element in Array

=============================================================================================================

# Day 2 - Arrays

=============================================================================================================

## What I Learned

(Solved Problem on Arrays)
* Minimum Element
* Sum of Elements
* Count Elements
* Search Element
* Reverse Array
* Palindrome Array
* Sorted Array
* Second Largest Element
* Second Smallest Element

---

## Key Concepts

* Traversal
* Two Pointer Technique
* Tracking Variables
* Comparison Logic
* Searching
* Array Manipulation

---

## Important Understanding

### Traversal

* Visiting every element in array one by one

### Two Pointer Technique

* Using two variables:

```java
int left = 0;
int right = arr.length - 1;
```

* Mostly used in:

  * Reverse Array
  * Palindrome Problems

### Tracking Variables

Example:

```java
int max = arr[0];
```

* Used for:

  * Largest Element
  * Smallest Element
  * Second Largest
  * Second Smallest

---

## Problems Practiced

1. Array Traversal
2. Find Maximum Element
3. Find Minimum Element
4. Sum of Array Elements
5. Count Array Elements
6. Search Element
7. Reverse Array
8. Palindrome Array
9. Check Sorted Array
10. Second Largest Element
11. Second Smallest Element

=============================================================================================================
