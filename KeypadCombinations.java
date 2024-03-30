class KeypadCombinations{
    public static String[] keypad = {".","abc","def","ghi","jkl", "mno","pqrs","tuv","wxyz"};
    public static void combinations(String str, String ans, int index){
        if (index == str.length())
        {
            System.out.println(ans);
            return;
        }
        char curr= str.charAt(index); //23 is given -> curr = 2 first then 3
        String currKeypad = keypad[curr - '0'];
        for (int i=0; i<currKeypad.length(); i++){
            combinations(str, ans+currKeypad.charAt(i), index+1); //add char by char to answer
    }
}
public static void main(String[] args) {
    String inputStr="23";//input
    combinations(inputStr, "", 0);
}
}