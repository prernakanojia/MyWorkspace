public class AliceBob {

    public static int solution(int[] A, int K, int L) {
        // write your code in Java SE 8

        int i;
        int max;
        int total = 0;
        int n = A.length;

        if (K + L > n)
            return -1;

        int max1 = slide(A, K);
        int max2 = slide(A, L);
        int s1=0;
        for(int x=0; x<K; x++){
            s1= s1+A[x];
        }
        int Karr[] = new int[n];
        for(int z=0; z<n; z++){

        }

        int s2=0;
        for(int y=0; y<L; y++){
            s2=s2+A[y];
        }

        total = max1 + max2;

        return total;

    }

    public static int slide(int[] A, int N) {

        int i, max = 0;
        int l = A.length;

        for (i = 0; i < l - N; i++) {
            max = A[i];

            for (int j = 1; j < N; j++) {

                if (A[i + j] > max) {
                    max = A[i + j];
                }
            }
            //System.out.println(max + " ");
        }
        return max;
    }


    public static void main(String[] args) {

        int [] a={6,1,4,6,3,2,7,4};
        int k= 3;
        int l= 2;
       System.out.println(slide(a,k));
        System.out.println(slide(a,l));
       System.out.println( solution(a,k,l));

    }
}