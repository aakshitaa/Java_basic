public class ramsomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        String temp = new String();
        for (int i =0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);
            int index = magazine.indexOf(r);
            if (index == -1){
                return false;
            }
            magazine = magazine.substring(0, index )+  magazine.substring(index + 1);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aabg","agabsh"));;
    }
}
