/**
 * @author Lee, JaeJoong, lee2161@purdue.edu
 * @version 7/25/16
 */
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
        };
        return i;
    }

    void quickSort(int arr[], int left, int right){
        int index = partition(arr, left, right);
        if (left < index -1)
            quickSort(arr, left, index-1);
        if(index < right)
            quickSort(arr, index, right);
    }
}
