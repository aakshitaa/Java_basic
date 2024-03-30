public class RemoveDuplicatesInString {
    public static Boolean[] arr = new Boolean[26];

    // Initialize array elements to false
    static {
        for (int i = 0; i < 26; i++) {
            arr[i] = false;
        }
    }

    public static void remove(String str, int index, String ans) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        if (arr[(str.charAt(index) - 'a')]) // No need to compare with true
            remove(str, index + 1, ans);
        else {
            arr[(str.charAt(index) - 'a')] = true;
            ans += str.charAt(index);
            remove(str, index + 1, ans);
        }
    }

    public static void main(String[] args) {
        remove("abbaaccdaed", 0, "");
    }
}
