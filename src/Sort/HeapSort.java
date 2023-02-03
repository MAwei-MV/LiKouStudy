package Sort;

public class HeapSort {

    public static void main(String args[]) {
        int arr[] = new int[]{2,3,1,5,4,7,8,4};
        HeapSort sort = new HeapSort();
        sort.heapSort(arr);
        for (int i =0 ; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void heapSort(int arr[]) {
        int len = arr.length;
        //找到第一个非叶子结点
        for (int i = len/2 - 1; i>=0; i --) {
            adjustHeap(arr,i,len);
        }
        for (int j = len-1;j>=0;j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    public void adjustHeap(int arr[], int i, int length) {
        int temp = arr[i];
        for (int k = 2*i+1; k<length; k = 2*k+1) {
            if (k+1<length && arr[k+1] > arr[k]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    public void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
