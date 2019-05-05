public class SubArraySum {

    public static int sumArray(int[] a, int n, int sum){
        int curSum, i, j;

        for( i=0; i<n; i++){
             curSum = a[i];
            for(j=i+1; j<=n;j++) {

                if (curSum == sum) {
                    int p= j-1;
                    System.out.println("sum found at intex" + i + "and" + p);
                    return 1;
                }

                    if(curSum>sum ||j==n)
                    break;
                        curSum= curSum+ a[j];



            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] a={1,2,4,7,9,3};
        int n=a.length;
        int s= 13;
        sumArray(a,n,s);
    }



}
