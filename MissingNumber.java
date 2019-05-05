import java.util.Arrays;

public class MissingNumber {

    public static int missing(int[] a, int n){

        Arrays.sort(a);
        int i;
        for(i=1; i<n;i++){
            if(a[i-1]==a[i])
                i++;
            if(a[i-1]+1 != a[i]){
                System.out.println(a[i-1]+1);
            }

        }
        return a[i-1]+1;
    }

    public static void main(String[] args){

        int[] a= {1,2,3,4,4,6};
        int n= a.length;
        missing(a, n);
    }
}
