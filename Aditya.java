class Student{
    int sId=3231;
    String name="Aditya yadav";
    final int notChange=3;
    void showDetails(){
        System.out.println("Sid is "+sId);
        System.out.println("Name of the student is "+name);
        System.out.println("Not change "+ notChange);
       // not change it acts as a constant value notChange=32;
        System.out.println("Not change "+ notChange);

    }
}
class Aditya {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.showDetails();
    }
}



