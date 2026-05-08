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