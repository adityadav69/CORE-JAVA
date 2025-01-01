public class oops {
    public static void main(String[] args) {
        // Student s1=new Student();  //at this time it check either Student class is loaded in and once static variable is loaded and instance variable is loaded
        // Student s2=new Student(); // at this time only instance variable and instable block is assigned because static variable and static instance is loaded once
        System.out.println(Student.country); // we can see that we have not to create object for accessing contry variable beacause country variable is static variable and it can be access directly with the student class.
    }
}

class Student{
    int sid;
    String name;
    static String country="india";

    /*
    
    for instance variable memory will allocate multiple times when we create the object of that class
    but in case of static block memory will only once when class is loaded in the main memory
    Static block and static variable may don't require to object for the accessing

     */

    {
        System.out.println("Instance block");
    }
    static{
        System.out.println("static block");
    }
}
