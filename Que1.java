// Given an integer, Find out the sum of it's digits

import java.util.Scanner;

public class Que1{
    public static int sumOfDigits(int n){
        // Base case condition
        if(n==0){
            return 0;
        }

        // Recursive function
        else{
            return (n%10)+sumOfDigits(n/10);
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        // Function calling
        int result = sumOfDigits(n);
        System.out.println("Sum of digits : "+result);

        sc.close();
    }
}