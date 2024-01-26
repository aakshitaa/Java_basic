import java.util.Scanner;

public class PrimeorNot {
    public static void check(int n){
        for (int i = 2 ; i < n ; i++){
            if (n % i == 0){
            System.out.println("The number is not prime");
            return;
        }
        }
        System.out.println("The number is prime");
        return;
        
    } 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number");
            int x =  sc.nextInt();
            check(x);
        }

    }
}
