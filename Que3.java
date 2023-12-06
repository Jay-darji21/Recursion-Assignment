// Print the maximum value of Array

public class Que3 {
    public static int maxVal(int arr[],int n,int idx){
        if(idx == n-1){
            return arr[n-1];
        }
        else{
            int max = maxVal(arr, n, idx+1);
            int res = Math.max(arr[idx], max);

            return res;
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,1,-3,22,5};
        int n = arr.length;

        int result = maxVal(arr,n,0);
        System.out.println("Maximum number : "+result);        
    }
}
