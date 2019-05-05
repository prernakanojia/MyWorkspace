import java.util.Arrays;

public class ChocolateDistribution {

    public static int findMinDiff(int[]a, int n, int m){
        if(n==0 || m==0)
            return -1;

        if(n<m)
            return -1;
        Arrays.sort(a);
        int minDiff= Integer.MAX_VALUE;
        int f=0,l=0;

        for(int i=0; i+m-1<n;i++){
            int diff= a[i+m-1]- a[i];
            if(diff<minDiff){
                minDiff=diff;
                f=i;
                l=i+m-1;

            }
        }
        return (a[l]-a[f]);
    }





    public static void main(String [] args){

        int [] a= {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28,42, 30, 44, 48, 43, 50};
        int n= a.length;
        int m=7;
        System.out.println(findMinDiff(a,n,m));

    }
}
