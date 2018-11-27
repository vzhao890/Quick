public class quickSort
{
    public static void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }

    }
    public static int partition(int[] arr, int left,int right)
    {
        int pivot = arr[right];
        int i = left -1;
        for(int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int temp1=arr[right];
        arr[right]=arr[i+1];
        arr[i+1] = temp1;
        return i+1;
    }

}
