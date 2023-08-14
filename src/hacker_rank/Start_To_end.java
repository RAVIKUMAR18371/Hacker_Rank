package hacker_rank;
import java.util.Scanner;
public class Start_To_end {
 //   Given a string, , and two indices,  and , print a substring
    //   consisting of all characters in the inclusive range from  to .
    //   You'll find the String class' substring method helpful in completing
    //   this challenge.
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter start:");
     int start = sc.nextInt();
     System.out.println("Enter End:");
     int end = sc.nextInt();
     System.out.println("Enter the String:");
     String s = sc.next();
     System.out.println(s.substring(start,end));
 }
}
