import java.util.Scanner;
public class Largest_of_3_by_user_input {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is the largest number among all");
        } else if (b > c) {
            System.out.println("b is the largest number among all");
        } else {
            System.out.println("c is the largest number among all");
        }
    }
}
