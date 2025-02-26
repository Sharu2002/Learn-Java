package Sorting;

public class SelectionSort {
    public static void Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minValue = arr[i];
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = temp;

        }
        
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int[] arr = {30,20,50,40,10,45};
        Sort(arr);
    }
}
