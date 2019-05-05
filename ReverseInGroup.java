public class ReverseInGroup {


        public static void reverse(int [] a, int n, int k) {


            int i;
            for(i=0;i<n;i=i+k)
            {
                int left= i;
                int right= Math.min(i+k-1, n-1);
                int temp;

                while(left<right){
                    temp= a[left];
                    a[left]= a[right];
                    a[right]= temp;
                    left++;
                    right--;
                }


            }
            }




        public static void main(String args[])
        {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int k = 4;
            int n= arr.length;
           reverse(arr, n, k);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }


