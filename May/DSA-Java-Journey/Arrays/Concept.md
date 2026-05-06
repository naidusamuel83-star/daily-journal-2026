Day 1 Arrays
===========================================================================================================
Array- Collection of same type of elements stored in Continuous Memory.
 eg. int marks[] = {10, 20, 30, 40, 50};
  
-> We can access array instantly using index.
-> Arrys in Java :
     int[] arr = new int[5];
             (or)
      int[] arr = {10, 20, 30, 40};

Basic Operations:
  1.Traversal-
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    } 
  2.Access Element:
      System.out.println(arr[2]);
  3.Update Element:
      arr[1] =50;
  4.Insert:
      -Easy at end
      -Costly in middle(Shifting Required)
  5.Delete :
      -Remove element -> Shift left
------------------------------------------------------------------------------------------------------------
Time Complexity- Time Complexity tells How fast your code runs as input size increases


Most Important Complexities:
  ->O(1) -> Constant Time
    T(n) = c
    Example:
      System.out.println(arr[2]);

    No matter array size → same time

  ->O(n) -> Linear Time
    T(n) = an + b
    Example:
      for(int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }

    If n increases → time increases linearly.

  ->O(n^2) -> Quadratic Time
    T(n) = a*(n^2) + b(n) + c
    Example:
      for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        System.out.println(arr[i] + " " + arr[j]);
      }
      }
      
    Very slow for large input 

Important Points:
-Arrays are fast because Direct memory access -> O(1) But, Insert/Delete is Slow -> O(n)
