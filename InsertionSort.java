public class InsertionSort {
	
    void sort(int arr[])
    {
        int k = arr.length;
        for (int i = 1; i < k; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}