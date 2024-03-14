public class SelectionSort {
    public static int [] sort (int arr[]){
        for(int i=0; i< arr.length -  1; i++){
            int minIndex= i;
            for (int j=i; j< arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {9, 8, 4 ,3 ,7, 1};
        arr = sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
