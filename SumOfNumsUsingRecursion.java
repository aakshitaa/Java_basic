public class SumOfNumsUsingRecursion{
    public static int call(int n){
        if(n==1)
        return 1;
        int sum = n+ call(n -1); 
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        //calling the method with 5 as argument
        System.out.println(call(5));
    }
}