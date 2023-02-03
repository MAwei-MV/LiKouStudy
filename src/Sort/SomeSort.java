package Sort;

public class SomeSort {
    //冒泡排序
    public static void main(String args[]) {
        int[] arr = new int[]{9, 1, 2, 5, 9, 7, 21, 10};
        SomeSort bs = new SomeSort();
        bs.quickSort(arr,0,arr.length-1);
        for (int val : arr) {
            System.out.println(val);
        }
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            boolean changeFlag = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= val) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = val;
                    changeFlag = true;
                    break;
                }
            }
            if (!changeFlag) arr[0] = val;
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int coreVal = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(arr[j] >= coreVal && i < j) {
                j--;
            }
            arr[i] = arr[j];
            while(arr[i] < coreVal && i < j) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[low] = arr[i];
        arr[i] = coreVal;
        quickSort(arr, low, i);
        quickSort(arr, i+1,high);
    }
}
