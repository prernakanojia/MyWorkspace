public class MergeArray {

    public static int[] mergeArray(int[]a, int[]b, int[] c , int l1, int l2, int l3)
    {
        int k=0,j=0,i=0;
    while(i<l1 && j<l2 ){
   //// for ( i = 0; i < l1; i++) {
      //  for ( j = 0; j < l2; j++) {

                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    i++;
                    k++;
                } else if(b[j]<=a[i]){
                    c[k] = b[j];
                    j++;
                    k++;
                }

           // }
        //}
        
   }

while(i<l1 || j<l2){

        if(i<l1)
        {
            c[k]=a[i];
            k++;
            i++;
        }
    if(j<l2)
    {
        c[k]=a[j];
        k++;
        j++;
    }
}


        return c;
    }

    public static void main(String[] args)
    {
        int[] a ={ 1,2,5,20,22};
        int [] b= {2,5,7,10,10,14,18};
        int l1= a.length;
        int l2= b.length;
        int l3= l1+l2;
        int c[] = new int[l3];

        for(int i=0; i<=l3; i++){

        mergeArray(a,b,c,l1,l2, l3);

            System.out.println(c[i]);
        }

    }


}
