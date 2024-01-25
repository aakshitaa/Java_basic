public class BinomialCoefficient {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static int getBinomial(int n, int r){
        int ans = fact(n) / (fact(r) * fact(n-r));
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5; 
        int r = 2;
        int output = getBinomial(n, r);
        System.out.println(output);

    }
}
