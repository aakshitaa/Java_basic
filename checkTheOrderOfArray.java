public class checkTheOrderOfArray {
    public static boolean check(int arr[]){
        for(int i = 0; i < arr.length -2; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2,53, 4, 5};
        System.out.println(check(array));
    }
}
