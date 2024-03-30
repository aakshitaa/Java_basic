import java.util.HashSet;
public class Subsequences {
    public static void CalcSubsequences(String str, int index, String ans){
        if(index == str.length()){
            HashSet<String> set = new HashSet<String>();
            set.add(ans);
            System.out.println(ans);
            return;
        }
        char c= str.charAt(index);
        //included in subsequence
        CalcSubsequences(str, index+1, ans+c);
        //excluded in subsequence
        CalcSubsequences(str, index+1, ans);
    }
    public static void main(String[] args) {
        String str = "aa";
        CalcSubsequences(str, 0, "");
    }
}

//Time complexity of this  is O(2^n) Based on permutations and combinations formed (each character has two choices - include or exclude) 
// ToDo: consider for unique subsequences