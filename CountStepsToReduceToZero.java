public class CountStepsToReduceToZero {
    public static int numberOfSteps(int n) {
        int count=0;
        while (n != 0){
            boolean isEven = n%2 ==0;
            if (isEven) 
            n /=2;
            else 
            n--;
            count++;
        }
    return count;
    }
    public static void main(String[] args) {
       int n = numberOfSteps(70);
       System.out.println(n);
    }
}
//Space complexity O(1)
//Time Complexity O(logn)