/**
 * @author Lee, JaeJoong, lee2161@purdue.edu
 * @version 7/25/16
 */

import java.util.Arrays;
public class quick {
    int partition(int arr[], int left, int right){
        int pivot = arr[(left+right)/2];
        int i = left;
        int j = right;
        while (i <= j){
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    void quickSort(int arr[], int left, int right){
        int index = partition(arr, left, right);
        //System.out.println("index: " + index);
        if (left < index -1) {
            quickSort(arr, left, index - 1);
            //System.out.println("left < index-1");
        }
        if(index < right)
            quickSort(arr, index, right);
    }

    public static void main(String[] args){
        quick q = new quick();
        int arr[] = {1,3,2,6,4,8,9,3,4,6,7,1,4};
        System.out.println(Arrays.toString(arr));
        q.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
