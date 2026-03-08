// Program to check whether a number is even or odd using a method.
// Demonstrates the use of functions and conditional logic in Java.
import java.util.Scanner;
public class Even_Odd_Method {
    static int evenodd (int a){
        if(a%2==0){
System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        return a;
    }
    public static void main(String[] args) {


        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = evenodd(i);
    }
//        if (i % 2 == 0) {
//            System.out.println("The number entered is even");
//        } else {
//            System.out.println("The number entered is odd");
//
//        }
//    }

}
