import java.util.Scanner;
public class Even_Odd_Basics {
    public static void main(String[] args) {
        System.out.println("Enter the number");
       Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n%2==0) {
    System.out.println("The entered number is EVEN");
}
else {
    System.out.println("The entered number is ODD");
        }
    }
}