import java.util.Arrays;

public class KthSmallestElement {

    public static int small(int[] a, int n, int k){

        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(k>n)
                break;

            System.out.println(a[k]);
        }
return a[k];
    }




    public static void main(String[] args) {

        int[] a = {2, 5, 3, 8, 9, 1, 7};
        int n = a.length;
        int k = 3;
        Arrays.sort(a);

            System.out.println(a[k-1]);


    }


}
