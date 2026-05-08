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