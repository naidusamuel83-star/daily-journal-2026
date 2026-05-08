public class SmallestElement {

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