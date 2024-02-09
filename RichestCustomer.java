// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

import java.util.Scanner;

/**
 * RichestCustomer
 */
public class RichestCustomer {
        public int maximumWealth(int[][] accounts) {
            int ans=0;
           for (int[] customer : accounts){
                int sum=0;
               for (int bank: customer){
                   sum+=bank;
               }
               ans= Math.max(sum, ans);
           }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        System.out.println("Enter the number of bank accounts:");
        int m = sc.nextInt();
        int[][] accs = new int[n][m+1];
        System.out.println("Enter the amount deposited in each account:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                accs[i][j] = sc.nextInt();
            }
        }
        RichestCustomer rc = new RichestCustomer();
        sc.close();
        System.out.println("The richest customer has " + rc.maximumWealth(accs)+" dollars.");
    }
}
