/**
 * @author Lee, JaeJoong, lee2161@purdue.edu
 * @version 7/6/16
 */

public class Merge {
    //Printing arrays
    public  void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr["+i+"] = "+ arr[i]);
        }
    }

    //Making randomized array
    public  static int[] randomArray(int size){
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*20+1);
        }
        System.out.println("Array of " + size + " is made");
        return arr;
    }


    public  void merging (int arr[], int leftBegin, int rightBegin, int rightEnd){
        int leftEnd = rightBegin-1;
        int total = rightEnd - leftBegin+1;
        int index = 0;
        int mergedArr[] = new int[total];

        while (leftBegin <= leftEnd && rightBegin <= rightEnd){
            if (arr[leftBegin] <= arr[rightBegin]){
                mergedArr[index++] = arr[leftBegin++];
            }
            else{
                mergedArr[index++] = arr[rightBegin++];
            }
        }

        while (leftBegin <= leftEnd){
            mergedArr[index++] = arr[leftBegin++];
        }

        while (rightBegin <= rightEnd){
            mergedArr[index++] = arr[rightBegin++];
        }

        for (int i = total - 1; i >= 0; i--, rightEnd--){
            arr[rightEnd] = mergedArr[i];
        }

    }

    public  void mergeSort(int arr[], int left, int right){
        if (left < right){
            int mid = (right + left) /2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merging(arr, left, mid+1, right);
        }
    }
    public static void main(String[] args){
        Merge m = new Merge();
        int arr[] = Merge.randomArray(4);
        int myArr[] = new int[arr.length];
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = arr[i];
        }
        System.out.println("Before the sorting: ");
        m.printArr(myArr);
        m.mergeSort(myArr, 0, myArr.length-1);
        System.out.println("\n\nAfter the sorting: ");
        m.printArr(myArr);
    }
}
