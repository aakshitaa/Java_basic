class Fibbonacci{
    public static void main(String[] args) {
        int  a = 5;
        int f=1;
        for ( int i=1 ; i<=a ; i++){
            f=f*i;
        }
        System.out.println("Fibonacci series of " + f);
    }
}