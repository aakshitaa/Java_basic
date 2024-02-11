public class ramsomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        String temp = new String();
        int index = -1;
        for (int i =0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);
            index= -1;
            for (int j = 0; j < magazine.length(); j++){
                char m = magazine.charAt(j);
                if (m == r){
                    index=  j;
                    temp = magazine.substring(0,index)+ magazine.substring(index +1);
                    magazine = temp;
                }

            }
        }
        if (index == -1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aabg","agabsh"));;
    }
}
