// Given a number n. Find the sum of natural numbers till n but with alternate signs.

import java.util.Scanner;

public class Que2 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else if(n%2==0){
            return sum(n-1)-n;
        }
        else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        // Function calling
        int result = sum(n);
        System.out.println("Sum of n natural number with the alternate sign : "+result);

        sc.nextInt();

    }
}
