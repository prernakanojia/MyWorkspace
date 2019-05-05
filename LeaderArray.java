public class LeaderArray {

    public static void  leader(int[] arr,int size)
        {
            for (int i = 0; i < size; i++)
            {
                int j;
                for (j = i + 1; j < size; j++)
                {
                    if (arr[i] <= arr[j])
                        break;
                }
                if (j == size) // the loop didn't break
                    System.out.print(arr[i] + " ");
            }
        }

        public static void main(String[] args)
    {
        int[] a={9,2,3,7,5,4};
        int n=a.length;
        leader(a,n);
    }


}
