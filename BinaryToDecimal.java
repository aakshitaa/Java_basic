import java.util.Scanner;

public class BinaryToDecimal {
    public static void converter(int bin){
        int pow = 0;
        int dec= 0;
        while (bin != 0) {
            int rem = bin % 10;
            dec = dec + rem * (int)Math.pow(2, pow);
            pow++;
            bin = bin / 10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int bin =  sc.nextInt();
            converter(bin);
        }
    }
}
