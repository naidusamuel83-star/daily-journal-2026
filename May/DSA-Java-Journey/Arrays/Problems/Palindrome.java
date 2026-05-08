public class Palindrome {

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