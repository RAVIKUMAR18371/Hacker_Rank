package hacker_rank;
import java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println("Enter the other String: ");
        String str1 = sc.next();
        System.out.println(str.length() + str1.length());

        if(str.contentEquals(str1)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
                   //   or
     //   System.out.println(str.compareTo(str1) > 0 ? "Yes" : "No");

        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1) + " "+ str1.substring(0,1).toUpperCase() + str.substring(1));


    }
}
