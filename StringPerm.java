class StringPerm{ //print all permutations of a given string
    public static void FindPerm(String str, String permutation){ //str is the given string, and temp is for the permutation
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i < str.length(); i++){
            char current = str.charAt(i);
            String temp = str.substring(0,i) + str.substring(i+1);
            FindPerm(temp, permutation+current);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        FindPerm(str, "");
    }
}