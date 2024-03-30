public class CheckSortedArray {
    public static boolean Check(int arr[], int index){
        if (index == arr.length - 1) return true;
        if (arr[index] >=arr[index + 1]) return false;
        return Check(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {9,14,56,72};
        System.out.println(Check(arr, 0));
    }
}
