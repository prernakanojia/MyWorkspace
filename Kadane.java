public class Kadane {

    public static int max(int[] a){

        int max_so_far= Integer.MIN_VALUE, max_end_here=0;
        for(int i=0; i<a.length; i++)
        {
            max_end_here=max_end_here+a[i];
            if(max_so_far<max_end_here){
                max_so_far=max_end_here;
            }
            if(max_end_here<0){
                max_end_here=0;
            }
        }
        return max_so_far;

    }

    public static void main(String[] agrs)
    {
        int[] a= {-4,-2,-3,0,1,2};
        System.out.print(max(a));
    }

}
