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

Day 3 - Arrays

=============================================================================================================

What I Learned
Move Zeroes Problem
Rotate Array
Remove Duplicates
Two Sum Problem
Kadane’s Algorithm
Intermediate Array Problem Solving
Key Concepts
Two Pointer Technique
Traversal
Swapping
Index Manipulation
Nested Loops
Running Sum
Optimization Logic
Important Understanding
Move Zeroes
Move all non-zero elements to front
Push zeroes toward end
Rotate Array
Store last element temporarily
Shift remaining elements
Place last element at beginning
Remove Duplicates
Compare adjacent elements
Store only unique elements
Two Sum
Check pairs whose sum equals target
Use nested loops in brute-force approach
Kadane’s Algorithm
Track current sum and maximum sum
Reset current sum when it becomes negative
Important Patterns Learned
1. Traversal Pattern
for(int i = 0; i < arr.length; i++)

Used in:

Move Zeroes
Rotate Array
Search Problems
2. Two Pointer Pattern
int left = 0;
int right = arr.length - 1;

Used in:

Reverse Array
Remove Duplicates
Palindrome Problems
3. Nested Loop Pattern
for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {

    }
}

Used in:

Two Sum
Pair Problems
4. Running Sum Pattern
currentSum = currentSum + arr[i];

Used in:

Kadane’s Algorithm
Prefix Sum Problems
Problems Practiced
Move Zeroes
Rotate Array
Remove Duplicates
Two Sum
Kadane’s Algorithm

=============================================================================================================