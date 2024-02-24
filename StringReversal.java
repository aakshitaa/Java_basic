public class StringReversal{
    public static StringBuilder reverseString(StringBuilder s){
        for(int i=0; i<s.length()/2; i++){
            int frontIndex = i;
            int backIndex = s.length() -1 -i;
            char frontIndexChar = s.charAt(frontIndex);
            char backIndexChar = s.charAt(backIndex);
            s.setCharAt(frontIndex, backIndexChar);
            s.setCharAt(backIndex, frontIndexChar);
        }
        return s;
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Heyya my name is aakshita");
       System.out.println(reverseString(s));
    }
}