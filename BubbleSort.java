public class BubbleSort {
    public static int [] sort (int arr[]){
        for(int i=0; i < arr.length-1 ; i++){
            //get till the end
            for(int j=0; j < arr.length-1-i; j++){
                //swap to get max value at end
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
