package hacker_rank;

import java.util.Scanner;

public class palindrome_String {
    static String palindrome(String A,int n){
        for(int i = 0;i < n/2;i++){
            if(A.charAt(i) != A.charAt(n - i-1)){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String:");
        String A = sc.next();
        String P = palindrome(A,A.length());
        System.out.println(P);

    }
}
