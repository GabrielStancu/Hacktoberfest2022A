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
 
    public static void main(String args[])
    {
        int arr[] = {2, 11, 7, 5, 1, 3};
 
        InsertionSort sorter = new InsertionSort();
        ob.sort(arr);
		
		int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}