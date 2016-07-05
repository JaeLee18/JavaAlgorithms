/**
 * Created by jaejoong on 7/4/16.
 */
public class BubbleSort {
    //Generate a specific amount of array randomly.

    public static int[] randomArray(int size){
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*10+1);
        }
        return arr;
    }

    //Bubble Sorting
    public static void bubblesort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[i] < arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("i: " + i + " arr[i]: " + arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = BubbleSort.randomArray(4);
        BubbleSort.printArr(arr);
        System.out.println("After the bubble sort");

        BubbleSort.bubblesort(arr);
        BubbleSort.printArr(arr);

    }





}
