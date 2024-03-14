public class FirstLastOccurenceRecursion {
    public static int first = -1 , last = -1;
    public static void calcOcc(String str,char c,int index){
        if (index == str.length()){
            System.out.println( "Last character occurrence is at index "+last);
            System.out.println( "First character occurrence is at index "+first);
            return;
        }
        if (str.charAt(index) == c)
        {
            if (first == -1 && last == -1){
            first = index;
            last = index;
        }
            else
            last = index;
        }
        calcOcc(str, c, index+1);

    }  

    public static void main(String[] args) {
        String str = "bcdabce";
        char c = 'a';
        calcOcc(str, c, 0);
    }
}
