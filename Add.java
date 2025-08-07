import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=50;
        System.out.println("Addition of " + a + " and " + b + " is : " + add(a, b));
        System.out.println("Adding some new Features in Addition Function");
        System.out.println("Changes by me Aush in line no. 9");
        sc.close();
        System.out.println("Don't add any features everyone");
        int c=50;
    }
    static int add(int a, int b) {
        return a + b;
    }
}
