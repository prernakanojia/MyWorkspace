public class ReverseString {

    public static void reverse(int[] a) {
        int l= a.length;
        for(int i=l-1;i<=0;i--) {
            System.out.println(a[i]);

        }

    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        reverse(a);
        //System.out.println(reverse(a));

    }

}
