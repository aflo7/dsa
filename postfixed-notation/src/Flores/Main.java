package Flores;

public class Main {

    public static void main(String[] args) {
        String thisToken;
        String mathExpression;
        StringTokenizer i = new StringTokenizer();
        String a = "1";
        String b = "-1";
        String c = "1+1";
        String d = "1 1 +";
        String e = "1 -1 +";

        System.out.println("Expected: 1" + " Gotten: " + i.postfix(a)); // positive number

        System.out.println("Expected: -1" + " Gotten: " + i.postfix(b)); // negative number

        System.out.println("Expected: 1+1" + " Gotten: " + i.postfix(c)); // simple addition

        System.out.println("Expected:  1 + 1 " + " Gotten: " + i.postfix(d)); // simple addition with whitechars

        System.out.println("Expected:  1 + +1 " + " Gotten: " + i.postfix(e)); // simple addition with pos. number & whitechars

    }

}
