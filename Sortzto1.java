public class Sortzto1 {

    public static void sort(int[] a, int n){

        int temp=0,i=0,mid=0,j=n-1;
while(mid<=j) {
    switch (a[mid]) {
        case 0: {
            temp = a[i];
            a[i] = a[mid];
            a[mid] = temp;
            mid++;
            i++;
            break;
        }
        case 1: {

            mid++;

            break;
        }
        case 2: {
            temp = a[mid];
            a[mid] = a[j];
            a[j] = temp;
            j--;

            break;
        }

    }
}


    }

    public static void main(String[] args){
        int[] a= {1,2,0,0,1,0,2,1,0};
        int n= a.length;
        for(int i=0;i<n;i++){
            sort(a,n);
            System.out.print(a[i]);
        }

    }
}
