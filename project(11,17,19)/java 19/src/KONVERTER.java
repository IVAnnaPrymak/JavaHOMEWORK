import java.util.Scanner;

public class KONVERTER {
    public static void main(String[] args) {
        double amout;
        double USA,EUR;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Please enter the amount to convert USA = EUR :");
        amout=sc1.nextFloat();
        System.out.println(" your amout is = " + amout);
        EUR=amout *0.93;
        System.out.println( amout+ "  "+ " USA = "+ EUR +" EUR ");
        USA=amout*1.08;
        System.out.println(amout+"  "+ "EUR " + USA +" = USA");

    }
}
