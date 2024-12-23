public class operator {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
         
        // Byte b1=10;
        // Byte b2=5;
        // Byte byteSum=b1+b2; 
        //Above will throw error because in b1 and b2 value may change in future and it may go out of scope of byte
        // System.out.println("byteSum = "+ byteSum);

      
        int x=10;
        int x1=++x;
        System.out.println(x1);

        int y=12;
        int y1=y++;
        System.out.println(y);
        System.out.println(y1);

        int xx=10;
        int xx1=--xx;
        System.out.println(xx);
        System.out.println(xx1);


        int yy=12;
        int yy1=yy--;
        System.out.println(yy1);
        System.out.println(yy);

        

    }
}
