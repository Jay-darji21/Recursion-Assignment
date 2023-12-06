// Print the sum of Array

public class Que4 {
    public static int sumOfArr(int arr[],int idx){
        if(idx == 0){
            return arr[idx];
        }
        else{
            return arr[idx]+sumOfArr(arr, idx-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {92,23,15,-20,10};

        int result = sumOfArr(arr,arr.length-1);
        System.out.println("Sum of Array : "+result);
    }
}
