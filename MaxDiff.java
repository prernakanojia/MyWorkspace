public class MaxDiff {


    public static int max(int[] a, int n){
        int maxDiff=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]){
                   int diff=a[j]-a[i];
                   if(diff>maxDiff){
                       maxDiff=diff;
                   }
                }
            }
        }
        return maxDiff;
    }

    public static void main(String[] args){
        int[] a={2,3,1,5,6,7};
        int n=a.length;
        System.out.println(max(a,n));
    }
}
