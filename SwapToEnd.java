class SwapToEnd{
    public static String swap(String s, String ans, int index, char c, String temp){
        if ( index == s.length()){
            ans+= temp;
            return ans;
        }
        if (s.charAt(index) != c)
        ans+= s.charAt(index);
        else
        temp+=s.charAt(index);
        return swap(s, ans, index+1, c, temp);

    }
    public static void main(String[] args) {
        String str= "hvabaababaa";
        System.out.println(swap(str, "", 0, 'e', ""));
    }
}