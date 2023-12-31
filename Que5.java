// ArmStrong Problem

import java.util.Scanner;

public class Que5 {
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        else if(b%2==0){
            return power(a, b/2)*power(a, b/2);
            
        }
        else{
            return a*power(a, b/2)*power(a, b/2);
        }
    }
    public static int isArmStrong(int n,int digits){
        if(n==0){
            return 0;
        }
        else{
            return power(n%10, digits)+isArmStrong(n/10, digits);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int digits=0;
        int temp = num;
        while (temp>0) {
            digits++;
            temp/=10;
        }
        if(num == isArmStrong(num,digits)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
