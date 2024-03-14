public class ReverseStringWithRecursion {
    public static void printRev(String str, int idx) {
        if (idx < 0) {
            //  System.out.println(str.charAt(idx));
              return;
           }
         System.out.println(str.charAt(idx));
         printRev(str, idx-1);
     }
     public static void main(String[] args) {
        String str = "bsgcvd";
        int indx = str.length();
        printRev(str, indx -1);
     }
     
}
