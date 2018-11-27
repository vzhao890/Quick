public class runner
{
    public static void main(String[] args)
    {
        int[] list1 = {1, 2, 3, 54, 4, 5, 5, 1};
        quickSort.quickSort(list1,1,list1.length-1);
        for(int i=0;i<list1.length;i++)
        {
            System.out.print(" "+list1[i]);
        }
        System.out.println();
    }
}
