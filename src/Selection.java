/**
 * @author Lee, JaeJoong, lee2161@purdue.edu
 * @version 7/5/16
 */
public class Selection {
    //Printing arrays
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("i: " + i + " arr[i]: " + arr[i]);
        }
    }

    //Making randomized array
    public static int[] randomArray(int size){
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*20+1);
        }
        return arr;
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] <  arr[index])
                    index = j;
            }
            if (index != i){
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = Selection.randomArray(3);
        Selection.printArr(arr);
        System.out.println("After the selection sort");
        Selection.selectionSort(arr);
        Selection.printArr(arr);


    }

}
