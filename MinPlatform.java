import java.util.Arrays;

public class MinPlatform {

    public static int minplat(int[] a, int [] d, int n){

        Arrays.sort(a);
        Arrays.sort(d);
        int i=0,j=0, p=1, r=1;

        while(i<n && j<n){

            if(a[i]<d[j]) {
                p++;
                i++;


                if (p > r) {
                    r = p;
                }
            }
            else{
                j++;
                p--;
            }

        }
        return r;
    }


    public static void main(String[] args){

        int a[] ={900, 1100, 1130, 1200, 1230};
        int d[] ={930, 1140, 1210, 1220, 1300};

        int n= a.length;

       System.out.println( minplat(a,d,n));

    }
}
