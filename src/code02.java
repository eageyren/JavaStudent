/**
 * @author eageyren
 * @Description 选择排序，冒泡排序，插入排序
 * @date 2026年08月03日上午10:04
 */
public class code02 {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;//当前找到的最小元素的位置
            for (int j = i + 1; j < N; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            swap(arr, i, min);
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    public static void insertSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int num = end;//当前要插入的数的位置
            while (num - 1 >= 0 && arr[num - 1] > arr[num]) {
                swap(arr, num - 1, num);
                num--;
            }
        }
    }

    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
                //pre是数的位置，arr[pre] 才是数值
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 3, 9, 1, 4};
        System.out.println("选择排序");
        selectSort(arr);
        printArray(arr);
        System.out.println("冒泡排序");
        bubbleSort(arr);
        printArray(arr);
        System.out.println("插入排序1");
        insertSort1(arr);
        printArray(arr);
        System.out.println("插入排序2");
        insertSort2(arr);
        printArray(arr);
    }
}
