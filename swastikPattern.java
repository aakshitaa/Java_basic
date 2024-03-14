public class swastikPattern {
    public static void main(String[] args){
    int n=3;
    for (int i=1; i<=7 +1; i++) {
        for (int j=1; j<=5; j++) {
                if (i == n || j==n){
                    System.out.print("* ");
                }
                else 
                System.out.print(" ");
    }
    System.out.println();
    }
}
}