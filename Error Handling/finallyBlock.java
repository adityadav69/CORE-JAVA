public class finallyBlock {

    public static int sum(int a,int b){
        try{
            int result=a/b;
            return result;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        finally{
            System.out.println("data wiping out..");//this will execute even function is returned
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println(sum(4,2));
    }
}
