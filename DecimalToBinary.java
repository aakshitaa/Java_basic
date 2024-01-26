public class DecimalToBinary {
    public static void converter(int n){
        String bin = "";
        while (n>0) {
            int rem = n % 2;
            bin = rem + bin;
            n = n/2;
        }
        System.out.println(bin);

    }
    public static void main(String[] args) {
        int num = 4;
        converter(num);
    }
}
