public class Array {
    public static void main(String[] args) {
        //Static Array initializtion

        int a[]={11,22,33,44,55}; 
        // System.out.println(a); // [I@372f7a8d  hashcode print since Array is a object
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //Dynamic Array Initialization

        int b[]=new int[5];
        // System.out.println(b); // [I@2f92e0f4 hashcode

        // for(int i=0;i<b.length;i++){
        //     System.out.println(b[i]);
        // }

        b[0]=101;
        b[1]=202;
        b[2]=303;
        b[3]=404;
        b[4]=505;

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        
        //MultiDimensional Array
        int ab[][]=new int[2][2];
        ab[0][0]=21;
        ab[0][1]=21;
        ab[1][0]=21;
        ab[1][1]=21;
        ab[0][2]=22;

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.println(ab[i][j]);
            }
        }
        // System.out.println("ab[0][2]"+ab[0][2]); //  Index 2 out of bounds for length 2

    }
}
