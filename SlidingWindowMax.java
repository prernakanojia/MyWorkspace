public class SlidingWindowMax {

    public static void slide(int [] a, int n, int k) {


        int i , max;

        for (i = 0; i < n - k; i++){
            max=a[i];

            for(int j=1; j<k;j++){

                if(a[i+j]>max){
                    max=a[i+j];
                }
            }
            System.out.println(max +" ");
        }
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        int n= arr.length;
        slide(arr, n, k);
    }
}
