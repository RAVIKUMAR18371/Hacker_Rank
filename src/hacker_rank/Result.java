package hacker_rank;
import java.util.Scanner;
import java.time.LocalDate;
public class Result {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

        public static String findDay(String day,String month,String year) {

            int d = Integer.parseInt(month);

            int m = Integer.parseInt(day);

            int y = Integer.parseInt(year);

            LocalDate lt = LocalDate.of(y,m,d);
            return lt.getDayOfWeek().name();

        }
         public static class Solution {

            }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();

        String p = findDay(day, month, year);
        System.out.println(p);
        }
    }


