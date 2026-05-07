# Concept.md

=============================================================================================================

# Day 1 - Arrays

=============================================================================================================

## Arrays

Array = Collection of same type of elements stored in continuous memory locations.

Example:

```
int marks[] = {10, 20, 30, 40, 50};
```

---

## Important Points

* Array stores multiple values in a single variable
* Index starts from 0
* Arrays are fixed in size
* Fast element access using indexing
* Same data type elements only

---

## Arrays in Java

### Method 1

```
int[] arr = new int[5];
```

### Method 2

```
int[] arr = {10, 20, 30, 40};
```

---

## Basic Operations

### 1. Traversal

```
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### 2. Access Element

```
System.out.println(arr[2]);
```

### 3. Update Element

```
arr[1] = 50;
```

### 4. Insert Operation

* Easy at end
* Costly in middle because shifting is required

### 5. Delete Operation

* Remove element
* Shift remaining elements to left

=============================================================================================================

# Time Complexity

=============================================================================================================

## Definition

Time Complexity tells how fast the code runs as input size increases.

---

## Important Complexities

### O(1) → Constant Time

```
T(n) = c
```

Example:

```
System.out.println(arr[2]);
```

* Execution time remains same regardless of input size

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

* Time increases linearly with input size

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

* Very slow for large inputs

---

## Important Understanding

* Arrays provide fast access because of direct memory indexing → O(1)
* Insert/Delete operations are slower because shifting is required → O(n)

=============================================================================================================

# Day 2 - Arrays

=============================================================================================================

## Revision Topics

### 1. What is Array?

Collection of same type of data stored in contiguous memory locations.

### 2. Indexing

Position number of elements inside array.

### 3. Traversal

Visiting every element of array one by one.

### 4. Insert/Delete Concept

Insertion and deletion may require shifting of elements.

### 5. Maximum Element

Logic to find largest element in array.

---

## Day 2 Concepts

### 1. Minimum Element

Find smallest element in array.

Logic:

```
int min = arr[0];

for(int i = 0; i < arr.length; i++) {

    if(arr[i] < min) {
        min = arr[i];
    }
}
```

---

### 2. Sum of Elements

Add all elements of array.

Logic:

```
int sum = 0;

for(int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}
```

---

### 3. Search Element

Check whether an element exists in array.

Logic:

```
boolean found = false;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] == search) {
        found = true;
        break;
    }
}
```

---

### 4. Reverse Array

Reverse array using two-pointer technique.

Logic:

```
int left = 0;
int right = arr.length - 1;
```

* Swap left and right elements
* Move pointers toward center

---

### 5. Palindrome Array

Check whether array is same from both directions.

Example:

```
[1, 2, 3, 2, 1]
```

* Compare left and right elements

---

### 6. Sorted Array

Check whether array is sorted in ascending order.

Logic:

```
if(arr[i] > arr[i + 1])
```

* If current element is greater than next element:

  * Array is not sorted

---

### 7. Largest Element

Find maximum element in array.

Logic:

```
int max = arr[0];
```

---

### 8. Smallest Element

Find minimum element in array.

Logic:

```
int min = arr[0];
```

---

### 9. Second Largest Element

Find second maximum element in array.

Important Variables:

```
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
```

---

### 10. Second Smallest Element

Find second minimum element in array.

Important Variables:

```
int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;
```

=============================================================================================================

# Important Patterns Learned

=============================================================================================================

## 1. Traversal Pattern

```
for(int i = 0; i < arr.length; i++)
```

Used in:

* Sum
* Search
* Max
* Min
* Count

---

## 2. Two Pointer Pattern

```
int left = 0;
int right = arr.length - 1;
```

Used in:

* Reverse Array
* Palindrome Problems

---

## 3. Tracking Variable Pattern

```
int max = arr[0];
```

Used in:

* Largest Element
* Smallest Element
* Second Largest
* Second Smallest

=============================================================================================================
