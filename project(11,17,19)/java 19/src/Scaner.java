import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        String s = "Paradise";
        String s2 = "lost";
        System.out.println(s);
        System.out.println(s2);

        Scanner scann = new Scanner(System.in);
        System.out.println("enter word :   ");
        String W1 = scann.nextLine();
        System.out.println(W1);
        int number = W1.length();
        System.out.println(number);

        System.out.println("Pa"+"st");
    }
}
