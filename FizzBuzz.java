import java.util.*;
class FizzBuzz {
    public static void fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n) ;
        for (int i =1; i <=n; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
             if (divisibleBy3 && divisibleBy5)
             answer.add("FizzBuzz");
             else if (divisibleBy3)
             answer.add("Fizz");
             else if (divisibleBy5)
             answer.add("Buzz");
             else 
            answer.add(String.valueOf(i));
        }
       System.out.println(answer);
    }
    public static void main(String[] args) {
        int n=15;
        fizzBuzz(n);
    }
}