package module6;
public class LargestSmallestArray {
    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 2, 50};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest)
                largest = arr[i];
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}