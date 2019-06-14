import java.util.*;

public class Main {

    static int square(int x) {
        return x*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int argument=sc.nextInt();
        System.out.println("Number is " +argument);

        int number=square(argument);

        System.out.println("   X=   " +number);
    }
}
