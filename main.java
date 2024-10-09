import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2) {
            System.out.println(str1 + " is longer");
        }
        if (len1 < len2) {
            System.out.println(str2 + " is longer");  
        }
        if (len1 == len2) {
            System.out.println("Both strings have the same length");
        }

        int avg1 = len1 / 2;
        int avg2 = len2 /2;

        String half1_1 = str1.substring(0, avg1);
        String half1_2 = str1.substring(avg1);
        String half2_1 = str2.substring(0, avg2);
        String half2_2 = str2.substring(avg2);

        System.out.println("First half: " + half1_1);
        System.out.println("Second half: " + half1_2);
        System.out.println("First half: " + half2_1);
        System.out.println("Second half: " + half2_2);

        int index = str1.indexOf(str2);
        if (index == -1) {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        else {
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }
    }
}