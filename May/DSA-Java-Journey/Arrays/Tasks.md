Task 1:
Write Java code for:
Create array, Traverse, Find max element

public class ArrayCreation{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("Array is Created Successfully");
        //Traverse
        System.out.print("Array elements are :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " +arr[i]);
        }
        //Max Element
        int max = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        System.out.println("\nMax element in the Array is:" +max);
    }
}

But, In above code we don't need to take different loops for traverse and Max elemant


public class ArrayCreation{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        int max = arr[0];
        System.out.println("Array is Created Successfully");
        System.out.print("Max element in the array :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " +arr[i]);
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("\nMax element in the Array is:" +max);
    }
}