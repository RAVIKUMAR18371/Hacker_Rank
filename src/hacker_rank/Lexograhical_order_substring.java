package hacker_rank;
import java.util.Scanner;
public class Lexograhical_order_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println("Enter the substring Length:");
        int n = sc.nextInt();

       // System.out.println(s.substring(0,n).compareTo(s.substring(s.length()-n,s.length()-1)) > 0 ? s.substring(s.length()-n,s.length()) : s.substring(0,n));
        if(s.substring(0,n).compareTo(s.substring(s.length()-n,s.length()-1)) > 0){
            System.out.println(s.substring(s.length()-n,s.length()));
            System.out.println(s.substring(0,n));

        }
    }
}
