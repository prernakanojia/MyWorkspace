public class SubCredit {

    public static int subcred(int[] sub, int [] st, int n, int m){
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(st[i]>=sub[j]){
                    count++;
                  // System.out.println(count);

                }
            }
        }
        return count;

    }

    public static void main(String [] args){
       int[] Subjects={3,4,1,2};
       int[] students={5,3};
       int n=students.length;
       int m= Subjects.length;
      System.out.println(subcred(Subjects, students,n,m));
    }

}
