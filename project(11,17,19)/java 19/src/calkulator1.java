public class calkulator1 {
    public static void main(String[] args) {
        calkulator summa=new calkulator();
        int a=25;
        int b=5;
        int result=summa.plus1(a, b);
        System.out.println(result);

        calkulator minus=new calkulator();
        int result2=summa.minus2(a, b);
        System.out.println(result2);

        calkulator division=new calkulator();
        int result3=division.division(a,b);
        System.out.println(result3);

        calkulator multipl=new calkulator();
        int result4=multipl.multiplication(a,b);
        System.out.println(result4);
    }
}
