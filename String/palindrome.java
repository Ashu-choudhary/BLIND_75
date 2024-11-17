package String;

import java.util.Scanner;

public class palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        long temp = x,reverse =0;

        while(temp != 0){

            int digit = (int) (temp % 10);
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return (reverse == x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        palindrome obj = new palindrome();
        System.out.println(obj.isPalindrome(x));

    }
}
